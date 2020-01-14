package java_tutorials;

public class IfElse_3 {

	public static void main(String[] args) {


		int a = 500;
		int b = 500;
		int c = 500;
		
		/**
		 * && ----> short circuit operator in java 
		 * 
		 */
		if (a>b && a>c) {
			System.out.println("a is the highest nummber");
		}
		else if(b>c) {
			System.out.println("b is the highest number");
		}
		else if(c>b) {
			System.out.println("c is the highest number");
			
		}
		/**
		 * if i dont write the else part it will print c is the highest number 
		 */
		else {
			System.out.println("all the numbers are equal");
		}
	}

}
