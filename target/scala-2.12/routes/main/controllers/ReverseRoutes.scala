
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/User/Documents/projetos/ecommerce-play/conf/routes
// @DATE:Fri Nov 24 11:45:42 BRST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:32
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:11
  class ReverseCartController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def cart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart")
    }
  
    // @LINE:21
    def addShipping(shipping_id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "shipping/add/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("shipping_id", shipping_id)))
    }
  
    // @LINE:17
    def plus(product_id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart/plus/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("product_id", product_id)))
    }
  
    // @LINE:13
    def cartTotal(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart/total")
    }
  
    // @LINE:12
    def products(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sale")
    }
  
    // @LINE:16
    def add(product_id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart/add/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("product_id", product_id)))
    }
  
    // @LINE:19
    def remove(product_id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart/remove/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("product_id", product_id)))
    }
  
    // @LINE:18
    def addQtd(product_id:Long, qtd:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("product_id", product_id)) + "/add/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("qtd", qtd)))
    }
  
    // @LINE:20
    def removeAll(product_id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart/removeall/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("product_id", product_id)))
    }
  
  }

  // @LINE:9
  class ReverseCategoryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def category(category_id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("category_id", category_id)))
    }
  
    // @LINE:9
    def products(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products")
    }
  
  }

  // @LINE:7
  class ReverseHeaderController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def categories(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categories")
    }
  
  }

  // @LINE:8
  class ReverseProductController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def specials(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "specials")
    }
  
    // @LINE:23
    def product(product_id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("product_id", product_id)))
    }
  
  }

  // @LINE:10
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def user(uri:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("uri", uri)))
    }
  
    // @LINE:29
    def uri(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "uri")
    }
  
    // @LINE:24
    def login(uri:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("uri", uri)))
    }
  
    // @LINE:27
    def addUser(user:vos.UserVO): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "adduser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[vos.UserVO]].unbind("user", user)))
    }
  
    // @LINE:28
    def logedUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logeduser")
    }
  
    // @LINE:26
    def doLogin(user:vos.UserVO): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dologin/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[vos.UserVO]].unbind("user", user)))
    }
  
    // @LINE:10
    def logged(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logged")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:14
  class ReverseShippingController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def shippingMethods(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "shipping")
    }
  
  }


}
