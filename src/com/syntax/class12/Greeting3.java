package com.syntax.class12;

public class Greeting3 {
	//вывод результата обработанного разными методами 
	void sayHello(String name) {
		 System.out.println("Hello"+name);
	 }
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
			 Greeting3 greeter =new Greeting3();
			 greeter.sayHelloManyTimes("Emili");//определяет что будет выводится этим методом 
		 }
}