
public class StringClass {

	public static void main(String[] args) {
 /*
		String str = "My name is Baki";
		System.out.println(str);

		String str2 = new String("I am in New York");
		System.out.println(str2);
*/
		
		String mystring = "Hello World";
		int mystringlength = mystring.length();
		String myStringinLowerCase = mystring.toLowerCase();
		String myStringinUpperCase = mystring.toUpperCase();
		
		System.out.println(mystring.replace('a', 'e'));
	}

}
