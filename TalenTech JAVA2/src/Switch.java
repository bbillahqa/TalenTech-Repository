import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		int day;
		Scanner s=new Scanner(System.in);  
	     
		   System.out.println("Give me the number between 1-3 for different days");
		
		day = s.nextInt();
		
	    switch(day) {  
	    case 1: 
	    		System.out.println("Welcome to Monday");
	    	break;  
	    
	    case 2: 
	    		System.out.println("Welcome to Tuesday");
	    	break;  

	    case 3: 
	    		System.out.println("Welcome to Wednesday");
	    	break;  
	    
	    default:
	    		System.out.println("Enter number only between 1-3");
		}
System.out.println("Outside of the switch");		

	}

}
