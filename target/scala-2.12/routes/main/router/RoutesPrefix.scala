
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/User/Documents/projetos/ecommerce-play/conf/routes
// @DATE:Fri Nov 24 11:45:42 BRST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
