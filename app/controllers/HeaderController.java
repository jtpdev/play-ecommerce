package controllers;

import java.sql.SQLException;

import javax.inject.Inject;

import daos.CategoryDAO;
import play.mvc.Result;

public class HeaderController extends DefaultController{

	private final CategoryDAO dao;

    @Inject
    public HeaderController(CategoryDAO dao) {
		this.dao = dao;
    }

    public Result categories() throws SQLException {
		return okJSON(dao.list());
    }


}