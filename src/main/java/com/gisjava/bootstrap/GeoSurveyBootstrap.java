package com.gisjava.bootstrap;

public final class GeoSurveyBootstrap {

    private GeoSurveyBootstrap() {
    }

    public static void main(String[] args) {
        System.out.println("GeoSurvey Operations Platform");
        System.out.println("Java runtime foundation verified.");
        System.out.println("Java version: " + System.getProperty("java.version"));
        System.out.println("JVM: " + System.getProperty("java.vm.name"));
        System.out.println("OS: " + System.getProperty("os.name"));
    }
}
