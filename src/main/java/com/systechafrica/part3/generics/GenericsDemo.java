package com.systechafrica.part3.generics;

public class GenericsDemo {
    public static void main(String[] args) {

    }

    public static void withGenerics() {

        MaizeFloor floor = new MaizeFloor();
        MaizeFloor floor2 = new MaizeFloor();
        MaizeFloor[] maizeFloors = { floor, floor2 };
        StorageGenerics<MaizeFloor> storage = new StorageGenerics<>();
        storage.store(maizeFloors);

        Bag bag1 = new Bag();
        Bag bag2 = new Bag();
        Bag[] bags = { bag1, bag2 };

        StorageGenerics<Bag> bagsStorage = new StorageGenerics<>();
        bagsStorage.store(bags);
        Bag bagStored = bagsStorage.store(bag2);
    }

    public static void withoutGenerics() {
        Storage storage = new Storage();

        MaizeFloor floor = new MaizeFloor();
        MaizeFloor floor2 = new MaizeFloor();
        MaizeFloor[] maizeFloors = { floor, floor2 };

        storage.store(maizeFloors);

        Bag bag1 = new Bag();
        Bag bag2 = new Bag();
        Bag[] bags = { bag1, bag2 };

        storage.store(bags);
    }
}


/*
 * 1. Create a reviewed amendment of your POS system
 * 2. Handle exceptions user input using custom exception classes
 * 3. Connect to the database
 * 4. Log to the file(log.txt) using date time | level | method | message
 */