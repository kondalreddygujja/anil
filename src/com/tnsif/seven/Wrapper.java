package com.tnsif.seven;

public class Wrapper{
    public static void main(String[] args) {
       
        int num = 100;
        Integer boxedInt = num;          
        int unboxedInt = boxedInt;        
        System.out.println("Integer - Boxed: " + boxedInt + ", Unboxed: " + unboxedInt);

        
        double price = 99.99;
        Double boxedDouble = price;       
        double unboxedDouble = boxedDouble; 
        System.out.println("Double - Boxed: " + boxedDouble + ", Unboxed: " + unboxedDouble);

        
        char grade = 'A';
        Character boxedChar = grade;      
        char unboxedChar = boxedChar;     
        System.out.println("Character - Boxed: " + boxedChar + ", Unboxed: " + unboxedChar);
    }
}
