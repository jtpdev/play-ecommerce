
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

object user extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Login | Wine")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""

"""),format.raw/*5.1*/("""<div id="user-form" ng-controller="UserController">
			<div id="login-message">
			</div>
		<form ng-submit="addUser()">
				<legend>Create an account</legend>
				<div class="col-sm-12 col-xs-12 col-lg-12 col-xg-12">
					<div class="col-sm-6 col-xs-12 col-lg-6 col-xg-6">
						<label for="nome">
							Name:
						</label>
					</div>
					<div class="col-sm-6 col-xs-12 col-lg-6 col-xg-6">
						<input id="name" class="required"
							type="text" name=""""),format.raw/*18.26*/("""{"""),format.raw/*18.27*/("""{"""),format.raw/*18.28*/("""user.name"""),format.raw/*18.37*/("""}"""),format.raw/*18.38*/("""}"""),format.raw/*18.39*/("""" value=""""),format.raw/*18.48*/("""{"""),format.raw/*18.49*/("""{"""),format.raw/*18.50*/("""user.name"""),format.raw/*18.59*/("""}"""),format.raw/*18.60*/("""}"""),format.raw/*18.61*/("""" />
					</div>
				</div>
				<div class="col-sm-12 col-xs-12 col-lg-12 col-xg-12">
					<div class="col-sm-6 col-xs-12 col-lg-6 col-xg-6">
						<label	for="email">
							Email:
						</label>
					</div>
					<div class="col-sm-6 col-xs-12 col-lg-6 col-xg-6">
						<input id="email" class="required"
							type="text" name="user.email" value=""""),format.raw/*29.45*/("""{"""),format.raw/*29.46*/("""{"""),format.raw/*29.47*/("""user.email"""),format.raw/*29.57*/("""}"""),format.raw/*29.58*/("""}"""),format.raw/*29.59*/("""" />
					</div>
				</div>
				<div class="col-sm-12 col-xs-12 col-lg-12 col-xg-12">
					<div class="col-sm-6 col-xs-12 col-lg-6 col-xg-6">
						<label for="password">
							Password:
						</label>
					</div>
					<div class="col-sm-6 col-xs-12 col-lg-6 col-xg-6">
						<input id="password" class="required"
							type="password" name="user.password" value=""""),format.raw/*40.52*/("""{"""),format.raw/*40.53*/("""{"""),format.raw/*40.54*/("""user.password"""),format.raw/*40.67*/("""}"""),format.raw/*40.68*/("""}"""),format.raw/*40.69*/("""" />
					</div>
				</div>
				<button type="submit">Done</button>
		</form>

""")))}),format.raw/*46.2*/("""
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
                  DATE: Fri Nov 24 11:50:46 BRST 2017
                  SOURCE: C:/Users/User/Documents/projetos/ecommerce-play/app/views/user.scala.html
                  HASH: 78e8050af6974ac3e4b7d099049f9807e56068ea
                  MATRIX: 940->1|1036->3|1066->8|1094->28|1133->30|1163->34|1664->507|1693->508|1722->509|1759->518|1788->519|1817->520|1854->529|1883->530|1912->531|1949->540|1978->541|2007->542|2396->903|2425->904|2454->905|2492->915|2521->916|2550->917|2955->1294|2984->1295|3013->1296|3054->1309|3083->1310|3112->1311|3228->1397
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|50->18|50->18|50->18|50->18|50->18|50->18|50->18|50->18|50->18|50->18|50->18|50->18|61->29|61->29|61->29|61->29|61->29|61->29|72->40|72->40|72->40|72->40|72->40|72->40|78->46
                  -- GENERATED --
              */
          