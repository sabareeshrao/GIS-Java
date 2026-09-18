# Batch 001 - Java Platform and JVM Foundations

## Scope

- Project order: P0001-P0005
- Questions: Q0012-Q0016
- Phase: Java Platform and Setup

## Questions

### Q0012
What is the role of the JVM in making Java platform-independent?

### Q0013
Can a machine have multiple versions of JDK or JRE installed?

### Q0014
Can you tell me what JVM is and how it works?

### Q0015
If you were explaining to new developers how Java code executes, how would you describe the role of JVM in running a simple Java program that prints Hello World?

### Q0016
Can you tell me the difference between JDK, JRE and JVM?

## GIS hands-on objective

Introduce the GeoSurvey Operations Platform with the smallest possible executable Java class and use it to observe the runtime environment.

## Implementation

`GeoSurveyBootstrap` prints the application name, a runtime-foundation confirmation, the current Java version, the JVM implementation name, and the operating system.

The first execution chain is:

```text
.java source
    -> javac
.class bytecode
    -> JVM
operating-system execution
```

## Manual verification

Compile:

```bash
mkdir -p out
javac -d out src/main/java/com/gisjava/bootstrap/GeoSurveyBootstrap.java
```

Run:

```bash
java -cp out com.gisjava.bootstrap.GeoSurveyBootstrap
```

Observed during implementation:

```text
GeoSurvey Operations Platform
Java runtime foundation verified.
Java version: 21.0.11
JVM: OpenJDK 64-Bit Server VM
OS: Linux
```

## Interview checkpoints

- Java source is compiled to bytecode rather than directly to one operating system's machine code.
- A compatible platform-specific JVM executes the same bytecode on different operating systems.
- Multiple JDK versions can coexist; the active version depends on environment and tool configuration.
- The JVM loads and executes bytecode and provides runtime services such as memory management and JIT compilation.
- The JDK is the development kit, the JRE is the runtime-environment concept, and the JVM is the bytecode execution engine.

## Reuse rule

Completing these questions does not retire these concepts. JVM, JDK, runtime configuration and Java-version behavior will be reused and deepened in later build, debugging, performance and deployment batches.
