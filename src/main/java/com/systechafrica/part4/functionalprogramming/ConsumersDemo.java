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
/*
? Represents a predicate (boolean-valued function) of one argument.
Predicate ->  boolean test(T t)

? Represents a predicate (boolean-valued function) of two arguments.
? This is the two-arity specialization of Predicate
BiPredicate ->  boolean test(T t, U u)

? Represents a function that accepts one argument and produces a result.
Function -> R apply(T t);

? Represents a function that accepts two arguments and produces a result.
? This is the two-arity specialization of Function.
BiFunction -> R apply(T t, U u);

? Represents an operation that accepts a single input argument and returns no result.
? Unlike most other functional interfaces, Consumer is expected to operate via side-effects.
Consumer -> void accept(T t);

? Represents an operation that accepts two input arguments and returns no result.
? This is the two-arity specialization of Consumer.
? Unlike most other functional interfaces, BiConsumer is expected to operate via side-effects.
BiConsumer -> void accept(T t, U u);

? Represents a supplier of results.
Supplier -> T get();

 */
