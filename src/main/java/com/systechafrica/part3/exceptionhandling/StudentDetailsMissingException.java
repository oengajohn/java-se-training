package com.systechafrica.part3.exceptionhandling;

public class StudentDetailsMissingException extends Exception {

    public StudentDetailsMissingException(String message){
        super(message);
    }
}
