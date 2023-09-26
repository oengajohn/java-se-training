package com.systechafrica.part3.collections;

public class Student {
    private Integer id;
    private String name;
    private String regNo;
    private String email;

    public Student() {
    }

    public Student(String name, String regNo, String email) {
        this.name = name;
        this.regNo = regNo;
        this.email = email;
    }

    public Student(Integer id, String name, String regNo, String email) {
        this.id = id;
        this.name = name;
        this.regNo = regNo;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", regNo='" + regNo + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
