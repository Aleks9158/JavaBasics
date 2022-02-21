package com.syntax.class12;

public class Greeting1 {
	//вывод результата обработанного разными методами 
	 void sayHelloManyTimes(String name) {
		 for (int i=0;i<=5;i++) {
	System.out.println("Hello"+name);
	 }
	 }
	 public static void main(String[]args) {
		 Greeting1 greeter =new Greeting1();
		 greeter.sayHelloManyTimes(" Emili");
}
 }
 
 