package com.systechafrica.part3.collections;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {
    public static void main(String[] args) {
        workingWithQueues();

    }

    public static void workingWithQueues() {
        Queue<PrintJob> queue = new LinkedList<>();
        queue.add(new PrintJob("journal"));
        queue.add(new PrintJob("articles"));
        queue.add(new PrintJob("book")); // throws RuntimeException when it is not possible to add the book
        queue.offer(new PrintJob("manual"));
        System.out.println(queue);
        System.out.println(queue.size());
        //System.out.println(queue.element());//throws runtime exception
        System.out.println(queue.peek());//throws runtime exception
        System.out.println(queue.remove());//throws runtime exception
        System.out.println(queue.poll());

        

    }

}
