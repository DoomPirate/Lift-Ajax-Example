package code
package snippet

import scala.xml.{NodeSeq, Text}
import net.liftweb.util._
import net.liftweb.common._
import java.util.Date
import code.lib._
import Helpers._
import net.liftweb.http.{S}
import net.liftweb.sitemap._
import net.liftweb.http._
import js._
import JsCmds._
import JE._

class HelloWorld {
 
 def stuff(soid: String): JsCmd = {
 System.out.println("PrintStuffworks" + soid)  // This executes fine
 S.error("Stuff works" + soid)  // the error message doesn't show up.

  }
  def howdy ={
	//S.error("Testing")	
	
"#tester [onclick]" #> SHtml.ajaxCall(Str("Soid"), stuff _)._2}

}

