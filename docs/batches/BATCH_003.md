Batch 003 - Manual Java Toolchain and First JAR Artifact

Scope

Project order: P0011-P0015
Questions: Q0022, Q2224, Q2225, Q2226, Q2227
Phase: Java Platform, Entry Point and Basic Toolchain

Supplemental questions

None.

The five original questions already cover the complete project increment required by this batch.

Questions

Q0022
If the main() method is overloaded, can the JVM directly execute the overloaded version?

Q2224
What does the javac command do?

Q2225
What does the java launcher do?

Q2226
What does the jar tool do?

Q2227
What is the purpose of javap?

GIS hands-on objective

Move the GeoSurvey Operations Platform from Java source files to a manually compiled, runnable, packaged and inspectable Java artifact.

Step map

STEP 01 - Confirm the standard main entry-point signature - Q0022
STEP 02 - Confirm the overloaded main is called explicitly - Q0022
STEP 03 - Compile GeoSurvey sources with javac - Q2224
STEP 04 - Launch the compiled application with java - Q2225
STEP 05 - Package compiled classes with jar - Q2226
STEP 06 - Inspect JAR contents with jar --list - Q2226
STEP 07 - Inspect the compiled class signature with javap - Q2227

Build flow

.java source
    -> javac
.class bytecode
    -> java launcher
running application
    -> jar
JAR archive
    -> javap
compiled class inspection

Verification

Run:

./scripts/batch003-toolchain.sh

Expected application output:

GeoSurvey Operations Platform
Entry point: public static void main(String[] args)
Command-line argument count: 2
Overloaded main invoked explicitly for project: Austin Highway Corridor Survey

Expected JAR

out/gis-java-batch003.jar

Expected javap signature

Compiled from "GeoSurveyBootstrap.java"
public final class com.gisjava.bootstrap.GeoSurveyBootstrap {
  public static void main(java.lang.String[]);
  public static void main(java.lang.String);
}

Interview checkpoints

The Java launcher uses the standard main(String[] args) entry point and does not automatically choose another overloaded main method.

javac compiles Java source files into Java bytecode stored in .class files.

java starts the JVM and launches a Java class through its recognized application entry point.

jar packages classes and resources into a Java archive.

javap inspects information from compiled Java class files.

Batch boundary

This batch creates a JAR archive but does not yet configure the GeoSurvey application as an executable JAR.

Manifest files, Main-Class configuration, classpath behavior and deeper javap inspection belong to Batch 004.

Reuse rule

The JDK tools introduced here remain available throughout later build, debugging, packaging and production-diagnostics work.
