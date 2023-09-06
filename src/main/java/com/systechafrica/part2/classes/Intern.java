package com.systechafrica.part2.classes;

import java.util.logging.Logger;

public class Intern {
    private static final Logger LOGGER = Logger.getLogger(Intern.class.getName());

    String name;
    String phoneNumber;
    String email;

    public Intern(String name, String phoneNumber, String email){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.doAssignment();
    }
    public Intern(){

    }



    public void attendClass() {
        LOGGER.info("Attended class");

    }

    public void doAssignment() {
        LOGGER.info("Do Assignment");
    }
}
