package com.systechafrica.part4.functionalprogramming;

import java.util.List;
import java.util.stream.Collectors;

public class FilteringAndMapping {
    public static void main(String[] args) {
        //workingWithFilterAndMapOnObjectClasses();

        // mapToIntOrDoubleWithterminatingFunctions();

//        usingReducingFunctions();

        // functionMatchers();

//        intermediaryOperations();

        List<Integer> numbers = List.of(85,100, 225, 3955, 4485, 5, 225, 785, 100, 9, 1000);
        numbers.stream()
                .peek(System.out::println)
                .filter(x -> x %2 == 0)
                .peek(System.out::println)
                .forEach(number -> System.out.println(" number = " + number));


    }

    private static void intermediaryOperations() {
        List<Integer> numbers = List.of(85,100, 225, 3955, 4485, 5, 225, 785, 100, 9, 1000);
        int  anyNumber = numbers.stream()
                .findAny().get();
        List<String> nickNames = List.of("Mhusika","Ntate","Yokana","JayO");

        String firstNickName = nickNames.parallelStream()
                .findFirst().get();

        System.out.println(anyNumber);
        System.out.println("firstNickName = " + firstNickName);
        System.out.println("limiting");
        numbers.stream()
                .limit(3)

                .forEach(System.out::println);
        System.out.println("Skipping and limiting");
        numbers.stream()
                .skip(2)
                .limit(3)
                .forEach(System.out::println);
        System.out.println("Sorting");
        numbers.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("Distinct");
        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }

    private static void functionMatchers() {
        List<Integer> numbers = List.of(100, 225, 3955, 4485, 5, 6, 785, 8, 9, 1000);

        boolean anyMatchGreaterThanOrEqualTo1000 = numbers.stream()
                .anyMatch(x -> x >= 1000);
        boolean allMatchGreaterThanOrEqualTo1000 = numbers.stream()
                .allMatch(x -> x >= 1000);
        boolean noneMatchGreaterThanOrEqualTo1000 = numbers.stream()
                .noneMatch(x -> x >= 1000);

        System.out.println("anyMatchGreaterThanOrEqualTo1000 = " + anyMatchGreaterThanOrEqualTo1000);
        System.out.println("allMatchGreaterThanOrEqualTo1000 = " + allMatchGreaterThanOrEqualTo1000);
        System.out.println("noneMatchGreaterThanOrEqualTo1000 = " + noneMatchGreaterThanOrEqualTo1000);
    }

    private static void usingReducingFunctions() {
        List<Integer> numbers = List.of(100, 225, 3955, 4485, 5, 6, 785, 8, 9, 10000);
       /*  int minNormal = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < minNormal) {
                minNormal = numbers.get(i);
            }
        }

        int maxNormal = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > minNormal) {
                maxNormal = numbers.get(i);
            }
        } */


        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .reduce(0, Integer::sum);
        int sumUsingInbuiltReduce = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        int product = numbers.stream()
                .mapToInt(Integer::intValue)
                .reduce(1, (a, b) -> a * b);
        int min = numbers.stream()
                .mapToInt(Integer::intValue)
                .min().getAsInt();
        int max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max().getAsInt();

        long count = numbers.stream()
                .filter(number -> number % 2 == 0)
                .count();
        System.out.println("count = " + count);


        System.out.println("sum = " + sum);
        System.out.println("sumUsingInbuiltReduce = " + sumUsingInbuiltReduce);
        System.out.println("product = " + product);
        System.out.println("min = " + min);
//        System.out.println("minNormal = " + minNormal);
        System.out.println("max = " + max);
//        System.out.println("maxNormal = " + maxNormal);
    }

    private static void mapToIntOrDoubleWithterminatingFunctions() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        /* int sum = 0;
        for (int number : numbers) {
            if(number %2 == 0){
                sum+=number;
            }

        } */

     /*   double sum = numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToDouble(number -> number.doubleValue())
                        .sum();
 */
        double sum = numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToDouble(Integer::doubleValue)
                .sum();
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(Integer::intValue)
                .forEach(System.out::println);


        System.out.println("sum = " + sum);
    }

    private static void workingWithFilterAndMapOnObjectClasses() {
        List<Student> students = List.of(
                new Student(1, "Tony", "tony@gmail.com", "001"),
                new Student(2, "Mackrine", "mackrine@gmail.com", "002"),
                new Student(3, "Lena", "lena@gmail.com", "003"),
                new Student(4, "Martin", "martin@gmail.com", "004"),
                new Student(5, "Halkano", "halkano@gmail.com", "005")
        );

        List<StudentDto> studentDtos = students.stream()
                .filter(student -> student.getId() % 2 == 0)
                .map(FilteringAndMapping::mapToStudentDto)
                .collect(Collectors.toList());
        for (StudentDto studentDto : studentDtos) {
            System.out.println(studentDto);
        }
    }

    private static StudentDto mapToStudentDto(Student student) {
        return new StudentDto(student.getFirstName(), student.getRegNo());
    }
}
