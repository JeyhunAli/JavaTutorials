 package java_tutorials;
 //comparison statements decision-making statements  
 //if statemenet if else else if switch statement 

public class IfElseCondition {

	public static void main(String[] args) {

		int a = 30;
		 int b = 20;
		 
		 if(b>a) {             // this call comparison  if else condition.
			              //comparison opeartors < > <= >= != ==      
			 System.out.println("b is greater than a");
			 
		 }else 
			 System.out.println("a is greater than b");
		int c = 50;
		int d= 50;
		if(c==d) {
			System.out.println("c is equal to d");
		}else 
			System.out.println("c is not equal to d");
		
		//Writing a logic to find out highest number 
		
		// nested if else 
		int a1 = 400;
		int a2 = 605;
		int a3 = 601;
		 if(a1>a2 & a1>a3) {
			 System.out.println("a1 is the greatest");
		 }
		 else if (a2>a3) {
			 System.out.println("a2 is the gratest");
		 }else 
			 System.out.println("a3 is the greatest");
		 
		 
		
		
		
		
		
	}

}
