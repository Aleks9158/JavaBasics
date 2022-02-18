package com.syntax.class09;

public class ReplHightValueInArray {

	public static void main(String[] args) {
		// Write a program that prints the highest value 
		//in the array.
		
		 int[] number={5,4,8}; 
	       
		 int max =number[0];
		  for (int n:number){
		    if(n>max){
		      max=n;
		    }
		  }
		System.out.println(max);
	}

}
