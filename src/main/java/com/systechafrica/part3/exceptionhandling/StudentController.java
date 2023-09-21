package com.systechafrica.part3.exceptionhandling;

import java.util.UUID;

public class StudentController {
    
    public void addStudent(Student student) throws StudentDetailsMissingException {
        if(student == null){
            throw new StudentDetailsMissingException("No correct student details supplied");
        }

        student.setId(UUID.randomUUID().toString());
    }
}
