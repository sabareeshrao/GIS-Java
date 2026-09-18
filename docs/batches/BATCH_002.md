Batch 002 - Main Method and Application Entry Point

Scope

Project order: P0006-P0010
Questions: Q0017-Q0021
Phase: Java Platform and Setup

Questions

Q0017
Can you explain public static void main(String[] args) and why each term is used?

Q0018
Can we overload the main() method?

Q0019
What will happen if we do not declare the main() method as static?

Q0020
Why is the main method public and static?

Q0021
Can we override this main method?

GIS hands-on objective

Use the GeoSurvey bootstrap classes to understand the Java application entry point, main method overloading, invalid launcher signatures, and static method hiding.

Step map

STEP 01 - Standard Java entry point - Q0017
STEP 02 - Command-line arguments - Q0017
STEP 03 - Explicit overloaded-main call - Q0018
STEP 04 - Overloaded main implementation - Q0018
STEP 05 - Non-static main experiment - Q0019
STEP 06 - Non-public main experiment - Q0020
STEP 07 - Parent static main - Q0021
STEP 08 - Static method hiding - Q0021

Implementation

GeoSurveyBootstrap remains the normal application entry point.

It now demonstrates the standard main signature, command-line argument counting, and main method overloading.

NonStaticMainExperiment intentionally declares an instance main(String[] args) method.

NonPublicMainExperiment intentionally declares a package-private static main(String[] args) method.

SurveyLauncherBase and GeoSurveyLauncher each declare a static main(String[] args) method to demonstrate static method hiding rather than overriding.

Compile all Batch 002 classes

rm -rf out
mkdir -p out
javac -d out src/main/java/com/gisjava/bootstrap/*.java

Experiment 1 - Standard main and overloaded main

Command:

java -cp out com.gisjava.bootstrap.GeoSurveyBootstrap north south

Expected output:

GeoSurvey Operations Platform
Entry point: public static void main(String[] args)
Command-line argument count: 2
Overloaded main invoked explicitly for project: Austin Highway Corridor Survey

Experiment 2 - Non-static main

Command:

java -cp out com.gisjava.bootstrap.NonStaticMainExperiment

Expected result:

The Java 21 launcher rejects the method because main(String[] args) is not static.

Experiment 3 - Non-public main

Command:

java -cp out com.gisjava.bootstrap.NonPublicMainExperiment

Expected result:

The Java 21 launcher rejects the method because it does not match the public static main(String[] args) entry point used by this project.

Experiment 4 - Static main method hiding

Run:

java -cp out com.gisjava.bootstrap.SurveyLauncherBase

Expected output:

SurveyLauncherBase main method executed.

Run:

java -cp out com.gisjava.bootstrap.GeoSurveyLauncher

Expected output:

GeoSurveyLauncher main method executed.

GeoSurveyLauncher.main(String[] args) does not override SurveyLauncherBase.main(String[] args).

Both methods are static, so the child method hides the parent static method.

Interview checkpoints

public makes the classic main entry point accessible to the Java launcher.

static allows the launcher to invoke the method without creating an application object first.

void means the method returns no Java value.

main is the classic application entry-point method name used by this Java 21 project.

String[] args receives command-line arguments.

The main method can be overloaded.

Other overloaded main methods are not automatically selected as the standard Java entry point.

A non-static main method can compile as an ordinary instance method but cannot serve as the classic Java 21 entry point used by this project.

Static methods are hidden rather than overridden.

Reuse rule

Completing these questions does not retire the main method, static methods, command-line arguments, inheritance, or method overloading.

These concepts will be reused in later batches.
