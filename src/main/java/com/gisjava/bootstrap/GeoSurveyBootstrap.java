package com.gisjava.bootstrap;

public final class GeoSurveyBootstrap {

    // BATCH 001 | STEP 01 | Q0012-Q0016
    // Prevents direct construction of this runtime bootstrap utility.
    private GeoSurveyBootstrap() {
    }

    // BATCH 001 | STEP 02 | Q0012-Q0016
    // Provides the classic Java application entry point introduced with the JVM foundation.
    // BATCH 002 | STEP 01 | Q0017
    // Demonstrates each part of public static void main(String[] args).
    // BATCH 003 | STEP 01 | Q0022
    // The Java launcher selects this standard signature, not the overloaded main(String) method.
    public static void main(String[] args) {
        // BATCH 002 | STEP 02 | Q0017
        // Shows the application identity and the number of command-line arguments received.
        System.out.println("GeoSurvey Operations Platform");
        System.out.println("Entry point: public static void main(String[] args)");
        System.out.println("Command-line argument count: " + args.length);

        // BATCH 002 | STEP 03 | Q0018
        // Explicitly invokes the overloaded main method.
        main("Austin Highway Corridor Survey");
    }

    // BATCH 002 | STEP 04 | Q0018
    // Demonstrates that main can be overloaded with a different parameter list.
    // BATCH 003 | STEP 02 | Q0022
    // This overload is an ordinary method and runs only when application code calls it explicitly.
    public static void main(String projectName) {
        System.out.println("Overloaded main invoked explicitly for project: " + projectName);
    }
}
