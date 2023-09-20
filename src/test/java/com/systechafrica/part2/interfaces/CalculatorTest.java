package com.systechafrica.part2.interfaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new CalculatorImpl(); // correct calculator implementation
    }

    @Test
    void summations() {
        // inputs
        int a = 10;
        int b = 20;
        // expected results
        int expectedResult = 30;
        // invoke the request to the actual function
        int actualResult = calculator.sum(a, b);
        /// verify results
        Assertions.assertEquals(expectedResult, actualResult);
    }

    class MockCalculator implements Calculator {

        @Override
        public int sum(int a, int b) {
            return 0;
        }

        @Override
        public int sum(int a, int b, int... otherValues) {
            return 0;
        }

    }
}
