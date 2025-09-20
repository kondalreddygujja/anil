package com.tnsif.fourth;




	// Parent class
	class Class1 {
	    void class1Method() {
	        System.out.println("This is Class 1");
	    }
	}

	// Child of Class1
	class Class2 extends Class1 {
	    void class2Method() {
	        System.out.println("This is Class 2");
	    }
	}

	// Child of Class2
	class Class3 extends Class2 {
	    void class3Method() {
	        System.out.println("This is Class 3");
	    }
	}

	public class Multiinheritence {
	    public static void main(String[] args) {
	        
	        Class3 obj = new Class3();
	        
	        obj.class1Method();  // From Class1
	        obj.class2Method();  // From Class2
	        obj.class3Method();  // From Class3
	    }
	}



