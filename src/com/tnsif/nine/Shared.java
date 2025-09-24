package com.tnsif.nine;

public class Shared {

	 synchronized void waitMethod() {
	        try {
	            System.out.println("Thread is waiting...");
	            wait();   // waits here
	            System.out.println("Thread resumed after notify");
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

	    synchronized void notifyMethod() {
	        System.out.println("Thread is notifying...");
	        notify();   // wakes up waiting thread
	    }
	}

