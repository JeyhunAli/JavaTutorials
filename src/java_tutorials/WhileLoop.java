package java_tutorials;

public class WhileLoop {
	public static void main(String[] args) {
		
	/*ICU International Components for Unicode
	 * initialization 
	 * comparison
	 * update 
	 */
	int i = 0;
	while(i<10)
	{
		System.out.println("hello world");
		i++;
	}
	/**
	 * 
	 * two types of the loop 
	 * 1. do for while loop 
	 * 2.infinite loop : pitfalls loop in java 
	 */
	
	int a = 1;
	while(a<=25) {
		System.out.println(a);
		a++;
	}
	
	int b = 10;
	while(b>=1) {
		System.out.println(b);
		b--;
	}
	
	
	 //this statement will print infinite 
//	for (; ;) {
//		System.out.println("test");   
//	}
}
	
	/**
	 * when to use for loop and when use while loop 
	 * in selenium 99% we use for loop 
	 * example of the for loop 
	 * lets say in web page i have to get all the links in that case im using for loop 
	 * because one by one i have to capture them and get them 
	 * for loop we use when we have to get values from order base collection 
	 * 
	 * while loop we use for example lest say in web page we have one button and that button its going to be visible
	 *  after 5-10 seconds at time we use while loop until its visible 
	 *  
	 *  
	 *  do while loop 
	 *  we use it until condition satisfied   
	 */
	
	
	}

