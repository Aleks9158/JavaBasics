package com.syntax.class09;

public class HwArrayCars {
	public static void main(String[]args) {
 /* Create an array of cars and store 6 elements into 
  *  Using 2 different loops print all elements from the array 
  */
	
	String[] cars= {"Volvo","Ford","Reno","Toyota","BMW","GMC"};
	for (String car:cars) {
				System.out.print(car+" ");
	}
	System.out.print("\n");
	for (int i=0;i<cars.length;i++) {
		System.out.print(cars[i]+" ");
	}
}
}
