package com.tnsif.ten;
import java.util.*;

public class VectorCol {
    public static void main(String[] args) {
        Vector<Integer> scores = new Vector<>();
        scores.add(85);
        scores.add(90);
        scores.add(75);
        System.out.println("Initial Vector: " + scores);

        scores.insertElementAt(88, 1);
        System.out.println("After inserting 88 at index 1: " + scores);

        scores.removeElementAt(2);
        System.out.println("After removing element at index 2: " + scores);

        System.out.println("Size of Vector: " + scores.size());
    }
}
