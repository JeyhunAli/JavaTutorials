//interface calls 100% abstarction it means all the implementation is writing in the child class 
		//in interface we are just declaring a prototype
		//and what is the ABSTARCT CLASS abstarct class also calls abstarction 
		//in abstarct class we can achieve partial abstarction
		//but in interface we are achieving 100% abstarction
//A class which is declared with the abstract keyword is known as an abstract class in Java.
//It can have abstract and non-abstract methods (method with the body).
//the point in abstract method ---> inside of the abstract method i can have method with and without body 
//but in interface we cannot create method with the body 
//because of that abstarct class its not 100% abstarction because inside of the class there are methods with and without body 0-100
//thats why abstract class calls partial abstraction
//but interface is 100% abstarction because inside of the interface all methods without body 100% apstraction
//we can create constructor abstract class
//if inside of the abstarct clas no any abstarct methods it calls zero persent abstarction 
//if inside of the abstract method all the methods are abstract methods i mean without body that calls 100 %abstraction
//if the abstract method is declare with the final keyword it cannot be overriden 
//overall what is the Abstarction ------->> abstarction is the process of hiding the implementation details, we are just declaring abstract
//methods in abstract class and defining all of them in the overriden child class     --->>this is call abstraction

//one more example for abstraction for exampple whats up application
// there are abstarct method inside of the written code its send message abstarct method right but in implementation 
//in overriden child class u are defining how to send message for example group message single message image video message these all the logic 
// we are defining in our overriden child class 


/**
 * in abstarction we can create constructor of the abstarct class and as well as child class of abstarction 
 * but while execution of test first of all java vm will check both child and parent class but 
 * it will execute first parent class constructor then it will execute child class constructor 
 * 
 * constructor is preferred to be non abstarct method in abstarct class because while extebding that class it will 
 * unneceserrily call all the undefined 
 * methods . because of that its better to create constructor inside of the astarct class as a non abstarct with body 
 * 
 * 
 * there s one important note about differences between final and static method 
 * if we declare method as static in abstract class obviously we cannot ovverride it but we can call it by class name 
 * but if we try to override it with the @override key word it will throw an error 
 * but without that keyword we can have that method as a separate independet method 
 * but if we declare some method in abstract class as a final first its not allow to ovveride and also 
 * its not even allows to have that method independently in my child class 
 * 
 */

package oopsconcept3;

public abstract class Shapeabstrct {
	
	int numOfcolor;
	String names;
	
	
	abstract void takingPhoto(); //abstarct  method without body 
	                              //its the same with interface in abstract class also we cannot create object of a class
	                              //because both are abstract in nature (mucerred)
	
	
	public void sendingPhotos() {   //method with body
		System.out.println("sending photos via whatsup");
	}
	

}
