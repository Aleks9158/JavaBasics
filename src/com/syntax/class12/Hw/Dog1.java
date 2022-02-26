package com.syntax.class12.Hw;

public class Dog1 {
	//attributies,fields,properties
	String name;
	String color;
    String breed;
    char gender;
    int age ;
    double weight;
    //behaviors,functions and methods
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
    public static void main(String[]args) {
    	//creating an object scooby from class Dog
    	Dog1 scooby =new Dog1();
    //Dog is a class
    //scooby is an object
   //= is an assignment operator
   //new is a keyword that we use to create the objects of a class
   //Dog() we are calling the constructor of teh class  	
    	scooby.name="Tuzik";
    	scooby.color="white";
    	scooby.age=10;
    	scooby.breed="LABRADOR";
    	scooby.bark();
    	scooby.printCompleteInfo();
    }
   
    	
    }
    
    

