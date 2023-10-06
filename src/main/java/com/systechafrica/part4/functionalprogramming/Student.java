package com.systechafrica.part4.functionalprogramming;

import java.util.Objects;

public class Student {
    private int id;
    private String firstName;
    private String email;
    private String regNo;


    public Student() {
    }

    public Student(int id,String firstName, String email, String regNo) {
        this.id = id;
        this.firstName = firstName;
        this.email = email;
        this.regNo = regNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", regNo='" + regNo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(firstName, student.firstName) && Objects.equals(email, student.email) && Objects.equals(regNo, student.regNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, email, regNo);
    }
}
