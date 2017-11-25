
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Login | Wine")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""

"""),format.raw/*5.1*/("""<div class="form-login col-sm-12 col-xs-12 col-lg-12 col-xg-12" ng-controller="UserController">
		<div id="login-message">
			"""),format.raw/*7.4*/("""{"""),format.raw/*7.5*/("""{"""),format.raw/*7.6*/("""loginmessage"""),format.raw/*7.18*/("""}"""),format.raw/*7.19*/("""}"""),format.raw/*7.20*/("""
		"""),format.raw/*8.3*/("""</div>
		<h2>Login:</h2>
		<form ng-submit="doLogin()">
				<div class="col-sm-12 col-xs-12 col-lg-12 col-xg-12">
					<div class="col-sm-6 col-xs-12 col-lg-6 col-xg-6">
						<label	for="email">
							Login (email):
						</label>
					</div>
					<div class="col-sm-6 col-xs-12 col-lg-6 col-xg-6">
						<input id="email" class="required"
							type="text" name="user.email" value=""""),format.raw/*19.45*/("""{"""),format.raw/*19.46*/("""{"""),format.raw/*19.47*/("""user.email"""),format.raw/*19.57*/("""}"""),format.raw/*19.58*/("""}"""),format.raw/*19.59*/("""" />
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
							type="password" name="user.password" value=""""),format.raw/*30.52*/("""{"""),format.raw/*30.53*/("""{"""),format.raw/*30.54*/("""user.password"""),format.raw/*30.67*/("""}"""),format.raw/*30.68*/("""}"""),format.raw/*30.69*/(""""/>
					</div>
				</div>
				<button type="submit">Login</button>
		</form>
		<div class="col-sm-12 col-xs-12 col-lg-12 col-xg-12">
			<a target="_self" href="/user/"""),format.raw/*36.34*/("""{"""),format.raw/*36.35*/("""{"""),format.raw/*36.36*/("""uri"""),format.raw/*36.39*/("""}"""),format.raw/*36.40*/("""}"""),format.raw/*36.41*/("""">Create an account!</a>
		</div>
	</div>



""")))}),format.raw/*42.2*/("""
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
                  SOURCE: C:/Users/User/Documents/projetos/ecommerce-play/app/views/login.scala.html
                  HASH: 289c59fc4b6b2aec4a139d45434793ed2852bcef
                  MATRIX: 941->1|1037->3|1067->8|1095->28|1134->30|1164->34|1318->162|1345->163|1372->164|1411->176|1439->177|1467->178|1497->182|1922->579|1951->580|1980->581|2018->591|2047->592|2076->593|2481->970|2510->971|2539->972|2580->985|2609->986|2638->987|2839->1160|2868->1161|2897->1162|2928->1165|2957->1166|2986->1167|3068->1219
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|39->7|39->7|39->7|40->8|51->19|51->19|51->19|51->19|51->19|51->19|62->30|62->30|62->30|62->30|62->30|62->30|68->36|68->36|68->36|68->36|68->36|68->36|74->42
                  -- GENERATED --
              */
          