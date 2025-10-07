package com.tnsif.ten;
import java.util.*;

public class HashSetCol {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Amit");
        names.add("Neha");
        names.add("Karan");
        names.add("Amit"); // duplicate ignored automatically

        System.out.println("HashSet elements: " + names);

        names.removeIf(n -> n.startsWith("N")); // removes names starting with 'N'
        System.out.println("After conditional removal: " + names);

        System.out.println("Set contains Karan? " + names.contains("Karan"));
    }
}
