package com.tnsif.ten;
import java.util.*;

public class ArrayListCol {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Bangalore");
        cities.add("Kolkata");
        cities.add("Indore");
        System.out.println("Initial List: " + cities);

        cities.remove("Kolkata");   // remove by element
        System.out.println("After removal: " + cities);

        cities.add(1, "Jaipur");    // insert at specific index
        System.out.println("After inserting Jaipur: " + cities);

        System.out.println("Element at index 0: " + cities.get(0));
    }
}
