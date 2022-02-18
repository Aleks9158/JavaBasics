package com.syntax.class04;
import java.util.Scanner;
public class HwCityAndTemperature {

	public static void main(String[] args) {
		/*Create a Java program that will ask user to input 
		 * city and temperature.Your program should convert
		 * Fahrenheit into celsius and print "The temperature is 
		 * the city __is __"		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the name of city");
		String city=scan.next();
		System.out.println("Please enter the temperature in "+city);
		double fahrtemp=scan.nextDouble();
		double celstemp=(fahrtemp-32)/1.8;
  System.out.println("The temperature in the city "+city+" is "+celstemp+" (celsius)");
		

	}

}
