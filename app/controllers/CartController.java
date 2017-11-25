package controllers;

import java.math.BigDecimal;
import java.sql.SQLException;

import javax.inject.Inject;

import daos.ProductDAO;
import daos.ShippingDAO;
import play.mvc.Result;
import utils.ProductUtil;
import vos.CartVO;
import vos.ProductVO;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class CartController extends DefaultController {
	
	private ProductDAO productDAO;
	private CartVO cart;
	private ShippingDAO shippingDAO;


	@Inject
	public CartController(ProductDAO productDAO, CartVO cart, ShippingDAO shippingDAO) {
		this.productDAO = productDAO;
		this.cart = cart;
		this.shippingDAO = shippingDAO;
	}
	
	public Result cart() throws SQLException {
		return ok(views.html.cart.render());
	}
	
	public Result cartTotal() throws SQLException {
		return okJSON(cart);
	}
	
	public Result products() throws SQLException {
		return okJSON(ProductUtil.getProductsVO(cart.getProducts()));
	}
	
	public Result add(Long product_id) throws SQLException {
		cart.add(new ProductVO().toVO(productDAO.find(product_id)));
		
		return okJSON(cart);
	}
	
	public Result plus(Long product_id) throws SQLException {
		cart.add(new ProductVO().toVO(productDAO.find(product_id)));
		updateShippingValue();
		return okJSON(ProductUtil.getProductsVO(cart.getProducts()));
	}

	public Result addQtd(Long product_id, Long qtd) throws SQLException {
		cart.add(new ProductVO().toVO(productDAO.find(product_id)), qtd);
		updateShippingValue();
		return okJSON(ProductUtil.getProductsVO(cart.getProducts()));
	}

	public Result remove(Long product_id) {
		cart.remove(product_id);
		updateShippingValue();
		return okJSON(ProductUtil.getProductsVO(cart.getProducts()));
	}
	
	public Result removeAll(Long product_id) {
		cart.removeAll(product_id);
		updateShippingValue();
		return okJSON(ProductUtil.getProductsVO(cart.getProducts()));
	}
	
	public Result addShipping(Long shipping_id) throws SQLException {
		cart.setShipping(shippingDAO.find(shipping_id));
		updateShippingValue();
		return okJSON(cart);
	}

	private void updateShippingValue() {
		if(cart.getShipping() != null)
			cart.setShippingValue(cart.getSubTotal().multiply(BigDecimal.valueOf(0.1))); // TODO only for tests
	}
	
	
}
