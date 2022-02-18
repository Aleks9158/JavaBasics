package com.syntax.class10;

public class Hw2DarraySumOfAllNumb {

	public static void main(String[] args) {
		/*Create a 2D array of integer values. 
		 * Print the sum of all numbers.		  
		 */
		int [][] numbers= {
	    		{2,7,9,8},
	    		{3,7,5},
	    		{9,1,4,3},
	    };
	    int sum1=0;
	      for(int i=0;i<numbers.length;i++) {
	    	  for(int j=0;j<numbers[i].length;j++) {	    		 
	    		  sum1+=numbers[i][j];
	    	  }
	    	  
	      }
	      System .out.println("Sum of all numbers of 2D array "+sum1);
	     System .out.println("---------------------");
	      	 int sum=0;     
	      for (int[] number:numbers) {	    	  
	          for (int n:number) {   
	    	 sum+=n;
	      }
	      
	}	      
	  
	      System .out.println("Sum of all numbers of 2D array "+sum);
}
}

