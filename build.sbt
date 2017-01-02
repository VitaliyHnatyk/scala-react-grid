import sbt.Keys._

scalaVersion in ThisBuild := "2.12.1"

val `scalajs-grid` =
  project.in(file("src"))
    .enablePlugins(ScalaJSBundlerPlugin)
    .settings(commonSettings: _*)
    .settings(
      libraryDependencies ++= Seq(
        "com.github.japgolly.scalajs-react" %%% "core" % "0.11.3",
        "org.scala-js" %%% "scalajs-dom" % "0.9.0",
        "com.lihaoyi" %%% "scalatags" % "0.6.2",
        "com.lihaoyi" %%% "scalarx" % "0.3.2"
      )
    )



lazy val commonSettings =
  ScriptedPlugin.scriptedSettings ++ Seq(
    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-encoding", "UTF-8",
      "-unchecked",
      "-Xlint",
      "-Yno-adapted-args",
      "-Ywarn-dead-code",
      "-Ywarn-numeric-widen",
      "-Ywarn-value-discard",
      "-Xfuture"
    ),
    organization := "ch.epfl.scala",
    pomExtra :=
      <developers>
        <developer>
          <id>julienrf</id>
          <name>Julien Richard-Foy</name>
          <url>http://julien.richard-foy.fr</url>
        </developer>
      </developers>,

    licenses := Seq("MIT License" -> url("http://opensource.org/licenses/mit-license.php")),
    scriptedLaunchOpts += "-Dplugin.version=" + version.value,
    scriptedBufferLog := false
  )