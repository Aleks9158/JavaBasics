package com.syntax.class12.Hw;
public class HwPhoneTester {
	public static void main(String[] args) {		
		HwPhone iphone=new HwPhone();
		iphone.make="Iphone";	
		iphone.model="Iphone 13 PRO MAX";
		iphone.RAM = 6;
		iphone.ROM = 256;
		iphone.screen = 6.7;
		iphone.camera = 36;
        iphone.makePhoneCalls();
        iphone.takePictures();        
      System.out.println("--------------");      
      HwPhone nokia=new HwPhone();
      nokia.make="Nokia";	
	  nokia.model="Nokia G20";
	  nokia.RAM = 6;
	  nokia.ROM = 256;
	  nokia.screen = 6.5;
	  nokia.camera = 36;
      nokia.makePhoneCalls();
      nokia.takePictures();
	System.out.println("--------------"); 	
	HwPhone xiaomi=new HwPhone();
	xiaomi.make="Xiaomi";	
	xiaomi.model="Red mi 10Pro";
	xiaomi.RAM = 8;
	xiaomi.ROM = 128;
	xiaomi.screen = 6.67;
	xiaomi.camera = 36;
	xiaomi.makePhoneCalls();
	xiaomi.takePictures();
	 
}
}
	
