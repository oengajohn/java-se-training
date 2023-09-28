package com.systechafrica.part3.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class IteratorsDemoi {
    public static void main(String[] args) {
        // Map<KT,VT> map;
        List<String> johnNickNames = new ArrayList<>();
        johnNickNames.add("mhusika");
        johnNickNames.add("ntate");
        johnNickNames.add("yokana");

        Iterator<String> iterator = johnNickNames.iterator(); // allows forward traversal only
        ListIterator<String> listIterator = johnNickNames.listIterator();// allows forward and backward traversal only

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Student john = new Student("John", "001", "john@gmail.com");
        Student smith = new Student("Smith", "002", "smith@gmail.com");
        Student emily = new Student("Emily", "003", "emily@gmail.com");

        Set<Student> students = new HashSet<>();
        students.add(john);
        students.add(smith);
        students.add(emily);

        Iterator<Student> studentIterator = students.iterator();

        System.out.println(students);
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
            studentIterator.remove();
        }
        System.out.println(students);
    }
}
