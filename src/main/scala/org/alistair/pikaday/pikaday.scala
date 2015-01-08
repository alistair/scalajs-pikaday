package org.alistair.pikaday

import org.scalajs.dom.Node
import scala.scalajs.js

trait PikadaySettings extends js.Object {
  var field: Node = js.native
  var trigger: Node = js.native
  var bound: Boolean = js.native
  var position: String = js.native
  var resposition: Boolean = js.native
  var container: Node = js.native
  var format: String = js.native
  var defaultDate: js.Date = js.native
  var setDefaultDate: Boolean = js.native
  var firstDay: Int = js.native
  var minDate: js.Date = js.native
  var maxDate: js.Date = js.native
  var yearRange: Any = js.native
  var showWeekNumber: Boolean = js.native
  var isRTL: Boolean = js.native
  var i18n: I18nSettings = js.native
  var yearSuffix: String = js.native
  var showMonthAfterYear: Boolean = js.native
  var numberOfMonths: Int = js.native
  var mainCalendar: String = js.native
  def onSelect(date: js.Date): Nothing = js.native
  def onOpen: Nothing = js.native
  def onClose: Nothing = js.native
  def onDraw: Nothing = js.native
}

//TODO: I18nSettings
trait I18nSettings extends js.Object {
  var previousMonth: String = js.native
  var nextMonth: String = js.native
  var months: Array[String] = js.native
  var weekdays: Array[String] = js.native
  var weekdaysShort: Array[String] = js.native
}

class Pickaday(options: PikadaySettings) extends js.Object {

  def config(options: PikadaySettings): Dynamic = js.native
  def toString(format: String): Dynamic = js.native
  //def getMoment(): Dynamic = js.native
  //def setMoment
  def getDate(): js.Date = js.native
  def setDate(date: Any, preventOnSelect: Boolean): Unit = js.native
  def gotoDate(date: Any): Unit = js.native
  def adjustCalendars(): Unit = js.native
  def gotoToday: Unit = js.native
  def gotoMonth: Unit = js.native
  def nextMonth: Unit = js.native
  def prevMonth: Unit = js.native
  def gotoYear: Unit = js.native
  def setMinDate(value: js.Date): Unit = js.native
  def setMaxDate(value: js.Date): Unit = js.native
  def draw(force: Boolean): Unit = js.native
  def adjustPosition: Unit = js.native
  def render(year: Int, month: Int): String = js.native
  def isVisible: Boolean = js.native
  def show: Unit = js.native
  def hide: Unit = js.native
  def destroy: Unit = js.native
}
