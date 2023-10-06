package com.systechafrica.part4.functionalprogramming;

public class StudentDto {
    private String firstName;
    private String regNo;

    public StudentDto(String firstName, String regNo) {
        this.firstName = firstName;
        this.regNo = regNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getRegNo() {
        return regNo;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "firstName='" + firstName + '\'' +
                ", regNo='" + regNo + '\'' +
                '}';
    }
}
