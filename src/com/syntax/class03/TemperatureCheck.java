package com.syntax.class03;

public class TemperatureCheck {

	public static void main(String[] args) {
		//Create a Java program and name 
		//it Temperature Check. Create variable to store temperature.
		//Your program should check if temperature is below 32
		//then it should print “Water will freeze with temperature __“, 
		//otherwise “Water will NOT freeze with temperature __“.
	double	temp =32;
	double	temp1=31.9 ;	
	
	if (temp1<temp) {
		System.out.println("Water will freeze with temperature  "+temp1);
	}else {
		System.out.println("Water will NOT freeze with temperature "+temp1);
	}

    }
	}
