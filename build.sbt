name := """reactive-streams-end-to-end-example"""

version := "1.0"

scalaVersion := "2.11.7"

// add conf/ folder
unmanagedResourceDirectories in Compile += baseDirectory.value / "conf"

libraryDependencies ++= Seq(
  "com.iheart" %% "ficus" % "1.2.2",
  "com.sksamuel.elastic4s" %% "elastic4s-core" % "2.2.0",
  "com.sksamuel.elastic4s" %% "elastic4s-streams" % "2.2.0",
  "com.typesafe.akka" %% "akka-stream" % "2.4.2",
  "com.typesafe.slick" %% "slick" % "3.1.1",
  "org.postgresql" % "postgresql" % "9.4.1208"
)
