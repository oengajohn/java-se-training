package com.systechafrica.part5.concurrencycontrol;

public class MyThread extends Thread  {
    private final int threadNumber;
    SynchronizationExample se ;
    public MyThread(int threadNumber,SynchronizationExample se) {
        this.threadNumber = threadNumber;
        this.se=se;
    }

    @Override
    public void run() {
        se.modifySharedVariable(threadNumber);
        System.out.println(+threadNumber+" is running ");
    }
}
