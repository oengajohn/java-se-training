package com.systechafrica.part5.concurrencycontrol.java8concurrency;

import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            // Simulate a time-consuming computation
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("FIRST: "+ LocalTime.now());
            return 42;
        });

        future.thenApply(result -> result * 2)
                .thenApply(result -> result * result)
                .thenAccept(finalResult -> {
                    System.out.println("Second: "+ LocalTime.now());
                    System.out.println("Result: " + finalResult);
                });

        // You can continue performing other tasks while the asynchronous computation is running

        // Block and wait for the result
        future.join();
    }
}