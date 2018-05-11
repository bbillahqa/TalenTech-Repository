package com.java.talentech;

class ChildAbstract extends AbstractClass{

	public static void main(String[] args) {
		ChildAbstract c = new ChildAbstract();
		c.myMethod();
		c.myMethod1();
	}

		public void myMethod() {
			System.out.println("This is a abstract method");
	
	}

		public int myMethod1() {
		 return 10;
		}
/* public void myMethod1(){
 * system.out.println("myMethod");
 * }
 */
}
