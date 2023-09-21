package com.systechafrica.part3.exceptionhandling;

public class Calculator {
    public double divide(int a, int b) {
        double result = 0.0;
        try {
            result= a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public double divide(long a, long b) {
        double result = 0.0;
        result= a / b;
        return result;
    }
    public int sum (int a, int b) throws MyCustomException{

        throw new MyCustomException("Method not implemented");
        // Exception e = new MyCustomException("Method not implemented");
    }
}
