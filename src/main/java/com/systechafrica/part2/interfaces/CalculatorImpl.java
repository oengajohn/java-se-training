package com.systechafrica.part2.interfaces;

public class CalculatorImpl  implements Calculator{

    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int sum(int a, int b, int... otherValues) {
        int sum = a+b;
        for (int i=0; i<otherValues.length; i++){
            sum += otherValues[i];
        }
        return sum;
    }
    
}
