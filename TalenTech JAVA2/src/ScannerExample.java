import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int user = scan.nextInt();
		
		System.out.println("The number your entered is " +user);

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a two digit decimal number");
		double user1 = scan.nextDouble();
		
		System.out.println("My two digit number is "+ user1);
	
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a t/f statement");
		boolean user2 = scan.hasNext();
				
		System.out.println("The statement is " +user2);

		
		int Test_Score = 23;
		
		if (Test_Score>55) {
			System.out.println("John will pass the class");}
		else {
			System.out.println("John will fail the class");
			
		}
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age!");
		int user1 = scan.nextInt();
		
		System.out.println("Your age is " +user1);
		
	}


}
