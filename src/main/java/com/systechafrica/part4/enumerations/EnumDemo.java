package com.systechafrica.part4.enumerations;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;

public class EnumDemo {
    public static void main(String[] args) {
        Order order = new Order(
                Instant.now(),
                25000.00,
                "001-125-Nairobi",
                OrderStatus.PLACED
        );
        LocalDate tomorrow = LocalDate.of(2023, Month.JANUARY,01);

        LocalDate tomorro2 = LocalDate.of(2023, 01,01);

        System.out.println("order = " + order);
        switch (order.getOrderStatus()){
            case PLACED:
                System.out.println("Order placed");
                break;
            case CANCELLED:
                System.out.println("Order cancelled");
                break;
            case SHIPPED:
                System.out.println("Order shipped");
                break;
            case SHIPPING:
                System.out.println("Order shipping...");
        }
    }
}
