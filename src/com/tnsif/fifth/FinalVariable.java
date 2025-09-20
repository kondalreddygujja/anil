package com.tnsif.fifth;


	public class FinalVariable {
	    final int MAX_USERS = 100; // constant

	    public void showLimit() {
	        System.out.println("Max allowed users: " + MAX_USERS);
	    }

	    public static void main(String[] args) {
	        FinalVariable obj = new FinalVariable();
	        obj.showLimit();
	       
	    }
	}


