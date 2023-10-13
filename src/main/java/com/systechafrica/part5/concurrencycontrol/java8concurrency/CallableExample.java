package com.systechafrica.part5.concurrencycontrol.java8concurrency;

import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) {
        // Create an ExecutorService to manage the thread(s).
        ExecutorService executor = Executors.newSingleThreadExecutor();

            //! not allowed because the return type of  run method is void
         /*  Runnable threadTwoLogic = () -> {
              return 5;
          }; */

        // Create a Callable that returns a result of type Integer.
        Callable<Integer> callableTask = () -> {
            // Simulate a time-consuming computation
            Thread.sleep(2000);
            return 42;
        };

        // Use the ExecutorService to submit the Callable for execution.
        Future<Integer> future = executor.submit(callableTask);

        // Perform other tasks while waiting for the computation to complete

        try {
            // Block and get the result when it's ready
            Integer result = future.get();
            System.out.println("Computation result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shutdown the executor when done
        executor.shutdown();
    }
}