package utils;

import java.io.Serializable;

public class ControllerUtil implements Serializable {/*
	

	private static final long serialVersionUID = 1L;
	private final Result result;
	private final ProductDAO productDAO;
	private final CategoryDAO categoryDAO;
	private final UserVO userVO;
	private final CartVO cart;
	

	@Inject
	public ControllerUtil(Result result, ProductDAO productDAO, UserVO userVO, CategoryDAO categoryDAO, CartVO cart) {
		this.result = result;
		this.productDAO = productDAO;
		this.userVO = userVO;
		this.categoryDAO = categoryDAO;
		this.cart = cart;
	}
	
	public void writeHeader() throws SQLException {
		result.include("categories", categoryDAO.list());
		result.include("specials", productDAO.listSpecialVO());
		// TODO Change here to go to the user's dashboard
		String message = userVO.getLogged() ? userVO.getName()
				: "Login here!";
		result.include("usermessage", message);
		result.include("total", cart.getTotal());
	}

*/}
