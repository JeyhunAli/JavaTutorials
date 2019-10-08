//12.  What is the constructor?
//	A constructor is a special type of the method that is primarily used to initialize an object property.
//The name of the constructor must be same as the class name; constructor cannot have a return type. 
//A class can have multiple constructor with different number of parameters or different type of the parameters.
//because of that constructor can be consider as constructor overloading 
//constructor is independent for that we cannot create a constructor inside of the method 
//Constructor most usually used to initialize the instance variable. There two type of the constructor 
//1. Default constructor, 2. parametrized constructor. Default constructor it means there’s parenthesis but no arguments no parameters
//inside of the parenthesis. Parametrized constructor is with the arguments with the parameter. 
//The purpose of constructor is to initialize the object of a class while the purpose of a method is to perform a task by executing java code. 
//Constructors cannot be abstract, final, static and synchronized while methods can be. Constructors do not have return types while methods do. 
//	Constructor is similar to the method but it’s really not method completely different from each other.
//Constructor is used to initialize an object whereas method is used to indicate functionality of an object.
//Constructors are invoked implicitly whereas methods are invoked explicitly. ... Constructor should be the same name as class. 
//but method can be any other name.
//	constructor calls on its on we don’t need to explicit any other method.
//one more thing for the constructor if we give some value some arguments 
//Let’s say we have 2 constructors in one class we can call one constructor inside to another constructor for that we have to use this keyword 
package oppsConseptPart2;

public class ConstructorConsept {
	
	String name;  //class var, global variables instance variables 
	int age;
	double percentage;
	
	public ConstructorConsept() {
		System.out.println("default constructor no input paramater inside of the paranetesis ");
	}
	public ConstructorConsept(int i) {//constructor overloading with different parameter
		System.out.println("one parameter " + i);
	}
	public ConstructorConsept(double i, int y) {//2 parameters
	System.out.println("two parametrs " +i+ " " +y);
	  // System.out.println(i +" " +y );
			
	}
	public ConstructorConsept (String name, int age, double percentage ) {
		this.name = name;
		this.age = age;  //these are class var local var
		this.percentage = percentage;//this keyword is used when we initialize class var
		
		
	}
	
	
	
	
	
              public static void main(String[] args) {
	      ConstructorConsept obj = new ConstructorConsept(); //creating object of constructor in order the to call it under main method 
	      ConstructorConsept obj1 = new ConstructorConsept(25);
	      ConstructorConsept obj2 = new ConstructorConsept(25.25, 45);
	      ConstructorConsept obj3 = new ConstructorConsept("Chloe", 8, 2.3);
		
		
		System.out.println("name is: " + obj3.name );
		System.out.println("age is: "+ obj3.age);
		System.out.println("height is: "+ obj3.percentage);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
