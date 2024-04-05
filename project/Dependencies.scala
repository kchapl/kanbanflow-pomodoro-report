import sbt._

object Dependencies {
  lazy val requests = "com.lihaoyi" %% "requests" % "0.8.2"
  lazy val circe = "io.circe" %% "circe-parser" % "0.14.6"
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.18"
}
