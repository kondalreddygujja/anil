package com.thsif.eleven;

public class LambdaThreadExample {
    public static void main(String[] args) {
        Runnable job = () -> {
            String name = Thread.currentThread().getName();
            System.out.println(name + " is running a lambda thread task.");
        };

        Thread t1 = new Thread(job, "Thread-One");
        Thread t2 = new Thread(job, "Thread-Two");

        t1.start();
        t2.start();
    }
}
