package org.alistair.pikaday

import org.scalajs.dom
import scala.scalajs.js

trait PikadaySettings extends js.Object {
  var field: Node = js.native
  var trigger: Node = js.native
  var bound: Boolean = js.native
  var position: String = js.native
  var resposition: Boolean = js.native
  var container: Node = js.native
  var format: String = js.native
  var defaultDate: Date = js.native
  var setDefaultDate: Boolean = js.native
  var firstDay: Int = js.native
  var minDate: Date = js.native
  var maxDate: Date = js.native
  var yearRange: Any = js.native
  var showWeekNumber: Boolean = js.native
  var isRTL: Boolean = js.native
  var i18n: I18nSettings = js.native
  var yearSuffix: String = js.native
  var showMonthAfterYear: Boolean = js.native
  var numberOfMonths: Int = js.native
  var mainCalendar: String = js.native
  def onSelect(date: Date) = js.native
  def onOpen = js.native
  def onClose = js.native
  def onDraw = js.native
}

//TODO: I18nSettings
trait I18nSettings extends js.Object {
  var previousMonth: String = js.native
  var nextMonth: String = js.native
  var months: js.Array[String] = js.native
  var weekdays: js.Array[String] = js.native
  var weekdaysShort: js.Array[String] = js.native
}

class Pickaday(options: PikadaySettings) extends js.Object {
  
  def config(options: PikadaySettings): js.Dynamic = js.native
  def toString(format: String): js.Dynamic = js.native
  //def getMoment(): js.Dynamic = js.native
  //def setMoment
  def getDate(): Date = js.native
  def setDate(date: Any, preventOnSelect: Boolean): Unit = js.native
  def gotoDate(date: Any): Unit = js.native
  def adjustCalendars(): Unit = js.native
  def gotoToday: Unit = js.native
  def gotoMonth: Unit = js.native
  def nextMonth: Unit = js.native
  def prevMonth: Unit = js.native
  def gotoYear: Unit = js.native
  def setMinDate(value: Date): Unit = js.native
  def setMaxDate(value: Date): Unit = js.native
  def draw(force: Boolean): Unit = js.native
  def adjustPosition: Unit = js.native
  def render(year: Int, month: Int): String = js.native
  def isVisible: Boolean = js.native
  def show: Unit = js.native
  def hide: Unit = js.native
  def destroy: Unit = js.native
}
