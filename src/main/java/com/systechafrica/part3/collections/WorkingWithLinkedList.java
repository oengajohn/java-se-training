package com.systechafrica.part3.collections;

import java.util.LinkedList;

public class WorkingWithLinkedList {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");

        System.out.println(animals);
        System.out.println(animals.getFirst());
        System.out.println(animals.getLast());
        System.out.println(animals.get(0));

        animals.set(1, "human");

        System.out.println(animals);


        String name = animals.getLast();

        String newObject = "Test";

        // name.getNext() => null; 
        // name.setNext(newObject);
        // newObject.setNext(null);

        // animals.remove(0);

    }

}
