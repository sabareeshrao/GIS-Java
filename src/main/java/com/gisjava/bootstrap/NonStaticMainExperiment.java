package com.gisjava.bootstrap;

public final class NonStaticMainExperiment {

    // BATCH 002 | STEP 05 | Q0019
    // Intentional experiment: this main method is not static.
    // It compiles as a normal instance method but cannot be used
    // as the classic Java 21 application entry point.
    public void main(String[] args) {
        System.out.println("This method is an instance method and cannot be used as the classic Java application entry point.");
    }
}
