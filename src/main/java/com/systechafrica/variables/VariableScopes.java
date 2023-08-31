package com.systechafrica.variables;

import java.util.logging.Logger;

public class VariableScopes {
    private static final Logger LOGGER = Logger.getLogger(VariableScopes.class.getName());

    // class variables => they are defined as variables declared outside any class
    // method

    // class scope variables
    private int noOfMatchesPlayed = 3;

    public void simpleMethod() {
        LOGGER.info("simple method output: " + noOfMatchesPlayed);

    }

    public void complexMethod() {
        LOGGER.info("complex method output: " + noOfMatchesPlayed);
    }

    public int addTwoNumbers(int a, int b) { // method variable scope  => variables defined as parameters and 
        // variables declared in the outermost part of the method
        // only available as long the method is executing
        int result = a + b;
        for ( int i = 0; i < 5; i++) {
            LOGGER.info("method output: " + i);
        }


        return result;
    }

    public static void main(String[] args) {
        VariableScopes app = new VariableScopes();
        app.simpleMethod();
        app.complexMethod();
        app.addTwoNumbers(5,3);
        LOGGER.info("main method output " + app.noOfMatchesPlayed);

    }

}
