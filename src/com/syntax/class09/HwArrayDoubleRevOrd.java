package com.syntax.class09;

public class HwArrayDoubleRevOrd {

	public static void main(String[] args) {
		/* create an array to store double values and then print 
		 * those in reverse order -1потому что номер элемента меньше 
		 * длины array на 1;альтернатива работает!!! 
		 */		 
		   
		    double[] a = {21.2,34.9,78.3,24.5};   
		    		    
		    System.out.println("Ёлементы в обратном пор€дке");
		    for (int i = a.length - 1; i >= 0; i--) {
		        System.out.print(a[i]+" , ");
	}
           System.out.println("\n");
           for (int i =0;i< a.length ;  i++) {
		        System.out.print(a[a.length-i-1]+" , ");
	}
}
}
