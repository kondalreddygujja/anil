package com.thsif.eleven;
import java.util.ArrayList;

public class LambdaListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Orange");

        // Lambda to print each element
        fruits.forEach(f -> System.out.println("Fruit: " + f));
    }
}
