package com.syntax.class12.Hw;

public class HwTask5PrimeOrNot {
	//Write a method to return whether given 
		//number is prime or not?
	boolean isPrime(int number) {		
		boolean isPrime=true;
		if (number>1) {
			for(int i=2;i<number;i++) {
				if(number%i==0) {
					isPrime=false;
					break;
				}
			}
		}else {
			isPrime=false;
		}
		return isPrime;
}
}
