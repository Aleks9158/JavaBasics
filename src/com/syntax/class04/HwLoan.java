package com.syntax.class04;
import java.util.Scanner;
public class HwLoan {
	public static void main(String[] args) {
		/* You are a loan specialist and you need to ask user what is  the amount of loan is needed.
		 * If loan is less or equal to 200,000 then you would lend the money 
		 * otherwise you would reject the client   
		 */
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Please say what is  the amount of loan you needed? ");
		 double amount=scan.nextDouble();
	double loan=200000;
	if (amount <=loan) {
		System.out.println("You'l get  the loan !  ");
	}else {
		System.out.println("Excuse me!You'l get no the loan ! ");
	}
	}
}
