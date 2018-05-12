
public class WhileLoop {

	public static void main(String[] args) {

		/*
		 * int i = 1; 
		 * while (i <= 10) { System.out.println(i);
		 *  ++i; }
		 */

		//1. While loop
		//Disadvantages of while loop is that it will generate infitinite loop if you don't give incremental 
		
		int i = 0; //initialization
		while (i < 100) { //Conditional
			System.out.println(i); 
			i = i + 1; //incremental or decremental
		}
		
	}
}