package com.systechafrica.part5.concurrencycontrol;

public class SynchronizationExample {
    private int sharedVariable = 0;

    public  synchronized void  modifySharedVariable(int value) {
        this.sharedVariable += value;
        System.out.println(sharedVariable);

    }
}
