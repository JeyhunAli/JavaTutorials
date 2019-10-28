//Polymorphism is came from 2 Greek words: poly and morphs.
//The word "poly" means many and "morphs" means forms. So polymorphism means many forms.

//in this class implementing parent and child class properties 
package oppsConseptPart2;
//Inheritance in Java  It is an important part of OOPs (Object Oriented programming system)
//purpose of inheritance >>>>> For Method Overriding, to achieve run time polymorphism,For Code Reusability.
//in java we can create classes and that class can have access to the parent,grandparent  classes 
//when child class or sub class inherit all the properties from parent class or super class that calls inheritance in java 
//for inheriting parent class properties we use extends keyword
//child class can access all the properties of parennt class and same time it can has its own methods as well 
//but parent class or super class cannot inherit anytthing from child class or sub class 
//parent class also can have its own  parent class that parent class can also have parent class 
//only child class can have acces to all 
//child class is not inherit private method and variables of its superclass or parent class
//@override annotations in inheritance is more importanat why because its keep tracking the changing 
//lats say someone add some more paramaters in parent class because of we have @override annotations we will get some error 
//then it will be easy for us to maintane it 
//

//*****************************************************************************************************************************************
//method overriding example 

//for method overloading real time example cross browser testing System.setProperty 
//another example Page factory init elements 
//driver.switch to Frame it also another example for the method overloading 


//ITest Listener interface testng Interface 
//when we implement  iTest interface same time we are aciving method overriding in child class 
 
//Abstraction 



//takesscrenshot  for tht we use dependency  interface name takesScreenShot theres method getscreenShot 

//scroll down in selenium we handle two ways 1 action class creation object of the action class then send 
//keys method then keys.scroll up method and 
// scroll down keys.scroll down   2. another way java scrit executer its interface we cannot create object 
//give any name javascript executer js = (javascripts executer)driver;
//js.executeScript (windows.scrollby(0,(250))   here 500, 750,   if we want to go back for that in front of the number minus 

//assert  if we use  the assert if theres any fail it will stop the executing 
// verify but if we use verify then even if there any failure it will still execute 

//total number of frames  
//total number of links we have to use list<Webelement> list= driver.findelements( By.tagname("a")); 
//if the tag name is a it means its link 
//list.size();
//same code for the frames as well 
//if the http status code is 404 it means theres a broken link 
// if theres we found 200 it means thats fine 
//static is the keyword in java it can be use in the method and before the some variables 
// if the method is static variables are the static as well


//handling dropdown select class  creating object of the select class 
//Select s =new Select();  there 3 method select by value , select by index, select by visible text.
//ususuly we choose select by visible text because it can handle dynmaic 
// web elelemnts   

//handling dynmaic web elements we use relative xpath there contains (), starts with () end with() methods 

// css selecter 






//******************************************************************************************************************************














public class TestCarsClassInheritencepoint {

	public static void main(String[] args) {

		
		Tesla t = new Tesla();
		t.speed();          //this call static polymorphism--->compile time polymorphism 
		t.refuel();         //it means at the time of compilation java will decide which method to call,ovveriden method and common method
		t.start();          //polymorphism means many methods with same overriden method name 
		t.theftsafety();   
		  t.engine();       //here child class accesing to grandparent properties 
		  t.windows();
		  
	System.out.println( "****************");
	
	
	 Car c = new Car(); //creating object of car class , parent class .here we can access only car class properties not child class 
	 c.speed();        //parent class cannot access all the properties of child class 
	 c.refuel();        //only child class has access to parent class 
	 c.start();
	 
	 System.out.println("**************");
	 
	 Car c1 = new Tesla(); //creating child class object by reffering parent class by reference variable 
	 c1.refuel();             //this call <<dynamic polymorpism>>
	 c1.speed();           //this also calls <<Top Casting>>  creating child class object by reffering parent class refernce variable 
	 c1.start();           //dynamic pol basically child class calls method overriden and parent class methods 
	 
	 
	 
	// c1.theftsafety     this  method despite we create child(tesla) object by reffering parent(car) reference variable we dont have access 
	 //to this method why because this method available inside of the child  class . 
	
	 //downcasting 
	 Tesla t1 = (Tesla) new Car(); //here we are creating parent class object by refferring child class reference variable and plus 
	                                // we casting  word of(tesla) class name 
	 t1.engine(); // if we want to run this downcasting  program here it will give us class cast exception 
	 //why it says parent class cannot cast to the child class 
	 
	}
	
	
	

       
        	
        
        		
}
