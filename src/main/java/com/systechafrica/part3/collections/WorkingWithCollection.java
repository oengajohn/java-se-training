package com.systechafrica.part3.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WorkingWithCollection {
    public static void main(String[] args) {
//        workingWithListAndArrayList();
        workingWithSetAndHashSet();
    }

    private static void workingWithSetAndHashSet() {
        Student john = new Student("John","001","john@gmail.com");
        Student smith = new Student("Smith","002","smith@gmail.com");
        Student emily = new Student("Emily","003","emily@gmail.com");

        Set<Student> students = new HashSet<>();
        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);



        students.add(john);
        students.add(smith);
        students.add(emily);

        System.out.println("students.size() = " + students.size());
        System.out.println("students.isEmpty() = " + students.isEmpty());
        System.out.println("students.contains(john) = " + students.contains(john));

        printSet(students);

        students.remove(john);
        System.out.println();
        printSet(students);




    }

    private static void printSet(Set<Student> students) {
        for ( Student student : students) {
            System.out.println(student);
        }
    }


    private static void workingWithListAndArrayList() {
        List<Student> students = new ArrayList<>();
        Student john = new Student("John","001","john@gmail.com");
        Student smith = new Student("Smith","002","smith@gmail.com");
        //add values
        students.add(john);
        students.add(john);
        students.add(smith);
        students.add(john);
        students.add(smith);
        printList(students);
        //checking values
        System.out.println(students.contains(john));
        Student emily = new Student("Emily","003","emily@gmail.com");
        System.out.println("After update");
        //updating values
        students.set(0,emily);
        printList(students);
        System.out.println(students.contains(john));
        //indexof
        System.out.println("students.indexOf(emily) = " + students.indexOf(emily));
        System.out.println("students.indexOf(smith) = " + students.indexOf(smith));

        System.out.println("students.size() = " + students.size());

        //remove
        students.remove(smith);
        printList(students);

        List<Student> finalList = new ArrayList<>(students);
        printList(finalList);
        //clear
        students.clear();
        printList(students);
        System.out.println("students.isEmpty() = " + students.isEmpty());


    }

    private static void printList(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}
