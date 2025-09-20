package com.tnsif.fifth;

public class Staticmethodexample {

    static void greet() {
        System.out.println("Hello from static method!");
    }

    public static void main(String[] args) {
        greet(); // no object needed
    }
}