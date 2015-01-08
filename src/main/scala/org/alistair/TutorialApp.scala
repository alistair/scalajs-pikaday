package org.alistair

import scala.scalajs.js._
import org.scalajs.dom
import dom.document
import org.alistair.pikaday._

object TutorialApp extends JSApp {
  def main: Unit = {
    println("Hello World:" + new Date(Date.now).toString)
    /*val el = document.getElementById("test")
    val settings = Dynamic.literal(
         field = el
       ).asInstanceOf[PikadaySettings]
    val pikaday = new Pikaday(settings)*/
    el.setAttribute("value", "Hello World")
  }
}
