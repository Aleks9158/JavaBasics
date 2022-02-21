package com.syntax.class12;

public class Greeting2 {
//вывод результата обработанного разными методами 
	void sayHelloManyTimes(String name) {
		 for (int i=0;i<=5;i++) {
		 System.out.println("Hello"+name);
	 }
	 }
	void sayHelloNNumberOfTimes(String name,int times) {
			for(int i=0;i<times;i++) {
			System.out.println("Hello"+name);	
			}
	}
	 public static void main(String[]args) {
		 Greeting2 greeter =new Greeting2();
		 greeter.sayHelloNNumberOfTimes(" Emili",10);
}
}



