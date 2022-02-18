package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		//Create an array of countries.While retrieving all values
       String[] countries= {"Usa","Canada","China","Livan"};
       String capital=null;
       for(int i=0;i<countries.length;i++) {
    	   switch(countries[i]) {
    	   case"Usa" :
    		   capital="Washington";
    		   break;
    		   case"Canada" :
    		   capital="Ottava";
    		   break;    		   
    		  case"China" :
    		   capital="Pekin";
    		   break; 
    		   
    		   case"Livan" :
    		   capital="Beiruth";
    		   break;
    		   
    	   }
    	   System.out.println("The capital of "+countries[i]+" is "+capital+" ");
    	   
       }
		
	}

}
