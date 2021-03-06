enablePlugins(
  ReactificPlugin,
  ScriptedPlugin,
)

name := "sbt-openapi-codegen"
startYear := Some(2018)
codePackage := "com.reactific.sbt"
titleForDocs := "OpenAPI CodeGen Plugin For SBT"
sbtPlugin := true

initialCommands in console := """import com.reactific.sbt._"""

scalaVersion := "2.12.4"
logLevel := Level.Info

libraryDependencies ++= Seq(
  "io.swagger" % "swagger-codegen-cli" % "2.3.1",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)


// TESTING
// set up 'scripted; sbt plugin for testing sbt plugins
scriptedLaunchOpts ++= Seq("-Xmx1024M", "-Dplugin.version=" + version.value)
scriptedBufferLog := false
