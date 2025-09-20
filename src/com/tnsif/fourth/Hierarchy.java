package com.tnsif.fourth;

public class Hierarchy {

    static class Parent {
        void parentMethod() {
            System.out.println("This is Parent class");
        }
    }

    static class Child1 extends Parent {
        void child1Method() {
            System.out.println("This is Child1 class");
        }
    }

    static class Child2 extends Parent {
        void child2Method() {
            System.out.println("This is Child2 class");
        }
    }
}
