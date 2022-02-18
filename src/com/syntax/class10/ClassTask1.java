package com.syntax.class10;

public class ClassTask1 {

	public static void main(String[] args) {
		/*Create a 2D array (longer way)where you will store 
		 * the following values: Mr, Mrs, Ms, Miss and 
		 *  Smith, Jordan, Jackson, Obama.
         *   After storing values print following String:
           * Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.		 
		 */
		int i,j;
        String[][] namesArray= new String[4][4]; 
        namesArray[0][0]="Mr";
		namesArray[0][1]="Mrs";
		namesArray[0][2]="Ms";
		namesArray[0][3]="Miss";
		//adding elements inside 1  array or 2 raw
		namesArray[1][0]="Smith";
		namesArray[1][1]="Obama";
		namesArray[1][2]="Jakson";
		namesArray[1][3]="Jordan";
		System.out.println(namesArray[0][1]+" "+ namesArray[1][0]);
		System.out.println(namesArray[0][0]+" "+ namesArray[1][1]);
		System.out.println(namesArray[0][2]+" "+ namesArray[1][2]);
		System.out.println(namesArray[0][3]+" "+ namesArray[1][3]);
	}
  
}
