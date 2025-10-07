package com.tnsif.ten;
import java.util.*;

public class StackCol {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        books.push("Java Programming");
        books.push("Python Basics");
        books.push("C++ Guide");

        System.out.println("Stack elements: " + books);
        System.out.println("Top element (peek): " + books.peek());

        books.pop();
        System.out.println("After one pop: " + books);

        while (!books.isEmpty()) {
            System.out.println("Popped: " + books.pop());
        }

        System.out.println("Stack empty? " + books.isEmpty());
    }
}
