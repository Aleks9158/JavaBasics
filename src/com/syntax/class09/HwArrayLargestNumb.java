package com.syntax.class09;

public class HwArrayLargestNumb {

	public static void main(String[] args) {
		/*
		 * From an array of integer elements find the 
		 * largest number
		 */				
		int[] num = { 42, 9, 150, 4, 43, 120};
		int max = num[0];
		for(int i = 1; i < num.length;i++) { 
			if(num[i] > max){
		    max = num[i];
		  }
		} 
				 
		System.out.println("The Largest Number is:" + max);
		}
	}
	
	


