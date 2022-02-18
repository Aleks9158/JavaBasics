package com.syntax.class05;
import java.util.Scanner;
public class HwLogicalNumbrSmallMedLarge {

	public static void main(String[] args) {
		/*Ask user to enter a number and then define 
		 * if number is small, medium or large
         *Small number is value between 1 and 10
         *Medium number is value between 11 and 100
         *Large number is value between 101 and 1000  
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int numb = scan.nextInt();
		if (numb>1 && numb<10) {
			System.out.println("Small number"); 
		}else if (numb>11 && numb<100) {
			System.out.println("Medium number"); 
	    }else if (numb>100 && numb <1000) {			
			System.out.println("Large number"); 
	    }else  {
			System.out.println("Wrong number"); 
        
	}
	}
}
