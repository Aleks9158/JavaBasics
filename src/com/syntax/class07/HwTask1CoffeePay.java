package com.syntax.class07;
import java.util.Scanner;
public class HwTask1CoffeePay {
	public static void main(String[] args) {
		//Declare a variable to store a price for a coffee.  Ask user to pay for a coffee. Keep asking to pay for coffee 
		 // until user enters exact amount .If user give more than $3 --> ask them to give less,
		 //   if user gives less money then ask to give more. Once user got a write amount print “Please enjoy your candy” 		 
		double price=3.0;
		Scanner input=new Scanner(System.in);
		double pay;		
		do {
		System.out.println("Please pay for coffee");
		double pay1=input.nextDouble();
		 pay=pay1;
		 if (pay1>3) {
			 System.out.println("Please give me less");
		 }else if(pay1<3) {
			 System.out.println("Please give me more");
		 }
	}while (pay!=price);		
		
  System.out.println("Please enjoy your candy");
}
}



