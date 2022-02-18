package com.syntax.class10;

public class Hw2DintArrayOddEven {

	public static void main(String[] args) {
		/*Create a 2D array or integer type where 
		 * you will store odd and even numbers.
		 *  Develop a program which will identify/print 
		 *  the even numbers only.
		 * 
		 */
		int [][] numbers= {
				{12,65,23},
				{78,2,35},
				{7,9,4},
		};	 		
		for(int[] nums:numbers) {
	    	   for(int n:nums) {	    		   
	    		 if(  n%2==0) {				
	    		  System .out.print( n+" ");
	    	   }
	    	 }	  
	    }
		System .out.print("-Is even number") ; 	
	}
	}



	


