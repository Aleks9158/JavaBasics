package com.syntax.class10;

public class HwFirst10NumbFibonacci {

	public static void main(String[] args) {
		/*Write a Java Program to print the first 10 numbers 
		 * of Fibonacci series		  
		 */
       int n=10;
       int fn=0;
       int sn=1;
       System.out.println("Fibonacci Series till " + n + " is:");     
       for (int i=1;i<=n;i++) {
    	   System.out.print(fn+" ,");
    	  int nextn=sn+fn;
    	   fn=sn;
    	   sn=nextn;
       }       
	}
}
