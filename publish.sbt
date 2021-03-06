
publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra := (
  <url>http://github.com/gilt/sbt-dependency-graph-sugar</url>
  <licenses>
    <license>
      <name>Apache2</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0.html</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:gilt/sbt-dependency-graph-sugar.git</url>
    <connection>scm:git:git@github.com:gilt/sbt-dependency-graph-sugar.git</connection>
  </scm>
  <developers>
    <developer>
      <id>ebowman</id>
      <name>Eric Bowman</name>
      <url>http://twitter.com/ebowman</url>
    </developer>
  </developers>)