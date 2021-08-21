package java_tutorials;

import java.util.Arrays;

public class largestOrSmallest {

	/**
	 * how to find out in Array concept which array is smallest and which one is largest 
	 */
	
	
	public static void main(String[] args) {
		
		int numbers []= {1,3,5,7,-2, 55, -99};
		
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i=0; i<numbers.length; i++) {
			
			if(numbers[i]>largest) {
				largest=numbers[i];
				
				
			}
			else if(numbers[i]<smallest) {
				smallest=numbers[i];
			}
			
		}
		
		System.out.println("given arrays "+ Arrays.toString(numbers));
		System.out.println("largest array numbers is: " + largest);
		System.out.println("smallest array numbers is: "+ smallest);
		
		
		// lets run it
		
	}
}
