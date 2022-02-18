package com.syntax.class08;

public class HwClock {

	public static void main(String[] args) {
		// 24 hours clock
		for (int th=0; th<=2;th++) {
			for (int h=0; h<=3 ;h++) {
				for (int tm=0;tm<=5; tm++ ) {
					for (int m=0; m <=9;m++)
						System.out.println(th+"" +h+":"+tm+""+m);	
            	}  
			}
         }
	   }
     }
