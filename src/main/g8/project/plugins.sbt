addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "1.5.1")
addSbtPlugin("org.wartremover" % "sbt-wartremover" % "2.4.1")
// this might break things due to scalameta version inconsistencies
// with scalafmt if bumped
addSbtPlugin("com.github.tkawachi" % "sbt-doctest" % "0.8.0")
