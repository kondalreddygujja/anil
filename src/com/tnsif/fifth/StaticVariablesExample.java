package com.tnsif.fifth;

public class StaticVariablesExample {
    static int count = 0; // shared across all objects

    public  StaticVariablesExample() {
        count++;
        System.out.println("Object created. Count: " + count);
    }

    public static void main(String[] args) {
        new StaticVariablesExample();
        new StaticVariablesExample();
        new StaticVariablesExample();
    }
}