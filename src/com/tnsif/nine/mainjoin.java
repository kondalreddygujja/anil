package com.tnsif.nine;


	public class mainjoin {
	    public static void main(String[] args) {
	    	JoinDemo t1 = new JoinDemo();
	    	JoinDemo t2 = new JoinDemo();
	        

	        t1.start();
	        try { t1.join(); } catch (Exception e) { System.out.println(e); }

	        t2.start();
	      try { t2.join(); } catch (Exception e) { System.out.println(e); }

	    
	    }
	}

