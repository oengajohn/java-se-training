package com.systechafrica.part5.concurrencycontrol.stack;

public class Stack {

    private final int[] items;

    private int topOfStack;

//    private final Object lock;

    public Stack(int capacity) {
        this.items = new int[capacity];
        topOfStack = -1;
//        lock = new Object();
    }

    public synchronized boolean push(int item) {

            // synchronized (lock) {
            //check if the stack is full
            if (isFull()) {
                return false;
            }
            //increment the topOfStack
            topOfStack = topOfStack + 1;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            items[topOfStack] = item;
            return true;
            // }

    }

    public synchronized int pop() {
//        synchronized (lock) {
            //check if the stack is full
            if (isEmpty()) {
                return Integer.MIN_VALUE;
            }
            //get item at top of stack
            int item = items[topOfStack];
            //reset item at the top of stack
            items[topOfStack] = Integer.MIN_VALUE;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            topOfStack = topOfStack - 1;
            return item;
//        }
        //rest code
    }

    private boolean isEmpty() {
        return topOfStack < 0;
    }

    private boolean isFull() {
        return topOfStack == items.length - 1;
    }
}
