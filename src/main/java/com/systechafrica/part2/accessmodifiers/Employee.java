package com.systechafrica.part2.accessmodifiers;

public class Employee {
    String id;
    String name;
    boolean contract;
    double salary;

    public Employee(){
        this.name = "Joe";
        this.contract = true;
        this.salary = 100.0;
    }
    

    public Employee(String name, boolean contract, double salary) {
        this.name = name;
        this.contract = contract;
        this.salary = salary;
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

    public boolean isContract() {
        return contract;
    }

    public void setContract(boolean contract) {
        this.contract = contract;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
}
