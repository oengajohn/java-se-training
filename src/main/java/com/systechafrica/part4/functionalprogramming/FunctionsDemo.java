package com.systechafrica.part4.functionalprogramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionsDemo {
    public static void main(String[] args) {
        Function<Student,Boolean> studentFunction  = student -> student.getEmail().equals("dummy@gmail.com");
        
        Student student = new Student(1, "Tony", "dummy@gmail.com", "001");
        Student student2 = new Student(2, "tony", "mackrine@gmail.com", "002");

        BiFunction<Student,Student,Boolean> studentCompare =  (studentOne, studentTwo) -> {
            // logic goes here
            System.out.println(studentOne.getFirstName());
            System.out.println(studentTwo.getFirstName());

            return studentOne.getFirstName().equalsIgnoreCase(studentTwo.getFirstName());
        };

        System.out.println(studentFunction.apply(student));
        System.out.println(studentCompare.apply(student, student2));
    }
}
