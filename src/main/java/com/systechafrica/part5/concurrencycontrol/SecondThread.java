package com.systechafrica.part5.concurrencycontrol;

public class SecondThread implements Runnable{

    private final int threadNumber;

    private final SynchronizationExample se;

    public SecondThread(int threadNumber, SynchronizationExample se) {
        this.threadNumber = threadNumber;
        this.se=se;
    }

    @Override
    public void run() {
        se.modifySharedVariable(threadNumber);
        System.out.println(+threadNumber+" is running ");
    }
}
