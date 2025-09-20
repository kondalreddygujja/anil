package com.tnsif.fourth;

// Parent class
class Parent {
    void display() {
        System.out.println("Display method from Parent class");
    }
}

// Child class
class Child extends Parent {
    void display() {
        System.out.println("Display method from Child class");
    }

    void show() {
        // Call parent class method using super
        super.display();
    }
}

// Main class
public class SuperExample {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();  // Calls Child's display
        obj.show();     // Calls Parent's display via super
    }
}
