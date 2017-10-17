val neoScalafmtVersion = "1.12"
addSbtPlugin("com.lucidchart" % "sbt-scalafmt" % neoScalafmtVersion)
addSbtPlugin("com.lucidchart" % "sbt-scalafmt-coursier" % neoScalafmtVersion)
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-RC12")
addSbtPlugin("org.wartremover" % "sbt-wartremover" % "2.2.0")
addSbtPlugin("com.github.tkawachi" % "sbt-doctest" % "0.7.0")