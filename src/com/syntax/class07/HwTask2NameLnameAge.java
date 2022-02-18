package com.syntax.class07;
import java.util.Scanner;
public class HwTask2NameLnameAge {

	public static void main(String[] args) {
		// Ask a user to enter name, last name and age 5 times. Every time your program should print 
		//those values in a format “You name is _ _ and you are _ years old’
          Scanner scan=new Scanner(System.in);  
          int i=5;
          for (i=1;i<=5;i++) {
          System.out.println("Please enter your name ");
          String name=scan.next();
          System.out.println("Please enter your last name ");
          String lname=scan.next();
         System.out.println("Please enter your age ");
         int age=scan.nextInt();
         System.out.println("Your name is "+name+lname+" and your are "+age+" years old");
          }         
	}
              
	}


