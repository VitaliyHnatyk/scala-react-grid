package  com.rgrid

import org.scalajs.dom
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._
import org.scalajs.dom
import org.scalajs.dom.html

import scala.scalajs.js.JSApp

object ReactGrid extends JSApp {


  override def main(): Unit = {

    val HelloMessage = ReactComponentB[String]("HelloMessage")
      .render($ => <.div("Hello ", $.props))
      .build

    ReactDOM.render(HelloMessage("Explorers"), dom.document.getElementById("root"))
  }
}
