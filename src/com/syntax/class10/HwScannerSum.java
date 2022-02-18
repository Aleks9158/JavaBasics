package com.syntax.class10;

import java.util.Scanner;

public class HwScannerSum {

	public static void main(String[] args) {
		/*Create an array on int values using a scanner and 
		 * calculate the sum of all stored elements in that array.	 
		 */
		System.out.println("Int Length  of array:");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();        
        System.out.println("Int values of array:");
        int[] array=new int[num]; 
        for (int i=0;i<=array.length-1;i++) {
        	array[i]=input.nextInt();       
        	    
        }    
        	System.out.println("Fill array:");
        	int sum=0;
        	for(int i=0; i<array.length;i++){ //перебор всех элементов
                System.out.print(array[i] + " ");
                 sum+=array[i];
                // System.out.print("Sum of values of array: "+sum);
        }
        	System.out.print("\n");
      	System.out.print("The sum of all stored elements in that array: "+sum);
	}
}
	



	

