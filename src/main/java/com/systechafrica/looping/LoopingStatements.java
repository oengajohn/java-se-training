package com.systechafrica.looping;

import java.util.logging.Logger;

public class LoopingStatements {
    private static final Logger LOGGER = Logger.getLogger(LoopingStatements.class.getName());

    public void forLoop(){
        // initialize condition update
        for( int counter = 0;  counter <= 10;  counter = counter + 1 )        {
            LOGGER.info("Count = "+ counter);
        }
    }

    public static void main(String[] args) {
        LoopingStatements app = new LoopingStatements();
        app.forLoop();

    }
}
