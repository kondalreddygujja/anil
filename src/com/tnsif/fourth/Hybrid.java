package com.tnsif.fourth;

public class Hybrid {
    static class Parent {
        void parentmethod() {
            System.out.println("This is main class");
        }
    }

    static class child1 extends Parent {
        void show() {
            System.out.println("This is child1 class");
        }
    }

    static class child2 extends Parent {
        void show1() {
            System.out.println("This is child2 class");
        }
    }

    static class child3 extends child2 {
        void show2() {
            System.out.println("This is child3 class");
        }
    }
}
