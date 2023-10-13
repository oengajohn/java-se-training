package com.systechafrica.part4.functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ConsumersDemo {
    public static void main(String[] args) {
        List<Integer> integers = List.of(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11
        );


        List<String> listVal = Arrays.asList(
                "Joe", "Paul", "Alice", "Tom"
        );
        List<String> str = Arrays.asList(
                "my", "pen", "is", "your", "pen"
        );
        Predicate<? super String> pres = s -> {
            int i = 0;
            boolean result = s.contains("pen");
            System.out.print((i++) + ":");
            return result;
        };
        str.stream().filter(pres)
               
                .findFirst()
                .ifPresent(System.out::print);


        System.out.println("\nothers");
        //stream
        Stream<Integer> integerStream = integers.stream();

        //intermediary operations filter
        Predicate<Integer> integerPredicate = number -> number % 2 != 0;
        Stream<Integer> filteredStream = integerStream.filter(integerPredicate);
        //intermediary operations map
        Stream<Integer> mappedStream = filteredStream.map(number -> number * 2);

        //? Consumer Represents an operation that accepts a single input argument and returns no result.
        Consumer<Integer> integerConsumer = number -> System.out.println(number);

        // terminating operation stream
        mappedStream.forEach(integerConsumer);

        BiConsumer<Integer, Integer> biConsumer = (a, b) -> printInfo(a, b);
        biConsumer.accept(5, 10);

    }

    private static void printInfo(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
