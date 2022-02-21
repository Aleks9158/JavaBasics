package com.syntax.class12;
//обращение java из одного метода в другой в одном классе 
public class Greeting {
 void sayHello(String name) {
	 System.out.println("Hello"+name);
 }
 public static void main(String[]args) {
	 Greeting greeter =new Greeting();
	 greeter.sayHello(" Teyfur");
 }
}
