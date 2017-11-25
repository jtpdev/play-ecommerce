package vos;

import java.io.Serializable;
import java.sql.SQLException;

import javax.inject.Inject;

import daos.UserDAO;
import models.EType;
import models.User;
import play.mvc.PathBindable;

public class UserVO implements VO<User>, Serializable, PathBindable<UserVO>{
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String email;
	private String password;
	private EType type;
	private Boolean logged = Boolean.FALSE;
	
	@Inject
	private UserDAO dao;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getLogged() {
		return logged;
	}

	public void setLogged(Boolean logged) {
		this.logged = logged;
	}
	
	public EType getType() {
		return type;
	}
	
	public void setType(EType type) {
		this.type = type;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public User toModel() {
		User user = new User();
		user.setId(getId());
		user.setType(getType());
		user.setEmail(getEmail());
		user.setPassword(getPassword());
		return user;
	}

	@Override
	public UserVO toVO(User model) {
		setId(model.getId());
		setName(model.getName());
		setType(model.getType());
		setLogged(model.getId() != null);
		return this;
	}

	@Override
	public UserVO bind(String key, String id) {
		UserVO user = null;
		try {
			user = new UserVO().toVO(dao.find(Long.valueOf(id)));
		} catch (NumberFormatException | SQLException e) {
			e.printStackTrace();
		}
        if (user != null) {
            return user;
        } else {
            throw new IllegalArgumentException("User with id: " + id + " not found");
        }
	}

	@Override
	public String unbind(String key) {
		return id + "";
	}

	@Override
	public String javascriptUnbind() {
		return "function(k,v) {\n" +
	             "    return v.id;" +
	             "}";
	}

}
