

package com.tnsif.eight;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println("Length: " + s.length()); 

            int[] arr = {1, 2, 3};
            System.out.println("Element at index 5: " + arr[5]); 

            int num = 10 / 0; 
        } 
        catch (NullPointerException e) {
            System.out.println("Caught NullPointerException → " + e);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException → " + e);
        } 
        catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException → " + e);
        } 
        catch (Exception e) {
            System.out.println("Caught General Exception → " + e);
        }

        System.out.println("Program continues...");
    }
}
