package com.tnsif.third;

public class EmployeeUtilities {
	
	
	    public static void displayEmployeeDetails(Employee emp) {
	        System.out.println("Employee Details:");
	        System.out.println("Name: " + emp.getName());
	        System.out.println("ID: " + emp.getId());
	        System.out.println("Salary: " + emp.getSalary());
	        System.out.println("Location: " + emp.getLocation());
	    }

	    public static double calculateBonus(Employee emp) {
	        return emp.getSalary() * 0.10; // 10% bonus
	    }
	}
	

