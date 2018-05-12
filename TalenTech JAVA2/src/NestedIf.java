
public class NestedIf {

	public static void main(String[] args) {

		int a = 2;
		int b = 5;
		int c = 7;
		int d = 10;

		if (b > a) {
			if (c < d) {

				System.out.println("You are inside the Nested If");
			}

			else
				System.out.println("Now, You are outside the Nested if");

		}
	}
}
