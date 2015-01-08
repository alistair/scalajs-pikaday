//import ScalaJSKeys._

lazy val root = project.in(file(".")).enablePlugins(ScalaJSPlugin)
//scalaJSSettings

//enablePlugins(ScalaJSPlugin)

name := "scalajs-pikaday"

version := "0.0.1-SNAPSHOT"

organization := "org.alistair"

scalaVersion := "2.11.2"

scalacOptions ++= Seq("-deprecation")

libraryDependencies ++= Seq(
  "org.scala-js" %%%! "scalajs-dom" % "0.7.0"
)

jsDependencies ++= Seq(
  "org.webjars" % "Pikaday" % "1.2.0" / "pikaday.js"
)

//skip in packageJSDependencies := false
