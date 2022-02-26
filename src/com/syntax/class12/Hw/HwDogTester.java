package com.syntax.class12.Hw;
public class HwDogTester {
	public static void main(String[]args) {
		HwDog husky =new HwDog();
		husky.name="Dolly";
    	husky.color="white";
    	husky.age=10;
    	husky.breed="Husky";
    	husky.bark();
    	husky.printCompleteInfo();
	System.out.println("------------");	
    	HwDog bulldog =new HwDog();
		bulldog.name="KIng";
    	bulldog.color="brown";
    	bulldog.age=7;
    	bulldog.breed="Bulldog";
    	bulldog.eat();
    	bulldog.printCompleteInfo();
    System.out.println("------------");	
        HwDog labrador =new HwDog();
		labrador.name="Lord";
    	labrador.color="black";
    	labrador.age=8;
    	labrador.breed="Bulldog";
    	labrador.sleep();
    	labrador.printCompleteInfo();
	}
}
