package com.syntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {
	
     //Print even from 1 to 30
		//int d=2;
		int e=2;
		//while (d<=30) {
			while(e<=30) {
				if (e%2==0) {
			//System.out.print(d+" ");
			System.out.print(e+" ");
			//d+=2;
			//e++ -не работает с инкрементом- никогда не исполнится
		}
		e++;		
	}
}
}


