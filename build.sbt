import Dependencies._

ThisBuild / scalaVersion := "3.2.0"

lazy val root = (project in file("."))
  .settings(
    name := "kanbanflow-pomodoro-report",
    libraryDependencies += scalaTest % Test
  )
