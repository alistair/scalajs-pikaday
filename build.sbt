import ScalaJSKeys._

scalaJSSettings

name := "scalajs-pikaday"

version := "0.0.1-SNAPSHOT"

organization := "org.alistair"

scalaVersion := "2.11.2"

scalacOptions ++= Seq("-deprecation")

libraryDependencies ++= Seq(
  "org.scala-lang.modules.scalajs" %%% "scalajs-dom" % "0.6.1"
)

jsDependencies ++= Seq(
  "org.webjars" % "Pikaday" % "1.2.0" / "pikaday.js"
)

skip in packageJSDependencies := false
