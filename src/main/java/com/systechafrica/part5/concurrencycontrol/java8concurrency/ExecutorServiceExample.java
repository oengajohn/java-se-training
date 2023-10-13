package com.systechafrica.part5.concurrencycontrol.java8concurrency;

import java.util.concurrent.ExecutorService;
  import java.util.concurrent.Executors;

  public class ExecutorServiceExample {
      public static void main(String[] args) {
          // Create a fixed-size thread pool with 3 worker threads.
          ExecutorService executor = Executors.newFixedThreadPool(3);

          // Submit Runnable tasks to the ExecutorService.
          for (int i = 1; i <= 5; i++) {
              final int taskNumber = i;
              executor.submit(() -> System.out.println("Task " + taskNumber + " executed by thread: " + Thread.currentThread().getName()));
          }

          // Shutdown the ExecutorService when done.
          executor.shutdown();
      }
  }