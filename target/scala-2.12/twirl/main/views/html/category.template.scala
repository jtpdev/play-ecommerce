
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

object category extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Wine")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
	"""),format.raw/*4.2*/("""<div class="container" id="infinite"
	data-infinite-scroll='"""),format.raw/*5.24*/("""{"""),format.raw/*5.25*/(""" """),format.raw/*5.26*/(""""path": ".pagination__next", "append": ".post", "history": false """),format.raw/*5.91*/("""}"""),format.raw/*5.92*/("""' ng-controller="CategoryController">
		<div class="product col-lg-4 col-md-4 col-sm-6 col-xs-6 post" ng-repeat="product in products">
			<div class="product-caption">
				<div class="product-img" align="center">
					<a href="/product/"""),format.raw/*9.24*/("""{"""),format.raw/*9.25*/("""{"""),format.raw/*9.26*/("""product.id"""),format.raw/*9.36*/("""}"""),format.raw/*9.37*/("""}"""),format.raw/*9.38*/(""""> <img src=""""),_display_(/*9.52*/routes/*9.58*/.Assets.versioned("images/product/{{product.id}}.jpg")),format.raw/*9.112*/("""" />
					</a>
				</div>
				<div class="description">
					<h4>"""),format.raw/*13.10*/("""{"""),format.raw/*13.11*/("""{"""),format.raw/*13.12*/("""product.name"""),format.raw/*13.24*/("""}"""),format.raw/*13.25*/("""}"""),format.raw/*13.26*/("""</h4>
					<p ng-bind-html="values(product.price, product.special)">
						
					</p>
				</div>
				<button ng-click="toCart(product.id)" class="btn-add-product">Buy it!</button>
			</div>
		</div>
</div>
""")))}),format.raw/*22.2*/("""
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
                  DATE: Thu Nov 23 14:17:27 BRST 2017
                  SOURCE: C:/Users/User/Documents/projetos/ecommerce-play/app/views/category.scala.html
                  HASH: d9bd3dbf2401227388f7875723709a39b5730e74
                  MATRIX: 944->1|1040->3|1070->8|1090->20|1129->22|1158->25|1246->86|1274->87|1302->88|1394->153|1422->154|1689->394|1717->395|1745->396|1782->406|1810->407|1838->408|1878->422|1892->428|1967->482|2064->551|2093->552|2122->553|2162->565|2191->566|2220->567|2466->783
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|37->5|37->5|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|45->13|45->13|45->13|45->13|45->13|45->13|54->22
                  -- GENERATED --
              */
          