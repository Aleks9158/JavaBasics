package com.syntax.class12;
//��������� java �� ������ ������ � ������ � ����� ������ 
public class Greeting {
 void sayHello(String name) {
	 System.out.println("Hello"+name);
 }
 public static void main(String[]args) {
	 Greeting greeter =new Greeting();
	 greeter.sayHello(" Teyfur");
 }
}
