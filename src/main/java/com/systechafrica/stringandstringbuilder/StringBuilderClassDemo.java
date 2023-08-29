package com.systechafrica.stringandstringbuilder;

import java.util.logging.Logger;


public class StringBuilderClassDemo {
    private static final Logger LOGGER = Logger.getLogger(StringBuilderClassDemo.class.getName());

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(100); //capacity and not the number of characters
        sb.append(" ");
        String str = " ";

        boolean equals = str.equals(sb.toString()); // str == sb.toString(); comparing addresses -> false
        LOGGER.info(""+equals);

        
        


    }

}
