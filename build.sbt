// Based roughly on https://xerial.org/blog/2014/03/24/sbt/

// Project Name
name := "SBT Example for Java"

// Organization Name / Package name for the project
organization := "com.example-org"

// Package Version
version := "0.1-SNAPSHOT"

// Package Description
description := "Example sbt configuration for a Java project"

// Compatability with maven
publishMavenStyle := true

// No scala version appended to generated artifacts
crossPaths := false

// No scala libs
autoScalaLibrary := false

// Dependencies
libraryDependencies ++= Seq(
  // Test mocking
  "org.mockito" % "mockito-core" % "1.10.19" % "test",
  // Logging
  "org.slf4j" % "slf4j-api" % "1.7.12",
  // Dependency Injection
  "com.google.inject" % "guice" % "4.0",
  // Unit tests
  "junit" % "junit" % "4.12" % "test",
  // Unit test runner
  "com.novocode" % "junit-interface" % "0.11" % "test"

)
