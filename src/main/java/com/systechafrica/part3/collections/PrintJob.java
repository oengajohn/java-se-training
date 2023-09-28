package com.systechafrica.part3.collections;


public class PrintJob {


    private String name;

    public PrintJob(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PrintJob [name=" + name + "]";
    }

    
    
}
