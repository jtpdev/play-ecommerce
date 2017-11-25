
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Wine")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
	"""),format.raw/*4.2*/("""<div class="container" id="infinite"
	data-infinite-scroll='"""),format.raw/*5.24*/("""{"""),format.raw/*5.25*/(""" """),format.raw/*5.26*/(""""path": ".pagination__next", "append": ".post", "history": false """),format.raw/*5.91*/("""}"""),format.raw/*5.92*/("""' ng-controller="ProductController">
		<div class="product col-lg-4 col-md-4 col-sm-6 col-xs-6 post" ng-repeat="product in specials">
			<div class="product-caption">
				<div class="product-img" align="center">
					<a href="/product/"""),format.raw/*9.24*/("""{"""),format.raw/*9.25*/("""{"""),format.raw/*9.26*/("""product.id"""),format.raw/*9.36*/("""}"""),format.raw/*9.37*/("""}"""),format.raw/*9.38*/(""""> <img src=""""),_display_(/*9.52*/routes/*9.58*/.Assets.versioned("images/product/{{product.id}}.jpg")),format.raw/*9.112*/("""" />
					</a>
				</div>
				<div class="description">
					<h4>"""),format.raw/*13.10*/("""{"""),format.raw/*13.11*/("""{"""),format.raw/*13.12*/("""product.name"""),format.raw/*13.24*/("""}"""),format.raw/*13.25*/("""}"""),format.raw/*13.26*/("""</h4>
					<p>
						<span class="price-old">"""),format.raw/*15.31*/("""{"""),format.raw/*15.32*/("""{"""),format.raw/*15.33*/("""product.price | currency"""),format.raw/*15.57*/("""}"""),format.raw/*15.58*/("""}"""),format.raw/*15.59*/("""</span> - 
						<span class="price-new">"""),format.raw/*16.31*/("""{"""),format.raw/*16.32*/("""{"""),format.raw/*16.33*/("""product.special | currency"""),format.raw/*16.59*/("""}"""),format.raw/*16.60*/("""}"""),format.raw/*16.61*/("""</span>
					</p>
				</div>
				<button ng-click="toCart(product.id)" class="btn-add-product">Buy it!</button>
			</div>
		</div>
</div>
""")))}),format.raw/*23.2*/("""
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
                  DATE: Thu Nov 23 11:21:29 BRST 2017
                  SOURCE: C:/Users/User/Documents/projetos/ecommerce-play/app/views/index.scala.html
                  HASH: 0ccc67ba7d82117f609c57215ac66213d545f2d1
                  MATRIX: 941->1|1037->3|1065->6|1085->18|1124->20|1152->22|1239->82|1267->83|1295->84|1387->149|1415->150|1677->385|1705->386|1733->387|1770->397|1798->398|1826->399|1866->413|1880->419|1955->473|2048->538|2077->539|2106->540|2146->552|2175->553|2204->554|2277->599|2306->600|2335->601|2387->625|2416->626|2445->627|2514->668|2543->669|2572->670|2626->696|2655->697|2684->698|2853->837
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|37->5|37->5|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|45->13|45->13|45->13|45->13|45->13|45->13|47->15|47->15|47->15|47->15|47->15|47->15|48->16|48->16|48->16|48->16|48->16|48->16|55->23
                  -- GENERATED --
              */
          