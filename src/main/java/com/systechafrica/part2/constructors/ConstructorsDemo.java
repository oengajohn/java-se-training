package com.systechafrica.part2.constructors;

import java.util.HashMap;
import java.util.Map;

public class ConstructorsDemo {

    public static void main(String[] args) {
        Book b1 = new Book(2022, "Introduction", true);
        Book b2 = new Book(2022, "Introduction", true);

        if (b1.equals(b2)) {
            System.out.println("Are equal");
        } else {
            System.out.println("Not equal");
        }

        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());

        Map<Integer, Book> books = new HashMap<>();
        books.put(b1.getIsbn(), b1);
        books.put(b2.getIsbn(), b2);
    

    }
}
