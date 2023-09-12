package com.systechafrica.part2.garbagecollection;

public class Demo {
    public static void main(String[] args) {
        Person ann = new Person("Ann",22);
        Person jonathan = new Person("Jonathan",21);
        Person aPerson = new Person("John",24);

        System.out.println(ann);
        System.out.println(jonathan);
        System.out.println(aPerson);

        ann=aPerson;
        jonathan=null;
        System.out.println(ann);
        jonathan= new Person("Jonathan",21);
        System.out.println(jonathan);

    }
}
