import Dependencies._

ThisBuild / scalaVersion := "3.6.2"
ThisBuild / scalacOptions += "-explain"

lazy val root = (project in file("."))
  .settings(
    name := "kanbanflow-pomodoro-report",
    libraryDependencies ++= Seq(
      requests,
      circe,
      scalaTest % Test
    )
  )
