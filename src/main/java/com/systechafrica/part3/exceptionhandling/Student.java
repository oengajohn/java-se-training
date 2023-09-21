package com.systechafrica.part3.exceptionhandling;

public class Student {
    private String id;
    private String name;
    private String regNo;
    private String email;
    
    @Override
    public String toString() {
        return "Student [name=" + name + ", regNo=" + regNo + ", email=" + email + "]";
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
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
    
}
