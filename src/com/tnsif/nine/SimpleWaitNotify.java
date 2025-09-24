package com.tnsif.nine;

public class SimpleWaitNotify {
	public static void main(String[] args) {
        Shared obj = new Shared();

        Thread t1 = new Thread(() -> obj.waitMethod());
        Thread t2 = new Thread(() -> obj.notifyMethod());

        t1.start();
        try { Thread.sleep(1000); } catch (Exception e) {} // give t1 time to wait
        t2.start();
    }
}

