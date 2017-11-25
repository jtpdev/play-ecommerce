
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/User/Documents/projetos/ecommerce-play/conf/routes
// @DATE:Fri Nov 24 11:45:42 BRST 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:32
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseCartController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def cart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.cart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart"})
        }
      """
    )
  
    // @LINE:21
    def addShipping: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.addShipping",
      """
        function(shipping_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shipping/add/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("shipping_id", shipping_id0))})
        }
      """
    )
  
    // @LINE:17
    def plus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.plus",
      """
        function(product_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart/plus/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("product_id", product_id0))})
        }
      """
    )
  
    // @LINE:13
    def cartTotal: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.cartTotal",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart/total"})
        }
      """
    )
  
    // @LINE:12
    def products: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.products",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sale"})
        }
      """
    )
  
    // @LINE:16
    def add: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.add",
      """
        function(product_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart/add/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("product_id", product_id0))})
        }
      """
    )
  
    // @LINE:19
    def remove: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.remove",
      """
        function(product_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart/remove/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("product_id", product_id0))})
        }
      """
    )
  
    // @LINE:18
    def addQtd: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.addQtd",
      """
        function(product_id0,qtd1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("product_id", product_id0)) + "/add/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("qtd", qtd1))})
        }
      """
    )
  
    // @LINE:20
    def removeAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.removeAll",
      """
        function(product_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart/removeall/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("product_id", product_id0))})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseCategoryController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def category: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.category",
      """
        function(category_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "category/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("category_id", category_id0))})
        }
      """
    )
  
    // @LINE:9
    def products: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.products",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseHeaderController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def categories: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HeaderController.categories",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categories"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseProductController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def specials: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.specials",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "specials"})
        }
      """
    )
  
    // @LINE:23
    def product: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.product",
      """
        function(product_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("product_id", product_id0))})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def user: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.user",
      """
        function(uri0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("uri", uri0))})
        }
      """
    )
  
    // @LINE:29
    def uri: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.uri",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "uri"})
        }
      """
    )
  
    // @LINE:24
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.login",
      """
        function(uri0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("uri", uri0))})
        }
      """
    )
  
    // @LINE:27
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.addUser",
      """
        function(user0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adduser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[vos.UserVO]].javascriptUnbind + """)("user", user0))})
        }
      """
    )
  
    // @LINE:28
    def logedUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.logedUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logeduser"})
        }
      """
    )
  
    // @LINE:26
    def doLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.doLogin",
      """
        function(user0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dologin/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[vos.UserVO]].javascriptUnbind + """)("user", user0))})
        }
      """
    )
  
    // @LINE:10
    def logged: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.logged",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logged"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseShippingController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def shippingMethods: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShippingController.shippingMethods",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shipping"})
        }
      """
    )
  
  }


}
