package controllers;

import java.sql.SQLException;

import javax.inject.Inject;

import daos.ProductDAO;
import play.mvc.Result;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class CategoryController extends DefaultController {

	private ProductDAO productDAO;
	private Long category_id;


	@Inject
	public CategoryController(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}
	
	public Result category(Long category_id) throws SQLException{
		this.category_id = category_id;
		return ok(views.html.category.render());
	}

	public Result products() throws SQLException{
		return okJSON(productDAO.listByCategory(category_id));
	}

}
