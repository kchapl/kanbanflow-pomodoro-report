import sbt._

object Dependencies {
  lazy val requests = "com.lihaoyi" %% "requests" % "0.7.1"
  lazy val circe = "io.circe" %% "circe-parser" % "0.14.3"
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.11"
}
