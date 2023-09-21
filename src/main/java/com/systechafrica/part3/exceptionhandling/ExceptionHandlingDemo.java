package com.systechafrica.part3.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        ExceptionHandlingDemo app = new ExceptionHandlingDemo();
        // app.workingwithBasicExceptions(calculator);
        app.workingWithException();

    }

    private Student readStudentDetails() {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter your details space separated: ");
            String name = scanner.next();
            student.setName(name);
            String regNo = scanner.next();
            student.setRegNo(regNo);
            String email = scanner.next();
            student.setEmail(email);
            System.out.println("Enter your age: ");
            int age = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter correct age ");
        }finally{
            System.out.println("Release resources...");
            scanner.close();
        }
        return student;

    }

    private void workingWithException() {
        StudentController studentController = new StudentController();
        try {
            studentController.addStudent(readStudentDetails());
            // send message
            SMSSender sender = new SMSSender();
            sender.sendMessage("Your details have been saved");
        } catch (StudentDetailsMissingException e) {
            System.out.println(e.getMessage());
        } finally {
            // release resources
            studentController = null;
            System.out.println("Executes no matter");
        }

    }

    private void workingwithBasicExceptions() {
        Calculator calculator = new Calculator();
        try {
            double result = calculator.divide(6L, 0L);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            calculator.sum(2, 2);
            try {
                calculator.divide(0, 0);
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Processing data...");
    }
}
