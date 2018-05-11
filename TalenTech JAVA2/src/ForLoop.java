
public class ForLoop {
	public static void main(String[] args) {

		//INTERVIEW QUESTION 
		//What happens if you don't include incremental or decrementals in your loop?
		//It will result in infinit loop

		// print 1 to 10
		for (int j = 1; j <= 10; j++) { // initialization, conditional, incremental
			System.out.println(j);
		}
		
		// print 10 to 1
		// k-- means k = k - 1
		// 10 9 8 7 6 5 4 3 2 1
						
		for (int k = 10; k >= -10; k--) { //// initialization, conditional, decremental
			System.out.println(k);
		}

	}

}
