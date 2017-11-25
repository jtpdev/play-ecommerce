package controllers;

import java.sql.SQLException;

import javax.inject.Inject;

import daos.UserDAO;
import play.mvc.Result;
import vos.UserVO;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class UserController extends DefaultController {

	private UserDAO dao;
	private UserVO vo;
	private String uri;

	@Inject
	public UserController(UserDAO dao, UserVO vo) {
		this.dao = dao;
		this.vo = vo;
	}
	
	public Result login(String uri) {
		this.uri = uri.replace(".", "/");
		if(vo.getLogged()) {
			return redirect(uri);
		}
		return ok(views.html.login.render());
	}
	
	public Result user(String uri) {
		this.uri = uri.replace("|", "/");
		if(vo.getLogged()) {
			return redirect("/login/" + uri);
		}
		return ok(views.html.user.render());
	}
	
	public Result uri() {
		return ok(uri != null ? uri.replace("/", "|") : "/");
	}
	
	public Result doLogin(UserVO vo) throws SQLException {
		this.vo = vo;
		if(vo.getLogged()) {
			return redirect(uri);
		}
		dao.login(vo);
		if(vo.getLogged()){
			return redirect(uri);
		}else{
			return ok("Incorrect login... Try again!");
		}
	}
	
	public Result addUser(UserVO vo) throws SQLException {
		this.vo = vo;
		if(vo.getLogged()) {
			return redirect(uri);
		}
		dao.save(vo.toModel());
		if(vo.getLogged()){
			return redirect(uri);
		}else{
			return ok("Incorrect login... Try again!");
		}
	}

	public Result logedUser() throws SQLException {
		return okJSON(vo);
	}
	    
    public Result logged() throws SQLException {
    	return ok(vo.getLogged() ? vo.getName()
				: "Login here!");
    }
    
}
