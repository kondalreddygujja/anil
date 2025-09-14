package com.tnsif.first;

public class Localexam {
    static int globalVar = 100;
    int instanceVar = 200;

    void display() {
        int localVar = 300;
        System.out.println("Global: " + globalVar);
        System.out.println("Instance: " + instanceVar);
        System.out.println("Local: " + localVar);
    }

    public static void main(String[] args) {
        Localexam obj1 = new Localexam();
        obj1.display();

        Localexam obj2 = new Localexam();
        obj2.instanceVar = 500;
        obj2.display();

        System.out.println("Global (direct): " + globalVar);
    }

}
