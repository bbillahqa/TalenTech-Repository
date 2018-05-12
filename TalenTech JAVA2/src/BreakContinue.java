
public class BreakContinue {

	public static void main(String[] args) {

		for (int i = 1; i < 7; i++) {
			if (i == 4) {
				break;

			}
			System.out.println("i");

		}
		System.out.println("Break is done");
		
		for (int i = 1; i < 9; i++) {
			if (i == 4) {
				continue;

			}
			System.out.println("i");

		}
		System.out.println("Continue is done");
		
	}

}
