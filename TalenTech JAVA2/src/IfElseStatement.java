
public class IfElseStatement {

	public static void main(String[] args) {
		
	 /*   
	    int i=1;  
	    do{  
	        System.out.println(i);  
	    i++;  
	    }while(i<=10); 
	  */
		
		int a = 1000;
		int b = 30;
		
		if(b>a) {
			System.out.println("b is greater then a");		
		}
		else {
			System.out.println("a is greater then b");
			
		}
		
		int c = 400;
		int d = 40;
		
		if(c==d) {
			System.out.println("c and d are equal");
		}
		else {
			System.out.println("c and d are not equal");
	}
	//write a logic to find out the highest number
		
		int a1 = 100;
		int b1 = 200;
		int c1 = 300;
		
		//nested if-else
		
		if(a1>b1 & a1>c1) {
			System.out.println("a1 is the greatest");
		}
		else if(b1>c1) {
			System.out.println("b1 is the greatest");
			
		}
		else if(a1==b1 || a1==c1){
			System.out.println("Invalid!");
		}
		else {
			System.out.println("c1 is the greatest");
		}
	
	}
	
}
