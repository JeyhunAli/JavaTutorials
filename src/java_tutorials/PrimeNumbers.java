//Prime Numbers in jAva ----> numbers digits which can be devided to itself and to one calls prime number  
//2 is the lowest prime number 
package java_tutorials;

public class PrimeNumbers {
	
	public static boolean isprimeNumber(int num) {
		
		if(num<=1) {
			return false;
		}
		for(int i=2; i<num; i++) {
			if (num % i==0) {
				return false;
			}
		}
		return true;	
	}

	
	  public static void getprimeNumbers(int num) { 
		  for (int i=2; i<=num-1; i++) {
			  if(isprimeNumber(i)) {
			  System.out.print(i+ " ");
			  }  
		  }
	 
	  }

	public static void main(String[] args) {
		System.out.println("is 55 prime number? "+isprimeNumber(55));
		System.out.println("is 13 prime number? "+ isprimeNumber(13));
		System.out.println("is 57 prime number?"+ isprimeNumber(57));
		System.out.println("is 17 prime number?"+ isprimeNumber(17));
		
		System.out.println("is -25 prime number?"+ isprimeNumber(-25));
		
		getprimeNumbers(20);
		//getprimeNumbers(10);
		

	}

}
