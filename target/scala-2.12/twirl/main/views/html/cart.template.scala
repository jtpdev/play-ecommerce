
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object cart extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Cart | Wine")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""

"""),format.raw/*5.1*/("""<div class="products-on-cart" align="center" ng-controller="CartController">
		<div class="product-on-cart col-sm-12 col-xs-12 col-lg-12 col-xg-12" ng-repeat="productCart in products">
			<div
				class="image-product-on-cart col-sm-2 col-xs-12 col-lg-2 col-xg-2">
				<a href="/product/"""),format.raw/*9.23*/("""{"""),format.raw/*9.24*/("""{"""),format.raw/*9.25*/("""productCart.product.id"""),format.raw/*9.47*/("""}"""),format.raw/*9.48*/("""}"""),format.raw/*9.49*/("""">
					<img src=""""),_display_(/*10.17*/routes/*10.23*/.Assets.versioned("images/product/{{productCart.product.id}}.jpg")),format.raw/*10.89*/("""" />
				</a>
			</div>
			<div class="name-product-on-cart col-sm-5 col-lg-5 col-xg-5">
				<h4>"""),format.raw/*14.9*/("""{"""),format.raw/*14.10*/("""{"""),format.raw/*14.11*/("""productCart.product.name"""),format.raw/*14.35*/("""}"""),format.raw/*14.36*/("""}"""),format.raw/*14.37*/("""</h4>
			</div>
			<div class="qtd-product-on-cart col-sm-3 col-xs-12 col-lg-3 col-xg-3">
				<input type="text" ng-model="productCart.quantity" value=""""),format.raw/*17.63*/("""{"""),format.raw/*17.64*/("""{"""),format.raw/*17.65*/("""productCart.quantity"""),format.raw/*17.85*/("""}"""),format.raw/*17.86*/("""}"""),format.raw/*17.87*/("""" ng-change="addQuantity($index, productCart.quantity)"/> 
				<button type="button" ng-click="add($index)"
					class="plus-product-on-cart">+</button>
				<button type="button"ng-click="remove($index)"
					class="sub-product-on-cart">-</button>
				<button type="button" ng-click="removeAll($index)"
					class="remove-product-on-cart">
					<img 
						src=""""),_display_(/*25.13*/routes/*25.19*/.Assets.versioned("images/remove_all.png")),format.raw/*25.61*/("""" />
				</button>
			</div>
			<div
				class="value-product-on-cart col-sm-2 col-xs-2 col-lg-2 col-xg-2">
				"""),format.raw/*30.5*/("""{"""),format.raw/*30.6*/("""{"""),format.raw/*30.7*/("""productCart.value | currency"""),format.raw/*30.35*/("""}"""),format.raw/*30.36*/("""}"""),format.raw/*30.37*/("""
			"""),format.raw/*31.4*/("""</div>
		</div>
		
		
	<div class="col-sm-12 col-xs-12 col-lg-12 col-xg-12">
		<h4>Total</h4>
	</div>
	<div class="col-sm-12 col-xs-12 col-lg-12 col-xg-12">
			<div class="cart-subtotal col-sm-2 col-xs-12 col-lg-4 col-xg-2">
					"""),format.raw/*40.6*/("""{"""),format.raw/*40.7*/("""{"""),format.raw/*40.8*/("""subTotal | currency"""),format.raw/*40.27*/("""}"""),format.raw/*40.28*/("""}"""),format.raw/*40.29*/("""
			"""),format.raw/*41.4*/("""</div>
	</div>
	<div class="col-sm-12 col-xs-12 col-lg-12 col-xg-12">
			<div class="shipping-total col-sm-2 col-xs-12 col-lg-4 col-xg-2">
					"""),format.raw/*45.6*/("""{"""),format.raw/*45.7*/("""{"""),format.raw/*45.8*/("""shippingValue | currency"""),format.raw/*45.32*/("""}"""),format.raw/*45.33*/("""}"""),format.raw/*45.34*/("""
			"""),format.raw/*46.4*/("""</div>
	</div>
	<div class="col-sm-12 col-xs-12 col-lg-12 col-xg-12">
			<div class="cart-total col-sm-2 col-xs-12 col-lg-4 col-xg-2">
					"""),format.raw/*50.6*/("""{"""),format.raw/*50.7*/("""{"""),format.raw/*50.8*/("""total | currency"""),format.raw/*50.24*/("""}"""),format.raw/*50.25*/("""}"""),format.raw/*50.26*/("""
			"""),format.raw/*51.4*/("""</div>
	</div>
		
	<div class="shipping-methods col-sm-12 col-xs-12 col-lg-12 col-xg-12">
		<h4>Shipping Method(s)</h4>
	</div>
		<div class="col-sm-12 col-xs-12 col-lg-12 col-xg-12" ng-repeat="shipping in shippings">
			<div class="shipping col-sm-8 col-xs-12 col-lg-12 col-xg-8">
				<label>
						<input type="radio" ng-model="cart.shipping.id" value=""""),format.raw/*60.62*/("""{"""),format.raw/*60.63*/("""{"""),format.raw/*60.64*/("""shipping.id"""),format.raw/*60.75*/("""}"""),format.raw/*60.76*/("""}"""),format.raw/*60.77*/("""" ng-checked="cart.shipping.id == shipping.id"> """),format.raw/*60.125*/("""{"""),format.raw/*60.126*/("""{"""),format.raw/*60.127*/("""shipping.name"""),format.raw/*60.140*/("""}"""),format.raw/*60.141*/("""}"""),format.raw/*60.142*/(""" """),format.raw/*60.143*/("""- """),format.raw/*60.145*/("""{"""),format.raw/*60.146*/("""{"""),format.raw/*60.147*/("""shipping.description"""),format.raw/*60.167*/("""}"""),format.raw/*60.168*/("""}"""),format.raw/*60.169*/("""<br>
				</label>
			</div>
		</div>
	<div class="col-sm-12 col-xs-12 col-lg-12 col-xg-12">
		<div class="checkout col-sm-4 col-xs-12 col-lg-4 col-xg-4">
				<button class="btn-add-product" type="button"
					onclick="#"
					class="checkout-button">
					Checkout now!
				</button>
		</div>
	</div>
</div>


""")))}),format.raw/*76.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 24 09:23:00 BRST 2017
                  SOURCE: C:/Users/User/Documents/projetos/ecommerce-play/app/views/cart.scala.html
                  HASH: 045c6d424eeedf983fe18312b3b703cff1fe46c8
                  MATRIX: 940->1|1036->3|1066->8|1093->27|1132->29|1162->33|1480->324|1508->325|1536->326|1585->348|1613->349|1641->350|1688->370|1703->376|1790->442|1918->543|1947->544|1976->545|2028->569|2057->570|2086->571|2269->726|2298->727|2327->728|2375->748|2404->749|2433->750|2831->1121|2846->1127|2909->1169|3053->1286|3081->1287|3109->1288|3165->1316|3194->1317|3223->1318|3255->1323|3521->1562|3549->1563|3577->1564|3624->1583|3653->1584|3682->1585|3714->1590|3889->1738|3917->1739|3945->1740|3997->1764|4026->1765|4055->1766|4087->1771|4258->1915|4286->1916|4314->1917|4358->1933|4387->1934|4416->1935|4448->1940|4840->2304|4869->2305|4898->2306|4937->2317|4966->2318|4995->2319|5072->2367|5102->2368|5132->2369|5174->2382|5204->2383|5234->2384|5264->2385|5295->2387|5325->2388|5355->2389|5404->2409|5434->2410|5464->2411|5821->2738
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|41->9|41->9|41->9|41->9|41->9|41->9|42->10|42->10|42->10|46->14|46->14|46->14|46->14|46->14|46->14|49->17|49->17|49->17|49->17|49->17|49->17|57->25|57->25|57->25|62->30|62->30|62->30|62->30|62->30|62->30|63->31|72->40|72->40|72->40|72->40|72->40|72->40|73->41|77->45|77->45|77->45|77->45|77->45|77->45|78->46|82->50|82->50|82->50|82->50|82->50|82->50|83->51|92->60|92->60|92->60|92->60|92->60|92->60|92->60|92->60|92->60|92->60|92->60|92->60|92->60|92->60|92->60|92->60|92->60|92->60|92->60|108->76
                  -- GENERATED --
              */
          