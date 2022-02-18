package com.syntax.class09;

public class HwArrayIntSumOfAllEl {

	public static void main(String[] args) {
		/*
		 * Create an array on integers and calculate  the sum
		 *  all elements in an array 
		 */
		int[] nums= {3,5,2,9,7};
		int sum=0;
		for (int num:nums) {
			sum+=num;
			//System.out.println(sum);
		}
             System.out.println("Sum of all elements is an array is "+ sum);
	}

}
