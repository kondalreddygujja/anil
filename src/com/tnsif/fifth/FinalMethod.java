package com.tnsif.fifth;

class Parent {
    final void showMessage() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // Cannot override showMessage() because it is final
}

public class FinalMethod {
    public static void main(String[] args) {
        Child c = new Child();
        c.showMessage();  // Calls Parent's final method
    }
}
