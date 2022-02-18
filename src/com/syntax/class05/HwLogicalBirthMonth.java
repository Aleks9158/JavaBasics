package com.syntax.class05;
import java.util.Scanner;
public class HwLogicalBirthMonth { 
	public static void main(String[] args) {
		/*Write a program for user to enter his/hers birth month.
		 *Based on the month define the season.
         * Example: 
          *if user is born in March, April, May → season =“Spring” 
         * if user is born in June, July, August → season =“Summer”  etc...  
		 */
     Scanner scan=new Scanner(System.in);
     System.out.println("Please enter his/hers birth month");
     String month=scan.next();
    if (month.equals("May")|| month.equals("April")||month.equals("March")) {
		System.out.println("Spring");
    
	}else if (month.equals("June")|| month.equals("July")||month.equals("August")) {
		System.out.println("Summer");
	}else if (month.equals("September")|| month.equals("October")||month.equals("November")) {
		System.out.println("Autumn");

    }else if (month.equals("December")|| month.equals("January")||month.equals("February")) {
		System.out.println("Winter");
}
	}
}
