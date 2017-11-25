package controllers;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class DefaultController extends Controller {
	
	protected Result okJSON(Object content) {
		return ok(Json.toJson(content));
	}

}
