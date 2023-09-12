package com.systechafrica.part2.inheritance.math;

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(15.23, 20.12);
        calculator.sum(15, 20);
        calculator.sum(15L, 20L);
        calculator.sum(15L,20);
        //! sum method is taking different forms depending on the number of arguments,
        //!  data type, return type, access modifier, sequence of arguments
        
    }
    
}
