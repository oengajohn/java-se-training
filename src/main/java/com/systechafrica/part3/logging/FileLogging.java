package com.systechafrica.part3.logging;

import java.io.IOException;
import java.util.logging.*;


public class FileLogging {
    private static final Logger LOGGER = Logger.getLogger(FileLogging.class.getName());

    public static void main(String[] args) throws SecurityException, IOException {
        FileHandler fileHandler = new FileHandler("log.txt");
        CustomFormatter formatter = new CustomFormatter();
        LOGGER.addHandler(fileHandler);
        fileHandler.setFormatter(formatter);

        LOGGER.info("Info message logging\n");
        LOGGER.severe("Error message logging\n");
        LOGGER.warning("Warning message logging\n");
        test();

    }
    public static void test(){
        LOGGER.info("Info message logging test\n");
        LOGGER.severe("Error message logging test\n");
        LOGGER.warning("Warning message logging test\n");
    }

    static class CustomFormatter extends Formatter {

        @Override
        public String format(LogRecord record) {
            String method = record.getSourceMethodName();
            String level = record.getLevel().getName();
            String message = record.getMessage();
            return method+ " | "+ level+" | "+ message;
        }
    }
}
