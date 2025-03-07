// Copyright (C) Lightbend Inc. <https://www.lightbend.com>

addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.9.0")

addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.4.3")

// the plugins used during release can have an impact on default values
// of the build. To validate your changes on the release plugins don't
// affect the release process, review https://github.com/lagom/lagom/issues/1496#issuecomment-408398508
addSbtPlugin("de.heikoseeberger" % "sbt-header" % "5.6.0")

addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.5.9")

addSbtPlugin("com.typesafe.sbt" % "sbt-multi-jvm"   % "0.4.0")
addSbtPlugin("com.typesafe"     % "sbt-mima-plugin" % "0.7.0")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.10.0-RC1")

addSbtPlugin("com.lightbend.sbt" % "sbt-java-formatter" % "0.7.0")
addSbtPlugin("org.scalameta"     % "sbt-scalafmt"       % "2.3.4")

addSbtPlugin("com.lightbend.akka" % "sbt-akka-version-check" % "0.1")

addSbtPlugin("com.lightbend.sbt" % "sbt-bill-of-materials" % "1.0.2")
