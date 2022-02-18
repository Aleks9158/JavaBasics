package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		/*Ask user to enter their country and capture it 
		 * Once value are captured print which language user speaks.
		 */ 
		Scanner scan = new Scanner(System.in);
	       System.out.println("Please enter a country");
	       String count=scan.nextLine();
	       String lang ;
	       switch (count.toLowerCase()) {
	       case "ukraine":
	    	   lang ="ukrainiane";
	    	   break;
	       case "usa":
			 case"england":				 
			   case "australia":
	    	  lang="english";
	    	   break;
	       case "italy":
	    	   lang="italian";
	    	   break;
	       case "mexico":
	    	   lang="spanish";
	    	   break;
	    	   default:
	    		  lang="Please enter another country";
	    		 
	       }
	       System.out.println("In "+ count+ " people speak in  "+lang);
	}

}
