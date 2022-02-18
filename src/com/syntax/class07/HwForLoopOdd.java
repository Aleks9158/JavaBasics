package com.syntax.class07;

public class HwForLoopOdd {

	public static void main(String[] args) {
		//Print odd numbers between 20 and 50 (2 ways)
		int j=20;
		 for(j=20;j<=50;j++) {
	    	 if(j%2!=0) {
	    	   System.out.print(j+" ");
	}
	}
				
		System.out.println("\n");
		    int	i=20;
		        do {
		        	if(i%2!=0)
		    		System.out.print(i+" ");
		    		i++;
		    	}while(i<=50);
	}
}


