package com.syntax.class09;



public class HwArrayMinNumb {

	public static void main(String[] args) {
		/*From an array of integer elements find the 
		 * min number
		 * 
		 */
		int[] num = { 42, 9, 150, 4, 43, 120};
		int min = num[0];
		for(int i = 1; i < num.length;i++) { 
			if(num[i] < min){
		    min = num[i];
		  }
		} 
				 
		System.out.println("The Min Number is:" + min);
	}

}
