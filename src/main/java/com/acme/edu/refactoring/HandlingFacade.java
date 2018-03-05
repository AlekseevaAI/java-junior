package com.acme.edu.refactoring;

public class HandlingFacade {
    private static LoggerHandler intHandler = new IntHandler();
    private static LoggerHandler stringHandler = new StringHandler();

    public static void log(int message) {
        intHandler.handle(message);
    }
}
