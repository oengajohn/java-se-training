package com.systechafrica.part2.inheritance.companysetup;

public class SoftwareEngineer extends Employee {

    private String title;

    public SoftwareEngineer(String employeeNo, String employeeName, String employeeAddress, String title) {
        super(employeeNo, employeeName, employeeAddress);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;

    }

    @Override
    public String toString() {
        return "Name: " + super.getEmployeeName() +
                " No: " + super.getEmployeeNo() +
                " Address: " + super.getEmployeeAddress() +
                " Title: " + this.getTitle();
    }

}
