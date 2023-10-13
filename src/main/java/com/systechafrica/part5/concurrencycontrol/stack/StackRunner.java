package com.systechafrica.part5.concurrencycontrol.stack;

public class StackRunner {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " is running");

        Stack stack = new Stack(5);

        Runnable threadOneLogic = () -> {
            int counter = 0;
            while (++counter < 10) {
                System.out.println("Pushed: " + stack.push(100));
            }
        };
        Runnable threadTwoLogic = () -> {
            int counter = 0;
            while (++counter < 10) {
                System.out.println("Popped: " + stack.pop());
            }
        };

        Thread threadOne = new Thread(threadOneLogic, "pusher");
        Thread threadTwo = new Thread(threadTwoLogic, "popper");

        threadOne.start();
        threadTwo.start();

        System.out.println(Thread.currentThread().getName() + " is exiting");

    }
}
