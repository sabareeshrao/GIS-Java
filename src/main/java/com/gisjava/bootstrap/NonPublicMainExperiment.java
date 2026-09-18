package com.gisjava.bootstrap;

public final class NonPublicMainExperiment {

    // BATCH 002 | STEP 06 | Q0020
    // Intentional experiment: this method is static but not public.
    // The classic Java 21 launcher does not accept it as the standard entry point.
    static void main(String[] args) {
        System.out.println("This method is static but is not public.");
    }
}
