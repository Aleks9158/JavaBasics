package com.syntax.class04;

public class Task3 {

	public static void main(String[] args) {
		// Create a java program and call it a Donor.In order to be eligible
		//to donate your blood you have to be 18 years old or older.
		
		 int age =18;
	      double weight=110;
	       if (age >=18) {
	    	   System.out.println("You are eligible to donate your blood");
	    	   if (weight >= 110) {
	    		   System.out.println("We can accept you as the donor");
	    	   }else {
	    		   System.out.println("We can not accept you as the donor");
	    	   }
	       }else {
	    	   System.out.println("You are not eligible to donate blood");
	       }
	}
}
