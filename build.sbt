import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.0.1"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin, WorkbenchPlugin)
  .settings(
    name := "tglogin4s",
    libraryDependencies ++= Seq(
      "dev.zio" %%% "zio" % "1.0.0-RC9"
    )
  )
  .settings(
    scalaJSUseMainModuleInitializer := true
  )
