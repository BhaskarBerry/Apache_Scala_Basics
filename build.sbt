name := "scala_basics"

version := "1.0-SNAPSHOT"

scalaVersion := "2.12.17"

scalacOptions in ThisBuild += "-deprecation"

libraryDependencies in ThisBuild ++= Seq(
  "org.scalactic"  %% "scalactic"  % "3.0.4",
  "org.scalatest"  %% "scalatest"  % "3.0.4"  % Test,
  "org.scalamock"  %% "scalamock"  % "4.1.0"  % Test,
  "org.scalacheck" %% "scalacheck" % "1.13.4" % Test
)
