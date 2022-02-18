package com.syntax.class06;
import java.util.Scanner;
public class HwGradeExpl {
	public static void main(String[] args) {
 //Allow user to enter grade (A, B, or C etc...) and then provide explanation: A-Excellent, B-Good, C-Average, D-BadBad, any other grade --> Not Acceptable.
 // At the end your program should print which grade was entered by a user with explanation.		 
 			Scanner scan = new Scanner(System.in);
	      System.out.print("Enter the grade: ");
	      String str1="Exellent";
	      String str2="Good";
	      String str3="Average";
	      String str4="Bad";
	   char grade = scan.next().charAt(0);
	   switch(grade) {
	   case'A':str1="Exellent";
		   break;
	   case'B': str2="Good";
		   break;
	   case'C': str3="Average";
		   break;
		case'D': str4="Bad";
		   default:
			   System.out.printf("The grade is Not Acceptable."); 
			   return;
	   }
	   System.out.print("Your grade is "+grade+" :A-Excellent, B-Good, C-Average, D-BadBad");
	}

}
