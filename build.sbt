lazy val root = (project in file("."))
  .settings(
    scalaVersion := "2.12.8",
    version := "0.1.0-SNAPSHOT",
    organization := "com.example",
    organizationName := "example",
    name := "airframe-sealed-error-example",
    libraryDependencies +=
      "org.wvlet.airframe" %% "airframe" % "20.2.0"
  )
