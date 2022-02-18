package com.syntax.class04;
import java.util.Scanner;
public class HwDMVrepresentative {
	public static void main(String[] args) {
/*You are DMV representative and you need to ask customer
 *their age .If they are 18 and older you will issue a driver 
 *license to them,otherwise you will offer them to get learners  
 *permit
*/
		Scanner scan=new Scanner(System.in);
		System.out.println("How old you are?");
		double age=scan.nextDouble();
     if (age >=18) {
    	 System.out.println("You'l get a driver license");
     }else {
    	 System.out.println("I can offer you to get learners permit");
     }
	}

}
