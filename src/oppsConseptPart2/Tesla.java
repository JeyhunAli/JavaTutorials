// in consept of inheritence this is child class 

package oppsConseptPart2;  //this child class of car class this class has acccess to all properties of parent class same time it has its own 
//method as well .in order to to inherit from parent class we use here extends keyword 

public class Tesla extends Car {
	//how method overriden happens in java inheritence ? so lets say we have same methods in parent class as well as in child class too
	//same methods same input parametrs .in java compiler time java will choose child class properties why because its overriden 
	//same thing in parent and child class 
	//when same methods presents in child and as well as in parent class with same name and same input parameters its call 
	//method overriden 

	//and child class 
	public void speed () {
		System.out.println("speed of the Tesla");//overriden method 
	}
	
   public void interiordesign () {
	    System.out.println("interiordesign of tesla ");
   }
   
   public void theftsafety() {
	   System.out.println("tesla---theftsafety");
   }
   
}
