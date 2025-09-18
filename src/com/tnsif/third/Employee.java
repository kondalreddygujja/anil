package com.tnsif.third;

/**
 * Represents an Employee with basic details.
 */
public class Employee {
    private String name;
    private int id;
    private double salary;
    private String location;

    // Constructor
    public Employee(String name, int id, double salary, String location) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.location = location;
    }

    // Getters
    public String getName() { return name; }
    public int getId() { return id; }
    public double getSalary() { return salary; }
    public String getLocation() { return location; }
}
