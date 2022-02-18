package com.syntax.class09;

public class HwArrayAnimals {
	/* Create an array of animals and store 6 elements into 
	  *  Using 2 different loops print all elements from the array 
	  */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String[] animals= {"cow","pig","straus ","snake","dog","hen"};
    for (String animal:animals) {
    	System.out.print(animal+" ");
    }
       System.out.println("\n");
       for (int i=0;i<animals.length;i++) {
    	   System.out.print(animals[i]+" ");
       }
  
	}

}
