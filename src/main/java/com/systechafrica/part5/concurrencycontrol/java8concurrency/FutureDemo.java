package com.systechafrica.part5.concurrencycontrol.java8concurrency;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureDemo {

    public static void main(String[] args) {

        ExecutorService service = Executors.newSingleThreadExecutor();

        System.out.println("Before submitting the task: "+ LocalDateTime.now());

        //asynchronous
        Future<Integer> resultFuture = service.submit(() -> {
            //throw new RuntimeException("Execution failed");
            //making a call to a url to obtain some data
            Thread.sleep(1000);
            return 8;
        });
        var submit = service.submit(() -> {
            //throw new RuntimeException("Execution failed");
            //making a call to a url to obtain some data
            Thread.sleep(1000);
            return 85;
        });


        System.out.println("After submitting the task proceed: "+LocalDateTime.now());
        //perform other tasks

        System.out.println(resultFuture.isDone());

        try {
//            System.out.println("resultFuture.get() = " + resultFuture.get() +" "+LocalDateTime.now() );
            System.out.println("resultFuture.get() = " + resultFuture.get(6, TimeUnit.SECONDS) +" "+LocalDateTime.now() );
            System.out.println(submit.get());
        }  catch (InterruptedException |ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }

        //! shutdown the executor service
        service.shutdown();
    }
}
