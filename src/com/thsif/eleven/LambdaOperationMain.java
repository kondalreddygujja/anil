package com.thsif.eleven;

public class LambdaOperationMain {
    public static void main(String[] args) {
        LambdaOperation add = (x, y) -> {
            int sum = x + y;
            System.out.println("Sum of " + x + " and " + y + " is: " + sum);
            return sum;
        };

        add.operate(15, 25);
    }
}
