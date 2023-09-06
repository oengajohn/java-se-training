package com.systechafrica.part2.classes;

public class Car {
    // Class variables (attributes)
    String color;
    int speed;

    // Class methods (behavior)
    void startEngine() {
        System.out.println("Engine started!");
    }

    void accelerate() {
        speed += 10;
        System.out.println("Speed increased to " + speed + " km/h");
    }
}