package com.systechafrica.part2.interfaces;

public interface CalculatePerimeter {
    double calculatePerimeter(double x, double y);

    // ! Java 1.8+ => You can have default implementation logic on the interface
    default double sum(int a, int b) {
        return 0;
    }

}
