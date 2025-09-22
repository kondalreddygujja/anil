package com.tnsif.eight;

public class StringIndexOutOfBoundExample {
    public static void main(String[] args) {
        String str = "Hello";

        // Valid index: 0 to 4
        System.out.println("Character at index 0: " + str.charAt(0));
        System.out.println("Character at index 4: " + str.charAt(4));

        // This will throw StringIndexOutOfBoundsException
        System.out.println("Character at index 5: " + str.charAt(5));
    }
}

