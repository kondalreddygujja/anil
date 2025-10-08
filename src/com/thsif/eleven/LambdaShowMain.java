package com.thsif.eleven;

public class LambdaShowMain {
    public static void main(String[] args) {
        LambdaShow msg = () -> System.out.println("Lambda says: Hello from showMessage()!");
        msg.showMessage();
    }
}
