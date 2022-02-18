package com.syntax.class08;

public class HwClock1 {

	public static void main(String[] args) {
		// с секундами работает неправильно
  for(int h=0;h<=23;h++) {
	  for(int m=0;m<=59;m++) {
		  //for(int s=0;s<=59;s++) {
			 // System.out.println(h+" : "+m+" : "+s );
			  System.out.println(h+" : "+m);
			 // System.out.println(m+" : "+s);
		  }
	  }
  }
	}
//}
