package com.syntax.class12.Hw;
public class HwDog {
//Create a Dog Class and create 3
//	different objects of it: Husky,	Bulldog, Labrador with specific
//	attributes and behaviors.	
	String name;
	String color;
    String breed;    
    int age ;
    double weight;
    void bark() {
    	System.out.println("Dog is barking..");
    }
    void eat() {
    	System.out.println("Dog is eating");
    }
    void sleep() {
    	System.out.println("Dog is sleeping");
    }
    void printCompleteInfo() {
    	System.out.println("name="+ name);
    	System.out.println("color ="+ color);
    	System.out.println("age ="+ age);
    	System.out.println("breed ="+ breed);
    }
    }
