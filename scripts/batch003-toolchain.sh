#!/usr/bin/env bash
set -euo pipefail

# BATCH 003 | STEP 03 | Q2224
# Compile the current GeoSurvey Java sources into .class files.
rm -rf out
mkdir -p out/classes
javac -d out/classes src/main/java/com/gisjava/bootstrap/*.java

# BATCH 003 | STEP 04 | Q2225
# Launch the standard GeoSurvey application entry point from compiled classes.
java -cp out/classes com.gisjava.bootstrap.GeoSurveyBootstrap north south

# BATCH 003 | STEP 05 | Q2226
# Package the compiled classes into a JAR archive.
jar --create --file out/gis-java-batch003.jar -C out/classes .

# BATCH 003 | STEP 06 | Q2226
# List the contents of the generated JAR archive.
jar --list --file out/gis-java-batch003.jar

# BATCH 003 | STEP 07 | Q2227
# Inspect the compiled GeoSurveyBootstrap class signature.
javap -classpath out/classes com.gisjava.bootstrap.GeoSurveyBootstrap
