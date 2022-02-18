package com.syntax.class09;

public class ArrayChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ArrayTaskClass1
		char[] array= {'A','B','C','D','F'};
		int size=array.length;
		System.out.println("Numbers of elements is " +size);
		//System.out.println(array.length);
		System.out.println(array[1]);
		System.out.println("----------------------");
            for(int i=0;i<array.length;i++) {
            	System.out.print(array[i]+" ");
            }
	}

}
