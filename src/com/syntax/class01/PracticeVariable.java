package com.syntax.class01;

public class PracticeVariable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        byte box1=127;      
        short box2=32763;
        int box3=150000;
        long box4=9800000000000000L;
        float box5 ;
        double box6 ;
        boolean box7=true;
        char box8=16;
        System.out.println("byte box1=127; min =-128;max=127");        
        System.out.println("short box2=32763;min =-32768;max=32767");
        System.out.println("int box3=150000;min =-2147483648;max=2147483647");
        System.out.println("long box4=980000000000000L;min =-9,223,372,036,854,775,808;max=9,223,372,036,854,775,807");
        System.out.println("float box5=32bits");
        System.out.println("double  box6=64bits");
        System.out.println("boolean box7=32bits; min =false;max=true");
        System.out.println("char box8=16bits  ; min ='\u0000'=0;max='\\uffff'=65536 ");
        
	}
}


