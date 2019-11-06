package collections;

import java.util.Arrays;

public class ArraylargestAndsmallest {

	public static void main(String[] args) {
  
		int arr []= {-1,25,67,-84,-78,78,45,47,72,99,125,-210,13,56,9,7,-8,41}; //finding smallest and largest array
		 
		int largest = arr[0];
		int smallest =arr[0];
		
		for (int i=0; i<arr.length;i++) {
			if(arr[i]>largest) {
			largest=arr[i];
			}
			else if (arr[i]<smallest) {
			smallest=arr[i];
			}
		}
		
	System.out.println("given numbers are: "+ Arrays.toString(arr));
System.out.println("largest array is :"+ largest);
System.out.println("smallest array is : " + smallest);

 
  int Nnumbers []= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,85};
  int big =Nnumbers[0];
  int small = Nnumbers[0];
  
  for (int i=0;i<Nnumbers.length;i++) {
	  if(Nnumbers[i]>big) {
		 big=Nnumbers[i];
		 }
	  else if (Nnumbers[i]<small) {
		  small=Nnumbers[i];
		  
	  }
  }
  System.out.println("given nubmers are: "+ Arrays.toString(Nnumbers));
  System.out.println("big number is: "+ big);
  System.out.println("small number is: "+ small);

  
  
  
  
  
  
	}
}
	
	





	


