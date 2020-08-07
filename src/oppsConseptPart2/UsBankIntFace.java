//parent class of interface
//interface means whenever you wnat to achieve to abstarction --->> abstarction means like standart methods are over there without 
//any implementation
//you want to define process over there and you want to define 
//all the sub classess i mean child classess will override those methods and will find the business logic this consept calls abstarction

//The interface in Java is a mechanism to achieve abstraction.
//interface concept :interfaces can have abstract methods and variables. It cannot have a method body.
//It is used to achieve abstraction and multiple inheritance in Java.
package oppsConseptPart2;

public interface UsBankIntFace {
	
	int min_balance = 100;  //declaration data type 
	
	public void debit();
	
	public void credit();  //only declaration method no method body 
	
	public void transferMoney();
	
	//in interface only method declaration no method body 
	//in interface we can declare data type and they are by default static , so no need to write static keyword when we declare data type
	// in interface the value of variables never changes 
	//in interface no static method allowed. why because interface is part of OOP concept and we cannot override static method 
    // in interface no main method 
	//we cannot create object of interface 
	//interface is abstarct in nature it means we cannot instantiate of interface what does it mean
	//In programming, instantiation is the creation of a real instance or creation object  
	//abstarction is happening inside of the child, sub class of interface 
	//because the interface only methods no any method body 
	// why interface variable by default static ? because other classess which is implementing interface they are not allowed to change
	// the value of interface variable 
	
	
	
	/**
	 * intyerface is a blue brint of a class 
	 * 
	 * 
	 * in java referrence type checking concept is applicaple for inheritance and interface concept 
	 * in inheritance it applicable for the overriden method 
	 * lets say in im extending one class using inheritance concept then im overriding the methods which is available in parent class
	 * 
	 * referrence type checking concept in inheritance is happening when 
	 * im creating object of the child class by referring parent class in that time i can access all the methods is available in child 
	 * class except 
	 */
}
