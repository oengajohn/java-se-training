package com.systechafrica.part5.concurrencycontrol;

public class DeadlockAvoidanceExample {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void  performTask1(){
        synchronized (lock1){
//            synchronized (lock2){
                System.out.println("inside the perform task 1");
//            }
        }
    }
    public void  performTask2(){
        synchronized (lock1){
            System.out.println("inside the perform task 2");
        }
    }
}
