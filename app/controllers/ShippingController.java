package controllers;

import java.sql.SQLException;

import javax.inject.Inject;

import daos.ShippingDAO;
import play.mvc.Result;

public class ShippingController extends DefaultController{

	private final ShippingDAO dao;

    @Inject
    public ShippingController(ShippingDAO dao) {
		this.dao = dao;
    }

    public Result shippingMethods() throws SQLException {
		return okJSON(dao.list());
    }


}