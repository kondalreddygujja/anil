package com.tnsif.fifth;

//File: ConstructorExample.java
public class ConstructorExample {

 String name;
 int age;

 // Default constructor
 ConstructorExample() {
     name = "Unknown";
     age = 0;
 }

 // Parameterized constructor
 ConstructorExample(String n, int a) {
     name = n;
     age = a;
 }

 void display() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }

 public static void main(String[] args) {
     // Using default constructor
     ConstructorExample obj1 = new ConstructorExample();
     System.out.println("Using default constructor:");
     obj1.display();

     System.out.println("--------------------");

     // Using parameterized constructor
     ConstructorExample obj2 = new ConstructorExample("Kondal", 25);
     System.out.println("Using parameterized constructor:");
     obj2.display();
 }
}

