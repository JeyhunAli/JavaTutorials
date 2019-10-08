package oppsConseptpart1;
// global variable is declared outside of the method 
//local variable is declared inside of the method 
//differences between local and globl variable if we want to acces local variable inside of the method we can acces them directly 
//but if want to acces to global var we have to create object of a class then wen can call global variable by object reference name 

public class LocalAndGlobalVariable {
	//Global variable class variable
	   String name = "Jeyhun";
	   int age = 25;
	   
	public static void main(String[] args) {
	        
		int i = 10;  // local variable
		System.out.println(i);
		LocalAndGlobalVariable obj = new LocalAndGlobalVariable();
		System.out.println(obj.name); // if we want to access to global variable we have to create an object of a class 
		                           //after creating an object of a class the copy of the global var,and non static method will be given to 
		                           // the new created object 
	     System.out.println(obj.age); // accesing age 
	     obj.sum(); // ---->> calling object in order to run sum method 
}                             
	public void sum() {
		int i = 50;
		int i1 = 5;
		int a= i+i1;
		
		System.out.println(a);
	}

}
