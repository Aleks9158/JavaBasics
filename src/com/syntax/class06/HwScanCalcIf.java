package com.syntax.class06;
import java.util.Scanner;
public class HwScanCalcIf {
	public static void main(String[] args) {
   //Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).Based on operator provide the result to user, using if statement.		 
			  double num1;
	      double num2;
	      double res=0;
	      char oper;
	      Scanner scan = new Scanner(System.in);
	      System.out.print("Enter two numbers: ");
	      num1 = scan.nextDouble();
	      num2 = scan.nextDouble();
	      System.out.print("Enter an operator (+, -, *, /): ");
	      oper = scan.next().charAt(0);
	         if(oper=='+') {
	          res = num1 + num2;	           
	         } else if (oper=='-'){
	        		 res = num1 - num2;	          
	         } else if(oper=='*') {
	        	 res = num1 * num2;	          
	         } else if(oper=='/') {
	        	 res = num1 / num2;	          	         
	         }else {
	        	 System.out.printf("Error! Enter correct operator");
	            return;
	      }
	      System.out.print("The result is given as follows:\n");
	      System.out.printf(num1 + " " + oper + " " + num2 + " = " + res);	
	}
}
