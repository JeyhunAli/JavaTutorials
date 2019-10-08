package java_tutorials;

import java.util.Arrays;

public class FindingSmalestnumInArray {

	public static void main(String[] args) {

		int numbers[] = {5,78,58,3,1,45,69,74,32,13,27,38,67}; 
		
		int smallest = numbers[0];
		int largest = numbers[0];
		
		for(int i = 0;i<numbers.length;i++) {
			if(numbers[i] > largest ) {
				largest = numbers[i];
			}
			else if(numbers[i]< smallest ) {
				smallest = numbers[i];
			
			}	
		}
	
		System.out.println("\n given number is " +Arrays.toString(numbers));
		System.out.println("the smallest array is: " + smallest);
		System.out.println("the largest array is: "+ largest);
		
			
		int numbers1[]= {-58,-74,45,58,69,36,23,47,-485,12,3,115};
		int smallest1 = numbers1[0];
		int largest1 = numbers1[0];
		
		for(int i =1; i<numbers1.length;i++) {
			if(numbers1[i]>largest1) {
				largest1=numbers1[i];
				
			}else if (numbers1[i]<smallest1) {
				smallest1 = numbers1[i];
			}
		}
		System.out.println("\n given number is: "+ Arrays.toString(numbers1));
		System.out.println("the smallest array is: "+ smallest1);
		System.out.println("the largest array is: "+ largest1);
	}
	
	
	
	
	
	
	

	
}
