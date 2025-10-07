package com.tnsif.ten;
import java.util.*;

public class LinkedListCol {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Initial list: " + fruits);

        fruits.addFirst("Mango");
        fruits.addLast("Orange");
        System.out.println("After adding first and last: " + fruits);

        System.out.println("First fruit: " + fruits.getFirst());
        System.out.println("Last fruit: " + fruits.getLast());

        fruits.removeFirst();
        fruits.removeLast();
        System.out.println("After removing first & last: " + fruits);
    }
}
