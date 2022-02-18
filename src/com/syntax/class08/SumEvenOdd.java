package com.syntax.class08;

public class SumEvenOdd {

	public static void main(String[] args) {
		// Find out the sum of all even and Odd number from 1 to 50  
		
	// int i=1;
	 int sum=0;
	 for (int i=1;i<=50;i++) {
		if(i%2==0) {
		 sum+=i;
		// System.out.println(sum);
	 }
		
	 }
	 System.out.println(sum);
	}
}




