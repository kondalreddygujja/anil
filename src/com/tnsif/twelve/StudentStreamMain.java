package com.tnsif.twelve;

import java.util.*;
import java.util.stream.Collectors;

public class StudentStreamMain {
    public static void main(String[] args) {

        // Create a list of students
        List<Student> list = new ArrayList<>();
        list.add(new Student(101, "Rahul", 68.5));
        list.add(new Student(102, "Sneha", 85.3));
        list.add(new Student(103, "Kiran", 91.2));
        list.add(new Student(104, "Pooja", 59.8));

        // Stream: Filter students with marks > 70 and map to name + marks
        List<String> result = list.stream()
                .filter(s -> s.marks > 70)
                .map(s -> s.name + " - " + s.marks)
                .collect(Collectors.toList());

        System.out.println("Top performing students:");
        result.forEach(System.out::println);
    }
}
