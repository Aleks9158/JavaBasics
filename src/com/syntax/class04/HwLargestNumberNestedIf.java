package com.syntax.class04;
public class HwLargestNumberNestedIf {
	
	public static void main(String[] args) {
//Write a program to find largest number among three numbers using nested if provided by a user
//		(numbers must be distinct)	 
		double num1 = 5;
		double num2 = 6.2;
		double num3 = 10.3;
		double largest = 0;
		if (num1 >= num2 && num1 > num3) {
			largest = num1;
			System.out.println(num1 + " is the largest number ");

		} else if (num2 >= num3 && num2 > num1) {
			largest = num2;
			System.out.println(num2 + " is the largest number ");
		} else if (num3 > num2 && num3 >= num1) {
			largest = num3;
			System.out.println(num3 + " is the largest number ");
	}

}
}
