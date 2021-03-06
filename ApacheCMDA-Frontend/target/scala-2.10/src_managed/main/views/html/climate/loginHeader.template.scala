
package views.html.climate

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object loginHeader extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(email:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.16*/("""
<style>
#myButtons"""),format.raw/*3.11*/("""{"""),format.raw/*3.12*/("""
margin-top: 15px;
"""),format.raw/*5.1*/("""}"""),format.raw/*5.2*/("""
</style>
<div class="navbar navbar-default navbar-fixed-top" role="navigation">
  <div class="container">

    <div class="row">

      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse"
        data-target=".navbar-collapse">
          <span class="sr-only">Toggle navigation</span> <span
        class="icon-bar"></span> <span class="icon-bar"></span> <span
        class="icon-bar"></span>
        </button>
        <a class="navbar-brand navbar-collapse collapse" style="padding-bottom: 0 ;" href=""""),_display_(Seq[Any](/*19.93*/{routes.ClimateServiceController.home(email,"loginAlready")})),format.raw/*19.153*/(""""><img
        src='"""),_display_(Seq[Any](/*20.15*/routes/*20.21*/.Assets.at("images/NASA_JPL_logo.png"))),format.raw/*20.59*/("""' style="height: 40px ; width: 220px ;">
          <img
          src='"""),_display_(Seq[Any](/*22.17*/routes/*22.23*/.Assets.at("images/logo.png"))),format.raw/*22.52*/("""' style="height: 15px ; width: 250px ;">
        </a>
      </div>

      <div id="myButtons" class="navbar-collapse collapse" style="height:">



        <form class="navbar-form navbar-right" role="logout">
          <a class="btn btn-danger" href=""""),_display_(Seq[Any](/*31.44*/{routes.ClimateServiceController.home(null,null,"logout")})),format.raw/*31.102*/("""" role="button">Log Out&raquo;</a>
        </form>

        <ul class="nav navbar-nav navbar-right">

        <form class="navbar-form navbar-right" role="findFriend">
          <a class="btn btn-info" href=""""),_display_(Seq[Any](/*37.42*/{routes.Application.findFriend(email)})),format.raw/*37.80*/("""" role="button">Find friend</a>
        </form>
          <h10 class="navbar-brand navbar-left">Welcome,"""),_display_(Seq[Any](/*39.58*/email)),format.raw/*39.63*/("""!</h10>
        <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">Service<b class="caret"></b> </a>

          <ul class="dropdown-menu">
            <li><a href=""""),_display_(Seq[Any](/*43.27*/routes/*43.33*/.ClimateServiceController.searchService(email))),format.raw/*43.79*/("""">Search Service </a></li>
            <li><a href=""""),_display_(Seq[Any](/*44.27*/routes/*44.33*/.ClimateServiceController.climateServices(email))),format.raw/*44.81*/("""">Service List</a></li>
            <li><a href=""""),_display_(Seq[Any](/*45.27*/routes/*45.33*/.ClimateServiceController.mostPopularClimateServices(email))),format.raw/*45.92*/("""">Most Popular Service</a></li>
            <li><a href=""""),_display_(Seq[Any](/*46.27*/routes/*46.33*/.ClimateServiceController.mostRecentlyAddedClimateServices(email))),format.raw/*46.98*/("""">Recent Added Service</a></li>
            <li><a href=""""),_display_(Seq[Any](/*47.27*/routes/*47.33*/.ClimateServiceController.mostRecentlyUsedClimateServices(email))),format.raw/*47.97*/("""">Recent Used  Service</a></li>
          </ul>
        </li>

        <li class="dropdown"><a href="#"
        class="dropdown-toggle" data-toggle="dropdown">Dataset<b
        class="caret"></b> </a>
          <ul class="dropdown-menu">
            <li><a href=""""),_display_(Seq[Any](/*55.27*/routes/*55.33*/.DatasetController.datasetList(email))),format.raw/*55.70*/("""">Dataset List</a></li>
            <li><a href=""""),_display_(Seq[Any](/*56.27*/routes/*56.33*/.DatasetController.searchDataset(email))),format.raw/*56.72*/("""">Search dataset</a></li>
          </ul>
        </li>
        """),format.raw/*59.45*/("""
        """),format.raw/*60.69*/("""
        """),format.raw/*61.35*/("""
        """),format.raw/*62.39*/("""
        """),format.raw/*63.102*/("""
        """),format.raw/*64.107*/("""
        """),format.raw/*65.18*/("""
        """),format.raw/*66.18*/("""
        <li class="dropdown"><a href="#"
        class="dropdown-toggle" data-toggle="dropdown">About<b
        class="caret"></b> </a>
          <ul class="dropdown-menu">
            <li><a href=""""),_display_(Seq[Any](/*71.27*/routes/*71.33*/.ClimateServiceController.home(email))),format.raw/*71.70*/("""">Home</a></li>
            <li><a href=""""),_display_(Seq[Any](/*72.27*/routes/*72.33*/.AboutusController.aboutUs(email))),format.raw/*72.66*/("""">About Us</a></li>
            <li><a href=""""),_display_(Seq[Any](/*73.27*/routes/*73.33*/.AboutusController.aboutProject(email))),format.raw/*73.71*/("""">About project</a></li>
          </ul>
        </li>
        </ul>
      </div>

    </div>
  </div>
</div>"""))}
    }
    
    def render(email:String): play.api.templates.HtmlFormat.Appendable = apply(email)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (email) => apply(email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 10 15:11:39 EST 2015
                    SOURCE: C:/Users/Joe/Desktop/ApacheCMDA-Frontend/app/views/climate/loginHeader.scala.html
                    HASH: 5a1ead703663670c1f0254bba40537fba05f8d4d
                    MATRIX: 788->1|896->15|942->34|970->35|1015->54|1042->55|1634->611|1717->671|1774->692|1789->698|1849->736|1957->808|1972->814|2023->843|2311->1095|2392->1153|2637->1362|2697->1400|2838->1505|2865->1510|3095->1704|3110->1710|3178->1756|3267->1809|3282->1815|3352->1863|3438->1913|3453->1919|3534->1978|3628->2036|3643->2042|3730->2107|3824->2165|3839->2171|3925->2235|4225->2499|4240->2505|4299->2542|4385->2592|4400->2598|4461->2637|4553->2737|4590->2806|4627->2841|4664->2880|4702->2982|4740->3089|4777->3107|4814->3125|5050->3325|5065->3331|5124->3368|5202->3410|5217->3416|5272->3449|5354->3495|5369->3501|5429->3539
                    LINES: 26->1|29->1|31->3|31->3|33->5|33->5|47->19|47->19|48->20|48->20|48->20|50->22|50->22|50->22|59->31|59->31|65->37|65->37|67->39|67->39|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|83->55|83->55|83->55|84->56|84->56|84->56|87->59|88->60|89->61|90->62|91->63|92->64|93->65|94->66|99->71|99->71|99->71|100->72|100->72|100->72|101->73|101->73|101->73
                    -- GENERATED --
                */
            