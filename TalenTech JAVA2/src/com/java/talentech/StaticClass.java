package com.java.talentech;

public class StaticClass {

	int stat1=101;
	public static int stat2=202;
/*	 
	public static void main(String[] args) {
	StaticClass s = new StaticClass();
	s.method1();
	System.out.println("Accessing static data withour any object: "+StaticClass.stat2);

	}
*/
	public void method1() {
		System.out.println("printing non static data: "+stat1);
		System.out.println("printing static data: "+stat2);
	}
	public static void method2() {
		//System.out.println("printing non static data: "+stat1); Error b/c it is not a static method
		System.out.println("This is a static method");
		
	}
	
}
