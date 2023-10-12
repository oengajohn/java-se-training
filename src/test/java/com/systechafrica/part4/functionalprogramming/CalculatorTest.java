package com.systechafrica.part4.functionalprogramming;

import java.util.function.Supplier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    Calculator calculator = (a, b, numbers) -> {
        int sum = a + b;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    };

    Divider divider = (a, b) -> a / b;

    @Test
    @DisplayName("Test calculation using calculate method")
    void testSum() {
        assertAll(
                () -> assertEquals(14, calculator.calculate(7, 7), "Expected result should be match"),
                () -> assertEquals(-10, calculator.calculate(-5, -5), "Expected result should be match"),
                () -> assertEquals(20, calculator.calculate(7, 3, 5, 4, 1), "Expected result should be match")

        );

    }
    @Test
    @DisplayName("Test calculation using divide method")
    void testDivide() {
        Supplier<String> lambdaFun = () -> "Expected result should be match";
        assertAll(
                () -> assertEquals(2, divider.divide(10, 5),lambdaFun),
                () -> assertEquals(5, divider.divide(-20, -4), lambdaFun),
                () -> assertThrows(ArithmeticException.class,()-> divider.divide(20, 0) )

        );

    }
}
