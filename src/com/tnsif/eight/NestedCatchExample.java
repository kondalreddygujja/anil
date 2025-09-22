package com.tnsif.eight;

public class NestedCatchExample {
    public static void main(String[] args) {
        try {
            
            int[] numbers = {10, 20, 30};
            
            try {
                
                String s = null;
                System.out.println("Length: " + s.length()); 
            } 
            catch (NullPointerException e) {
                System.out.println("Inner catch: NullPointerException caught → " + e);
            }

           
            System.out.println("Element at index 5: " + numbers[5]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: ArrayIndexOutOfBoundsException caught → " + e);
        }
        
        System.out.println("Program continues...");
    }
}
