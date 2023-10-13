package com.systechafrica.part5.concurrencycontrol.java8concurrency;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        // Schedule a task to run after an initial delay of 1 second and then every 2 seconds.
        Runnable task = () -> {
            System.out.println("Task executed at " + LocalTime.now());
            //call stock api to get the rate
        };
        
//        executor.scheduleAtFixedRate(task, 1, 2, TimeUnit.SECONDS);
        executor.scheduleWithFixedDelay(task, 1, 2, TimeUnit.SECONDS);
    }
}