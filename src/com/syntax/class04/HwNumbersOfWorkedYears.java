package com.syntax.class04;
import java.util.Scanner;
public class HwNumbersOfWorkedYears {
	public static void main(String[] args) {		
		 // Write a program to ask user to enter numbers of worked years and annual salary. If user worked 
		 // for more or equals to 5 years than user is eligible for the bonus, otherwise he is not. Once user 
		 // is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.		 
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number of worked years");
        int years=scan.nextInt();
        System.out.println("Please enter the annual salary ");
        double salary =scan.nextDouble();
        if (years>=5) {
        	System.out.println("You is eligible for the bonus");
        	if ( salary>50000) {
        			System.out.println("You is eligible for the bonus=5000");
        	}else {
        		System.out.println("You is eligible for the bonus=3000");
        	}
        	}else {
        System.out.println("You is not eligible for the bonus");                
	}
}
}
