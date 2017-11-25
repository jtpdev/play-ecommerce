package controllers;

import play.mvc.Result;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends DefaultController {

    
    public Result index() {
        return ok(views.html.index.render());
    }
    
}
