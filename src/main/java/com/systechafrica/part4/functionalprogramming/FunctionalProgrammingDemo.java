package com.systechafrica.part4.functionalprogramming;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FunctionalProgrammingDemo {
    public static void main(String[] args) {
        FunctionalProgrammingDemo app = new FunctionalProgrammingDemo();
//        app.functions();
//        app.lambdaInFunction();
        // filterAndMapNormalWay();
        filterAndMapChaining();
    }

    public static void printInfo(List<Integer> list, Predicate<Integer> evenNumberFunction) {
        list.stream()
                .filter(evenNumberFunction)
                .forEach(System.out::println);

    }

    public static void filterAndMapChaining() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(number -> System.out.println(number));

       Predicate<Integer> evenFunctionFilter =  number -> number % 2 == 0;

        printInfo(numbers, evenFunctionFilter);
    }

    public static void filterAndMapNormalWay() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        //create a stream
        Stream<Integer> stream = numbers.stream();

        // filter a stream => creates a new stream
//        stream.filter(number -> evenNumbers(number));
        Stream<Integer> filteredStream = stream.filter(number -> number % 2 == 0);
        //map -> transformation
//        Stream<Integer> squareIntegerStream = filteredStream.map(number -> mapToSquare(number));
        Stream<Integer> squareIntegerStream = filteredStream.map(number -> number * number);

        //display final product
        squareIntegerStream.forEach(number -> System.out.println(number));


    }

    public static boolean evenNumbers(int number) {
        return number % 2 == 0;
    }

    public static int mapToSquare(int number) {
        return number * number;
    }

    public void lambdaInFunction() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        integers.forEach(number -> System.out.println(number));
        //integers.forEach(System.out::println); //equivalent to one above

    }

    public void functions() {

        Calculator calculator2 = (a, b, numbers) -> {
            int sum = a + b;
            for (int number : numbers) {
                sum += number;
            }
            return sum;
        };

        System.out.println(calculator2.calculate(5, 6));
        System.out.println(calculator2.calculate(5, 6, 5, 9, 7, 23, 85));

    }
    /*
     Calculator calculator = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a+b;
            }
        };
     */
}
