package com.systechafrica.part5.concurrencycontrol;

public class MultiThreadingDemo {
    public static void main(String[] args) {
        SynchronizationExample se = new SynchronizationExample();

        MyThread firstThread = new MyThread(1,se);
        MyThread secondThread = new MyThread(2,se);
        Thread thirdThread = new Thread(new SecondThread(3,se));
        Thread fourthThread = new Thread(new SecondThread(4,se));
        Runnable secondThread1 = new SecondThread(3, se);
        secondThread1.run();


        Thread t1 = new Thread( ()->{
            System.out.print("My new thread using lambda");
            System.out.println(" is running");
        });
        /* System.out.println("Current Thread= " + Thread.currentThread().getName());
        firstThread.setPriority(Thread.MIN_PRIORITY);
        firstThread.setName("First Thread");
        secondThread.setPriority(Thread.MAX_PRIORITY);
        thirdThread.setPriority(Thread.NORM_PRIORITY);
        t1.setPriority(8); */

        firstThread.start();

        secondThread.start();


        thirdThread.start();
        fourthThread.start();
//        t1.start();

    }

}
