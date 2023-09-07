import Dependencies._

ThisBuild / scalaVersion := "3.3.1"
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
