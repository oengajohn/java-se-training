package com.systechafrica.stringandstringbuilder;

import java.util.logging.Logger;

public class StringClassDemo {
    private static final Logger LOGGER = Logger.getLogger(StringClassDemo.class.getName());

    public static void main(String[] args) {

        //? strings are immutable that is once created then can't be modified 
        //? unless they are reassigned again


        //! Any operations on a string variable results in creation of a new string => immutability
        String message = "Hello";
        //no effect
        message.concat(" world!"); 
        // has effect by reassigning
        message =  message.concat(" Programmer!"); 
        LOGGER.info(message);
        
        String sb = new String("Hello, world");
        String sa = "Hello, world";
        boolean equals = sa.equals(sb);
        boolean equals2 = sa == sb;

        LOGGER.info(""+equals);
        LOGGER.info(""+equals2);
    }

}
