package com.systechafrica.part5.concurrencycontrol.java8concurrency;

import java.util.concurrent.ExecutorService;
  import java.util.concurrent.Executors;

  public class SingleThreadExecutorExample {
      public static void main(String[] args) {
          // Create a single-threaded ExecutorService
          ExecutorService executor = Executors.newSingleThreadExecutor();

          // Submit tasks to the ExecutorService
          for (int i = 1; i <= 5; i++) {
              final int taskNumber = i;
              executor.submit(() -> {
                  System.out.println("Task " + taskNumber + " executed by thread: " + Thread.currentThread().getName());
              });
          }

          // Shutdown the ExecutorService when done
          executor.shutdown();
      }
  }