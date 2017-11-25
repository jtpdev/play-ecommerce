
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/User/Documents/projetos/ecommerce-play/conf/routes
// @DATE:Fri Nov 24 11:45:42 BRST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:7
  HeaderController_1: controllers.HeaderController,
  // @LINE:8
  ProductController_2: controllers.ProductController,
  // @LINE:9
  CategoryController_5: controllers.CategoryController,
  // @LINE:10
  UserController_3: controllers.UserController,
  // @LINE:11
  CartController_4: controllers.CartController,
  // @LINE:14
  ShippingController_6: controllers.ShippingController,
  // @LINE:32
  Assets_7: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:7
    HeaderController_1: controllers.HeaderController,
    // @LINE:8
    ProductController_2: controllers.ProductController,
    // @LINE:9
    CategoryController_5: controllers.CategoryController,
    // @LINE:10
    UserController_3: controllers.UserController,
    // @LINE:11
    CartController_4: controllers.CartController,
    // @LINE:14
    ShippingController_6: controllers.ShippingController,
    // @LINE:32
    Assets_7: controllers.Assets
  ) = this(errorHandler, HomeController_0, HeaderController_1, ProductController_2, CategoryController_5, UserController_3, CartController_4, ShippingController_6, Assets_7, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, HeaderController_1, ProductController_2, CategoryController_5, UserController_3, CartController_4, ShippingController_6, Assets_7, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categories""", """controllers.HeaderController.categories"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """specials""", """controllers.ProductController.specials"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.CategoryController.products"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logged""", """controllers.UserController.logged"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart""", """controllers.CartController.cart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sale""", """controllers.CartController.products"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart/total""", """controllers.CartController.cartTotal"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shipping""", """controllers.ShippingController.shippingMethods"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart/add/""" + "$" + """product_id<[^/]+>""", """controllers.CartController.add(product_id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart/plus/""" + "$" + """product_id<[^/]+>""", """controllers.CartController.plus(product_id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart/""" + "$" + """product_id<[^/]+>/add/""" + "$" + """qtd<[^/]+>""", """controllers.CartController.addQtd(product_id:Long, qtd:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart/remove/""" + "$" + """product_id<[^/]+>""", """controllers.CartController.remove(product_id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart/removeall/""" + "$" + """product_id<[^/]+>""", """controllers.CartController.removeAll(product_id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shipping/add/""" + "$" + """shipping_id<[^/]+>""", """controllers.CartController.addShipping(shipping_id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """category/""" + "$" + """category_id<[^/]+>""", """controllers.CategoryController.category(category_id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/""" + "$" + """product_id<[^/]+>""", """controllers.ProductController.product(product_id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/""" + "$" + """uri<[^/]+>""", """controllers.UserController.login(uri:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""" + "$" + """uri<[^/]+>""", """controllers.UserController.user(uri:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dologin/""" + "$" + """user<[^/]+>""", """controllers.UserController.doLogin(user:vos.UserVO)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adduser/""" + "$" + """user<[^/]+>""", """controllers.UserController.addUser(user:vos.UserVO)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logeduser""", """controllers.UserController.logedUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """uri""", """controllers.UserController.uri"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HeaderController_categories1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categories")))
  )
  private[this] lazy val controllers_HeaderController_categories1_invoker = createInvoker(
    HeaderController_1.categories,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HeaderController",
      "categories",
      Nil,
      "GET",
      this.prefix + """categories""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_ProductController_specials2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("specials")))
  )
  private[this] lazy val controllers_ProductController_specials2_invoker = createInvoker(
    ProductController_2.specials,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "specials",
      Nil,
      "GET",
      this.prefix + """specials""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_CategoryController_products3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_CategoryController_products3_invoker = createInvoker(
    CategoryController_5.products,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "products",
      Nil,
      "GET",
      this.prefix + """products""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_UserController_logged4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logged")))
  )
  private[this] lazy val controllers_UserController_logged4_invoker = createInvoker(
    UserController_3.logged,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "logged",
      Nil,
      "GET",
      this.prefix + """logged""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_CartController_cart5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_CartController_cart5_invoker = createInvoker(
    CartController_4.cart,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "cart",
      Nil,
      "GET",
      this.prefix + """cart""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_CartController_products6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sale")))
  )
  private[this] lazy val controllers_CartController_products6_invoker = createInvoker(
    CartController_4.products,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "products",
      Nil,
      "GET",
      this.prefix + """sale""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_CartController_cartTotal7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/total")))
  )
  private[this] lazy val controllers_CartController_cartTotal7_invoker = createInvoker(
    CartController_4.cartTotal,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "cartTotal",
      Nil,
      "GET",
      this.prefix + """cart/total""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ShippingController_shippingMethods8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shipping")))
  )
  private[this] lazy val controllers_ShippingController_shippingMethods8_invoker = createInvoker(
    ShippingController_6.shippingMethods,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShippingController",
      "shippingMethods",
      Nil,
      "GET",
      this.prefix + """shipping""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_CartController_add9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/add/"), DynamicPart("product_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CartController_add9_invoker = createInvoker(
    CartController_4.add(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "add",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """cart/add/""" + "$" + """product_id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_CartController_plus10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/plus/"), DynamicPart("product_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CartController_plus10_invoker = createInvoker(
    CartController_4.plus(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "plus",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """cart/plus/""" + "$" + """product_id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_CartController_addQtd11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/"), DynamicPart("product_id", """[^/]+""",true), StaticPart("/add/"), DynamicPart("qtd", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CartController_addQtd11_invoker = createInvoker(
    CartController_4.addQtd(fakeValue[Long], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "addQtd",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      this.prefix + """cart/""" + "$" + """product_id<[^/]+>/add/""" + "$" + """qtd<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_CartController_remove12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/remove/"), DynamicPart("product_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CartController_remove12_invoker = createInvoker(
    CartController_4.remove(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "remove",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """cart/remove/""" + "$" + """product_id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_CartController_removeAll13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/removeall/"), DynamicPart("product_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CartController_removeAll13_invoker = createInvoker(
    CartController_4.removeAll(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "removeAll",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """cart/removeall/""" + "$" + """product_id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_CartController_addShipping14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shipping/add/"), DynamicPart("shipping_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CartController_addShipping14_invoker = createInvoker(
    CartController_4.addShipping(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "addShipping",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """shipping/add/""" + "$" + """shipping_id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_CategoryController_category15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category/"), DynamicPart("category_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoryController_category15_invoker = createInvoker(
    CategoryController_5.category(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "category",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """category/""" + "$" + """category_id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_ProductController_product16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/"), DynamicPart("product_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_product16_invoker = createInvoker(
    ProductController_2.product(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "product",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """product/""" + "$" + """product_id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_UserController_login17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/"), DynamicPart("uri", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_login17_invoker = createInvoker(
    UserController_3.login(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "login",
      Seq(classOf[String]),
      "GET",
      this.prefix + """login/""" + "$" + """uri<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_UserController_user18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("uri", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_user18_invoker = createInvoker(
    UserController_3.user(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "user",
      Seq(classOf[String]),
      "GET",
      this.prefix + """user/""" + "$" + """uri<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_UserController_doLogin19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dologin/"), DynamicPart("user", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_doLogin19_invoker = createInvoker(
    UserController_3.doLogin(fakeValue[vos.UserVO]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "doLogin",
      Seq(classOf[vos.UserVO]),
      "GET",
      this.prefix + """dologin/""" + "$" + """user<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_UserController_addUser20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduser/"), DynamicPart("user", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_addUser20_invoker = createInvoker(
    UserController_3.addUser(fakeValue[vos.UserVO]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "addUser",
      Seq(classOf[vos.UserVO]),
      "GET",
      this.prefix + """adduser/""" + "$" + """user<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_UserController_logedUser21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logeduser")))
  )
  private[this] lazy val controllers_UserController_logedUser21_invoker = createInvoker(
    UserController_3.logedUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "logedUser",
      Nil,
      "GET",
      this.prefix + """logeduser""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_UserController_uri22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uri")))
  )
  private[this] lazy val controllers_UserController_uri22_invoker = createInvoker(
    UserController_3.uri,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "uri",
      Nil,
      "GET",
      this.prefix + """uri""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Assets_versioned23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned23_invoker = createInvoker(
    Assets_7.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_HeaderController_categories1_route(params@_) =>
      call { 
        controllers_HeaderController_categories1_invoker.call(HeaderController_1.categories)
      }
  
    // @LINE:8
    case controllers_ProductController_specials2_route(params@_) =>
      call { 
        controllers_ProductController_specials2_invoker.call(ProductController_2.specials)
      }
  
    // @LINE:9
    case controllers_CategoryController_products3_route(params@_) =>
      call { 
        controllers_CategoryController_products3_invoker.call(CategoryController_5.products)
      }
  
    // @LINE:10
    case controllers_UserController_logged4_route(params@_) =>
      call { 
        controllers_UserController_logged4_invoker.call(UserController_3.logged)
      }
  
    // @LINE:11
    case controllers_CartController_cart5_route(params@_) =>
      call { 
        controllers_CartController_cart5_invoker.call(CartController_4.cart)
      }
  
    // @LINE:12
    case controllers_CartController_products6_route(params@_) =>
      call { 
        controllers_CartController_products6_invoker.call(CartController_4.products)
      }
  
    // @LINE:13
    case controllers_CartController_cartTotal7_route(params@_) =>
      call { 
        controllers_CartController_cartTotal7_invoker.call(CartController_4.cartTotal)
      }
  
    // @LINE:14
    case controllers_ShippingController_shippingMethods8_route(params@_) =>
      call { 
        controllers_ShippingController_shippingMethods8_invoker.call(ShippingController_6.shippingMethods)
      }
  
    // @LINE:16
    case controllers_CartController_add9_route(params@_) =>
      call(params.fromPath[Long]("product_id", None)) { (product_id) =>
        controllers_CartController_add9_invoker.call(CartController_4.add(product_id))
      }
  
    // @LINE:17
    case controllers_CartController_plus10_route(params@_) =>
      call(params.fromPath[Long]("product_id", None)) { (product_id) =>
        controllers_CartController_plus10_invoker.call(CartController_4.plus(product_id))
      }
  
    // @LINE:18
    case controllers_CartController_addQtd11_route(params@_) =>
      call(params.fromPath[Long]("product_id", None), params.fromPath[Long]("qtd", None)) { (product_id, qtd) =>
        controllers_CartController_addQtd11_invoker.call(CartController_4.addQtd(product_id, qtd))
      }
  
    // @LINE:19
    case controllers_CartController_remove12_route(params@_) =>
      call(params.fromPath[Long]("product_id", None)) { (product_id) =>
        controllers_CartController_remove12_invoker.call(CartController_4.remove(product_id))
      }
  
    // @LINE:20
    case controllers_CartController_removeAll13_route(params@_) =>
      call(params.fromPath[Long]("product_id", None)) { (product_id) =>
        controllers_CartController_removeAll13_invoker.call(CartController_4.removeAll(product_id))
      }
  
    // @LINE:21
    case controllers_CartController_addShipping14_route(params@_) =>
      call(params.fromPath[Long]("shipping_id", None)) { (shipping_id) =>
        controllers_CartController_addShipping14_invoker.call(CartController_4.addShipping(shipping_id))
      }
  
    // @LINE:22
    case controllers_CategoryController_category15_route(params@_) =>
      call(params.fromPath[Long]("category_id", None)) { (category_id) =>
        controllers_CategoryController_category15_invoker.call(CategoryController_5.category(category_id))
      }
  
    // @LINE:23
    case controllers_ProductController_product16_route(params@_) =>
      call(params.fromPath[Long]("product_id", None)) { (product_id) =>
        controllers_ProductController_product16_invoker.call(ProductController_2.product(product_id))
      }
  
    // @LINE:24
    case controllers_UserController_login17_route(params@_) =>
      call(params.fromPath[String]("uri", None)) { (uri) =>
        controllers_UserController_login17_invoker.call(UserController_3.login(uri))
      }
  
    // @LINE:25
    case controllers_UserController_user18_route(params@_) =>
      call(params.fromPath[String]("uri", None)) { (uri) =>
        controllers_UserController_user18_invoker.call(UserController_3.user(uri))
      }
  
    // @LINE:26
    case controllers_UserController_doLogin19_route(params@_) =>
      call(params.fromPath[vos.UserVO]("user", None)) { (user) =>
        controllers_UserController_doLogin19_invoker.call(UserController_3.doLogin(user))
      }
  
    // @LINE:27
    case controllers_UserController_addUser20_route(params@_) =>
      call(params.fromPath[vos.UserVO]("user", None)) { (user) =>
        controllers_UserController_addUser20_invoker.call(UserController_3.addUser(user))
      }
  
    // @LINE:28
    case controllers_UserController_logedUser21_route(params@_) =>
      call { 
        controllers_UserController_logedUser21_invoker.call(UserController_3.logedUser)
      }
  
    // @LINE:29
    case controllers_UserController_uri22_route(params@_) =>
      call { 
        controllers_UserController_uri22_invoker.call(UserController_3.uri)
      }
  
    // @LINE:32
    case controllers_Assets_versioned23_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned23_invoker.call(Assets_7.versioned(path, file))
      }
  }
}
