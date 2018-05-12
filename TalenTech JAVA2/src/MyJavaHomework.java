import java.util.Scanner;

public class MyJavaHomework {

	public static void main(String[] args) {

// Question 1

		int a = 5;
		int b = 7;
		int c = 11;

		int answer = a + b + c; // Perimeter of Triangle (P=a+b+c);

		System.out.println("Question 1 Answer is =" + answer);

// Question 2

		int d = 9;
		int e = 13;

		int answer1 = 2 * (d + e); // Perimeter of Rectangle (P=2(l+h);

		System.out.println("Question 2 Answer is = " + answer1);

// Question 3

		int f = 9;
		int g = 11;

		int answer2 = (f * g);
		int answer3 = f + g + answer2;

		System.out.println("Question 3 Answer is = " + answer3);

// Question 4

		int h = 100;
		int i = 70;
		int j = 200;
		int k = 150;

		int answer4 = h - i;
		int answer5 = j - k;
		int answer6 = answer5 - answer4;

		System.out.println("Question 4 Answer is = " + answer6);
// Question 5

		Scanner input = new Scanner(System.in);
		String Name;
		int age;
		System.out.println("Please  enter your name");
		Name = input.next();
		System.out.println("Please enter your age");
		age = input.nextInt();
		System.out.print("Your name is " + Name + " and your age is " + age);

	}

}
