package com.syntax.class05;
import java.util.Scanner;
public class HwLogicalWeekendDay {

	public static void main(String[] args) {
		/*Write a program that will print whether it is a weekend or weekday. 
		 * If any day from 1-5 → output “It is a weekday”,
		 *  anyday from 6-7 → output “It is a weekend”,
		 *   any other day → output “Invalid day” 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter week's number of day");
		int dayNumber = scan.nextInt();

		if (dayNumber>=1 && dayNumber<=5) {
			System.out.println("It is a weekday.");		
		} else if (dayNumber>=6 && dayNumber<=7) {
			System.out.println("It is a weekend.");					
		} else {
			System.out.println("Invalid day.");		}
	}
}
