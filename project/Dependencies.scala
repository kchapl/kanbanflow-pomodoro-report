import sbt._

object Dependencies {
  lazy val requests = "com.lihaoyi" %% "requests" % "0.9.0"
  lazy val circe = "io.circe" %% "circe-parser" % "0.14.10"
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.19"
}
