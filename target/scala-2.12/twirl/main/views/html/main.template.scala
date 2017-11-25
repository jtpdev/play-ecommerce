
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
    	<base href="/">
        """),format.raw/*13.62*/("""
        """),format.raw/*14.9*/("""<title>"""),_display_(/*14.17*/title),format.raw/*14.22*/("""</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">
		<link rel="stylesheet" type="text/css" href=""""),_display_(/*16.49*/routes/*16.55*/.Assets.versioned("stylesheets/bootstrap-theme.min.css")),format.raw/*16.111*/("""">
		<link rel="stylesheet" type="text/css" href=""""),_display_(/*17.49*/routes/*17.55*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*17.105*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*18.54*/routes/*18.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*18.101*/("""">
		<meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <body ng-app="lucy">
     <script src=""""),_display_(/*22.20*/routes/*22.26*/.Assets.versioned("javascripts/angular-1.6.6.min.js")),format.raw/*22.79*/("""" type="text/javascript"></script>
     <script src=""""),_display_(/*23.20*/routes/*23.26*/.Assets.versioned("javascripts/angular-animate.js")),format.raw/*23.77*/("""" type="text/javascript"></script>
     <script src=""""),_display_(/*24.20*/routes/*24.26*/.Assets.versioned("javascripts/main.js")),format.raw/*24.66*/("""" type="text/javascript"></script>
	 <script src=""""),_display_(/*25.17*/routes/*25.23*/.Assets.versioned("javascripts/infinite-scroll.js")),format.raw/*25.74*/(""""></script>
	 <script src=""""),_display_(/*26.17*/routes/*26.23*/.Assets.versioned("javascripts/jquery-2.1.4.min.js")),format.raw/*26.75*/(""""></script>
	 <script src=""""),_display_(/*27.17*/routes/*27.23*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*27.72*/(""""></script>
	 <script src=""""),_display_(/*28.17*/routes/*28.23*/.Assets.versioned("javascripts/jquery.mask.js")),format.raw/*28.70*/(""""></script>



	<div id="header" ng-controller="HeaderController">
			<div id="logo" class="col-sm-2 col-xs-12 col-lg-3 col-xg-2" align="center">
				<a target="_self" href=""""),_display_(/*34.30*/routes/*34.36*/.HomeController.index()),format.raw/*34.59*/(""""><img
					src=""""),_display_(/*35.12*/routes/*35.18*/.Assets.versioned("images/logo.png")),format.raw/*35.54*/("""" /></a>
			</div>
			<div class="category-button">
				<button class="btn-header" id="btn-category" ng-click="toggleCustom()">
						Categories
				</button>
			</div>
			<div  id="categories" class="col-sm-6 col-xs-12 col-lg-5 col-xg-7"
				align="center" >
					<div class="category col-sm-3 col-xs-12 col-lg-3 col-xg-3" ng-repeat="category in categories" ng-hide="custom">
							<a class="btn-a" target="_self" href="category/"""),format.raw/*45.55*/("""{"""),format.raw/*45.56*/("""{"""),format.raw/*45.57*/("""category.id"""),format.raw/*45.68*/("""}"""),format.raw/*45.69*/("""}"""),format.raw/*45.70*/("""">
						<button type="button" class="btn-header">
								"""),format.raw/*47.9*/("""{"""),format.raw/*47.10*/("""{"""),format.raw/*47.11*/("""category.name"""),format.raw/*47.24*/("""}"""),format.raw/*47.25*/("""}"""),format.raw/*47.26*/("""
						"""),format.raw/*48.7*/("""</button>
							</a>
					</div>
			</div>
			
			<div id="cart" class="col-sm-4 col-xs-12 col-lg-4 col-xg-3">
				<a class="btn-a" target="_self" href="/cart">
					<button type="button" class="btn-header" >
							<img src=""""),_display_(/*56.19*/routes/*56.25*/.Assets.versioned("images/bag.png")),format.raw/*56.60*/("""" id="img-value"/> 
							 """),format.raw/*57.9*/("""{"""),format.raw/*57.10*/("""{"""),format.raw/*57.11*/("""total | currency"""),format.raw/*57.27*/("""}"""),format.raw/*57.28*/("""}"""),format.raw/*57.29*/("""
					"""),format.raw/*58.6*/("""</button>
				</a>
			</div>
			<div class="user col-sm-3 col-xs-12 col-lg-4 col-xg-2" align="center">
				Welcome! <a target="_self" href=""""),format.raw/*62.38*/("""{"""),format.raw/*62.39*/("""{"""),format.raw/*62.40*/("""loginuri"""),format.raw/*62.48*/("""}"""),format.raw/*62.49*/("""}"""),format.raw/*62.50*/("""">"""),format.raw/*62.52*/("""{"""),format.raw/*62.53*/("""{"""),format.raw/*62.54*/("""logged"""),format.raw/*62.60*/("""}"""),format.raw/*62.61*/("""}"""),format.raw/*62.62*/("""</a>
			</div>
		</div>


	"""),format.raw/*68.13*/(""" """),_display_(/*68.15*/content),format.raw/*68.22*/("""



	"""),format.raw/*72.2*/("""<div class="footer col-sm-12 col-xs-12 col-lg-12 col-xg-12">
		<div id="connection">
			<div id="connect">Connect us</div>
			<a href="#"> <img src=""""),_display_(/*75.28*/routes/*75.34*/.Assets.versioned("images/face-icon.png")),format.raw/*75.75*/("""" />
			</a> <a href="#"> <img src=""""),_display_(/*76.33*/routes/*76.39*/.Assets.versioned("images/insta-icon.png")),format.raw/*76.81*/(""""
				/>
			</a> <a href="#"> <img src=""""),_display_(/*78.33*/routes/*78.39*/.Assets.versioned("images/whatsapp-icon.png")),format.raw/*78.84*/(""""
				/>
			</a>
		</div>
	</div>
	<div id="dev" align="center">
		<p>
			Developed by <a href="https://bitbucket.org/jtpdev/">Jimmy Porto</a>
		</p>
	</div>
</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 24 11:08:17 BRST 2017
                  SOURCE: C:/Users/User/Documents/projetos/ecommerce-play/app/views/main.scala.html
                  HASH: a39633f080b49a2e42914cebb8f71c0853dd8af6
                  MATRIX: 1206->260|1331->290|1359->292|1460->418|1496->427|1531->435|1557->440|1651->507|1666->513|1727->552|1805->603|1820->609|1898->665|1976->716|1991->722|2063->772|2146->828|2161->834|2224->875|2381->1005|2396->1011|2470->1064|2551->1118|2566->1124|2638->1175|2719->1229|2734->1235|2795->1275|2873->1326|2888->1332|2960->1383|3015->1411|3030->1417|3103->1469|3158->1497|3173->1503|3243->1552|3298->1580|3313->1586|3381->1633|3583->1808|3598->1814|3642->1837|3687->1855|3702->1861|3759->1897|4218->2328|4247->2329|4276->2330|4315->2341|4344->2342|4373->2343|4459->2402|4488->2403|4517->2404|4558->2417|4587->2418|4616->2419|4650->2426|4905->2654|4920->2660|4976->2695|5031->2723|5060->2724|5089->2725|5133->2741|5162->2742|5191->2743|5224->2749|5392->2889|5421->2890|5450->2891|5486->2899|5515->2900|5544->2901|5574->2903|5603->2904|5632->2905|5666->2911|5695->2912|5724->2913|5779->3022|5808->3024|5836->3031|5868->3036|6045->3186|6060->3192|6122->3233|6186->3270|6201->3276|6264->3318|6332->3359|6347->3365|6413->3410
                  LINES: 33->7|38->7|40->9|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|65->34|65->34|65->34|66->35|66->35|66->35|76->45|76->45|76->45|76->45|76->45|76->45|78->47|78->47|78->47|78->47|78->47|78->47|79->48|87->56|87->56|87->56|88->57|88->57|88->57|88->57|88->57|88->57|89->58|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|98->68|98->68|98->68|102->72|105->75|105->75|105->75|106->76|106->76|106->76|108->78|108->78|108->78
                  -- GENERATED --
              */
          