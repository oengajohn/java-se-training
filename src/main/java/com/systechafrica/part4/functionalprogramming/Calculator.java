package com.systechafrica.part4.functionalprogramming;

@FunctionalInterface
public interface Calculator {
    abstract int calculate(int a, int b, int... numbers);

    default int sum(int a, int b) {
        return a + b;
    }
    static String printInfo(){
        return "Functional programming";
    }
}
