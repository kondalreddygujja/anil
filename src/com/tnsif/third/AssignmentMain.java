package com.tnsif.third;

import java.util.Scanner;

/**
 * Main class to run the program.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your ID: ");
        int id = sc.nextInt();

        System.out.println("Enter your Salary: ");
        double salary = sc.nextDouble();

        sc.nextLine(); // consume leftover newline
        System.out.println("Enter your location: ");
        String location = sc.nextLine();

        // Create Employee object
        Employee emp = new Employee(name, id, salary, location);

        // Use utilities
        EmployeeUtilities.displayEmployeeDetails(emp);
        System.out.println("Bonus: " + EmployeeUtilities.calculateBonus(emp));
    }
}
