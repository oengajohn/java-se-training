package com.systechafrica.part5.concurrencycontrol;

public class DemoThread {
    public static void main(String[] args) {
        DeadlockAvoidanceExample deadlockAvoidanceExample = new DeadlockAvoidanceExample();
        deadlockAvoidanceExample.performTask1();
        deadlockAvoidanceExample.performTask2();
    }
}
