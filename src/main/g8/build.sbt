val commonSettings = Seq(
  organization := "$organization_$",
  licenses := Seq("MIT" -> url("http://opensource.org/licenses/MIT")),

  scalaVersion := "$scala_version$",
  scalacOptions ++= Seq(
    "-deprecation",
    "-feature",
    "-unchecked",
    "-Xfatal-warnings",
    "-Xlint"
  )
)

lazy val root = project.in(file("."))
  .settings(commonSettings :_*)
  .settings(
    name := "$name$",
    description := "Scala sandbox.",
    libraryDependencies ++= Seq(
    )
  )
