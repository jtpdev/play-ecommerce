package controllers;

import java.sql.SQLException;

import javax.inject.Inject;

import daos.ProductDAO;
import play.mvc.Result;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class ProductController extends DefaultController {

	private ProductDAO productDAO;
	private Long product_id;

	@Inject
	public ProductController(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}
	    
    public Result product(Long product_id) throws SQLException {
    	this.product_id = product_id;
		return ok(views.html.product.render());
    }
    
    public Result specials() throws SQLException {
    	return okJSON(productDAO.listSpecialVO());
    }

}
