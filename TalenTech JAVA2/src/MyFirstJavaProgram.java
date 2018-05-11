
public class MyFirstJavaProgram {
	/*
	 * This is my first program
	 */

	int myint=13; //instance OR Global variable
	
	public static void main(String[] args) {
		
	/*  MyFirstÇlass my1 = new MyFirstClass(); //my -> reference variable 
		MyFirstÇlass my2 = new MyFirstClass();
		MyFirstÇlass my3 = new MyFirstClass();
		MyFirstÇlass my4 = new MyFirstClass();
	*/
	
		System.out.println(my1.myint);
		my1.info();
		int assign=my1.mySum();
		
		System.out.println(my1.mySum());
		
	
	}
		
// ClassNmae objectName = new ClassName ();
		
	/*	System.out.println("Hello TalenTech");

		boolean bool = false;
		int a = 10;

		System.out.println(bool);
		System.out.println(a);

		int w = 10;
		int e = 10;
		int c = w + e;
		System.out.println(c);

		short FirstNumber = 10;
		short SecondNumber = 20;
		int sum = FirstNumber + SecondNumber;
		System.out.println("This is my first JAVA Program");
		System.out.println("The sum of my first number and my second number");
		System.out.println(sum);
		System.out.print("Test");
	*/	
	}
	
	
		int mySum() {
			int FirstNumber = 30; // FirstName --> Local variable
			int SecondNumber = 20;
			int sum=SecondNumber+FirstNumber;
			return sum;
			
		

	}
	
	
}
