package com.syntax.class04;
import java.util.Scanner;
public class HwLargestNumberNestedIfScanner {
	public static void main(String[] args) {
//Write a program to find largest number among three numbers using nested if provided by a user
// (numbers must be distinct)		 	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter three numbers");
		int num1 = scan.nextInt();		
		int num2 = scan.nextInt();		
		int num3 = scan.nextInt();
		int largest = 0;
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
