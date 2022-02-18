package com.syntax.class06;
import java.util.Scanner;
public class HwValYesOrNo {
	public static void main(String[] args) {
//Write a program to ask user to enter value for sale: yes or no if there is no sale --> you are not going for shopping
// if there is sale ask you user for the price of the item  Based on the price you have to calculate the price of the item after the discount
// if price is less than $20 --> apply 10% discount, if price is between $20 & $100 --> 20% discount if price between $100 & $500 --> 30% discount, otherwise apply 50% discount
//Output of the program should be:After discount ___ the price of the item reduce from __ to ___	 
		Scanner scan = new Scanner(System.in);
	      System.out.print("Please enter value for sale: yes or no ");
	    String val=scan.next();	
	      if(!val.equalsIgnoreCase("yes")) {
	    	 System.out.println("you are not going for shopping");	    	
	      }else {
	    	  System.out.println("What the price of the item");
	    	 double price=scan.nextDouble();
	    	 double discount1=price*0.1;
	         double discount2=price*0.2;
	         double discount3=price*0.3;
	         double discount4=price*0.5;
	       	  if (price<20) {
	    		  System.out.println("Get discont"+ discount1);
	    	 System.out.println("After discount "+ discount1 +" the price of the item reduce from "+price+" to "+(price-discount1));
	    	  }else if(price >20 && price<=100) {
	    		  System.out.println("Get discont"+ discount2);
	    	 System.out.println("After discount "+ discount2 +" the price of the item reduce from "+price+" to "+(price-discount2));
	    	  }else if (price >100 && price<=500) {
	    		  System.out.println("Get discont "+discount3);
	    	 System.out.println("After discount "+ discount3 +" the price of the item reduce from "+price+" to "+(price-discount3));
	    	  }else {
	    		  System.out.println("Get discont "+ discount4);
	    	  System.out.println("After discount "+ discount4 +" the price of the item reduce from "+price+" to "+(price-discount4));
	    	  }     
	     	}	
	}

}
