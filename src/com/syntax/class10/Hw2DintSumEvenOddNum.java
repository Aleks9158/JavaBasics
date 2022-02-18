package com.syntax.class10;

public class Hw2DintSumEvenOddNum {

	public static void main(String[] args) {
		/*Create a 2D array of integers. Develop a program which 
		 * will calculate the sum of  even and odd numbers for that array.		  
		 */
		int [][] numbers= {
	    		{7,24,10,11},
	    		{8,3,1,2},
	    		{2,1,9,9},
	};
		int sum1=0;
		for(int[] nums:numbers) {
	    	   for(int n:nums) {	    		   
	    		 if(  n%2==0) {	 	    			
	    		 sum1 +=n;
	          }   
            }
		}
		System .out.print("Sum of even 2D array numbers is"+ sum1+" ");
		int sum2=0;
		for(int[] nums:numbers) {
	    	   for(int n:nums) {	    		   
	    		 if(  n%2!=0) {	 	    			
	    		 sum2 +=n;		
	               }
                  }
	    	   }		
		System .out.print("Sum of odd 2D array numbers is"+ sum2+" ");
	}
}
