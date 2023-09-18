package com.systechafrica.part2.staticclasses;

public class MathUtils {

    public static class Geometry {
        public static final double calculateArea(double x, double y) {
            return x * y;
        }

        public static final double calculatePerimeter(double x, double y) {
            return 2 * (x + y);
        }

    }

    public static class Calculator {
        public static int sum(int a, int b) {
            return a + b;
        }

        public static int sum(int a, int b, int c) {
            return a + b + c;
        }

        public static int sum(int a, int b, int... numbers) {
            int sum = a + b;
            for (int i = 0; i < numbers.length; i++) {
                sum+=numbers[i];
            }
            return sum;
        }
    }

}
