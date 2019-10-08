package oppsConseptpart1;

public class MethodOverLoading {
	
	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
			
		
		
		//method overloading ---> when the multiple method name are same with different input parametrs or arguments within the same class 
		//duplicate methods ---> same method name with same input parametrs aro not allowed 
		//same method with two input parametrs but different data type are allowed 
		//its not allowed to create a method inside of the method 
		//looks like you cannot create apple store inside of the apple store )))))
		obj.BMW();
		obj.BMW(10);
		obj.BMW(25, 33);
		obj.BMW(40 , 40, 40);
		obj.BMW(4.5, 6);
	}
	public static void main (int y1) {
		
	}
	// interview question : can we overload the main method ? yes we can as long as input parametrs are different we can 
	//overload the main method as well 
	public static void main (int h, int y2) {
		
	}
 
public void BMW() {    //zero input parametrrs 
	System.out.println("Bmw method with zero parameters ");
	
}
	 public void BMW(int i) { // one input parametrs 
		 System.out.println("Bmw method with one parameters ");
		 System.out.println(i);
	 }
	 public void BMW(int i, int y){  //two input parametrs 
		 System.out.println("BMW method with two marametrs ");
		 System.out.println(i+y);
	 }
	 public void BMW(int w, int s, int f) { //three input parametrs 
		 System.out.println("three input parametrs ");
		 System.out.println((w+s)/f);
	 }
	public void BMW(double s, int o) { // two input parametrs with different data type 
		System.out.println("two input parametrs but different data type ");
		System.out.println(s+o);
	}
}
