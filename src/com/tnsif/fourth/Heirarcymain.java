package com.tnsif.fourth;

import com.tnsif.fourth.Hierarchy.Child1;
import com.tnsif.fourth.Hierarchy.Child2;

public class Heirarcymain {

    public static void main(String[] args) {

        Child1 obj1 = new Child1();
        obj1.parentMethod();
        obj1.child1Method();

        System.out.println("---------------");

        Child2 obj2 = new Child2();
        obj2.parentMethod();
        obj2.child2Method();
    }
}
