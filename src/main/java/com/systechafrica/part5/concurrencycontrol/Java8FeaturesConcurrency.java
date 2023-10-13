package com.systechafrica.part5.concurrencycontrol;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Java8FeaturesConcurrency {
    public static void main(String[] args) {
        ExecutorService  executorService = Executors.newSingleThreadExecutor();

        Runnable printNumberTo10 = ()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        };
        Runnable printRandomTo10 = ()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(new Random().nextInt());
            }
        };

        executorService.execute(printNumberTo10);
        executorService.execute(printRandomTo10);
    }
}
