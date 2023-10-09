package com.systechafrica.part4.functionalprogramming;

import java.time.LocalDate;
import java.time.Month;
import java.util.UUID;

public class Lambda {
    public static void main(String[] args) {

        // ? Single line lambda function
        LambdaFun func = () -> UUID.randomUUID().toString();

        // ? Multi line lambda function => use the curly braces and with a return
        // keyword if the function
        // ? returns a value
        LambdaFun func2 = () -> {
            String randomUUID = UUID.randomUUID().toString();
            System.out.println(randomUUID);
            return randomUUID.substring(9);
        };

        System.out.println(func.generateRandomUUID());
        System.out.println(func2.generateRandomUUID());

        // * Lambda function which does not return a value but takes in a single
        // parameter
        GenerateReport report = (student) -> {
            System.out.println("****SYSTECH INTERNSHIP PROGRAMME REPORT***");
            System.out.println("   NAME: " + student.getFirstName());
            System.out.println("   EMAIL: " + student.getEmail());
            System.out.println("   REG: " + student.getRegNo());
        };
        // * Lambda function which does not return a value but takes in a single
        // parameter
        // ? you can avoid the parenthesis when only its a single parameter
        GenerateReport report2 = student -> {
            System.out.println("****SYSTECH INTERNSHIP PROGRAMME REPORT***");
            System.out.println("   NAME: " + student.getFirstName());
            System.out.println("   EMAIL: " + student.getEmail());
            System.out.println("   REG: " + student.getRegNo());
        };

        // ? If the function takes a parameter and you want to specify the parameter type 
        // ? then you have to enclose the parameter in parenthesis even if the functions takes a single 
        // ? parameter
        GenerateReport report3 = (Student student) -> {
            System.out.println("****SYSTECH INTERNSHIP PROGRAMME REPORT***");
            System.out.println("   NAME: " + student.getFirstName());
            System.out.println("   EMAIL: " + student.getEmail());
            System.out.println("   REG: " + student.getRegNo());
        };

        Student student = new Student(1, "Tony", "tony@gmail.com", "001");
        Student student2 = new Student(2, "tony", "mackrine@gmail.com", "002");

        report.generateReport(student);
        report2.generateReport(student2);
        report3.generateReport(student2);

        // * Lambda function that takes in more than one parameter and returns a value
        // * You have to use parenthesis if there is more than one parameter
        StudentCompare studentCompare = (studentOne, studentTwo) -> {
            // logic goes here
            System.out.println(studentOne.getFirstName());
            System.out.println(studentTwo.getFirstName());

            return studentOne.getFirstName().equalsIgnoreCase(studentTwo.getFirstName());
        };

        // * Whenever you specify a parameter type for the first parameter,
        // * then you have to supply the types of all the parameters
        StudentCompare studentCompare2 = (Student studentOne, Student studentTwo) -> {
            // logic goes here
            System.out.println(studentOne.getFirstName());
            System.out.println(studentTwo.getFirstName());

            return studentOne.getFirstName().equalsIgnoreCase(studentTwo.getFirstName());
        };
        CompareFunction<Student,Student,Boolean> studentCompare3 = (Student studentOne, Student studentTwo) -> {
            // logic goes here
            System.out.println(studentOne.getFirstName());
            System.out.println(studentTwo.getFirstName());

            return studentOne.getFirstName().equalsIgnoreCase(studentTwo.getFirstName());
        };
        CompareFunction<LocalDate,LocalDate,Boolean> dateCompare = (date1,date2) -> date1.isAfter(date2);

        System.out.println(studentCompare.compare(student, student2));
        System.out.println(studentCompare2.compare(student, student2));
        System.out.println(studentCompare3.compare(student, student2));
        System.out.println(dateCompare.compare(LocalDate.now(),LocalDate.of(2023, Month.JANUARY,1)));

    }
}
