//final  method is making something single copy u cannot change it 
//if the parent class is final u cannot access it in child class 
//final makes variable costant .the keyword final in front of a method restrict any class to ovverride it 
package oppsConseptpart1;

//static and non static method and variable is all about accesing the methods and variables there different way for the 
//to access it lets see them 

public class StaticNonStaticVariables {
	
	String name = "Tom";//non static global variable 
	static int age = 25;//static global variable 
	

	public static void main(String[] args) {
		//.how to call static method and variables ? 2way for that 1st way direct calling 
		
		Sum(); 
		
		//2nd way by class name 
		StaticNonStaticVariables.Sum(); 
		
		//calling static variable are same as method direct and by class name 
		
		
		System.out.println(age);
		System.out.println(StaticNonStaticVariables.age);
		
		//how to call non static var and method for that we have to create the object of class 
		//when u create the object of class the copy of the non static var and method will be given to the object 
		//not static method and var 
		
		
		StaticNonStaticVariables obj = new StaticNonStaticVariables();
		
		System.out.println(obj.name);
		
		//for accesing and running the variable u have to wtite it inside of the printing 
		obj.sendmails();
		
		// but for the method you can write obj.and access to the non static method 
		//so usualy for accesing static method we use 2 ways direct way and by class name theres a question can i access to the static method
		//and variable by using object reference name ? answer yes 
		//but its gonna give you some warning,its not a good practise .meaning of the warning it says theresn a better way to acces it ))))

		}
	public void sendmails() {  //non static method 
		System.out.println("send mails non static  method ");
		
	}
	public static void Sum() {//static method 
		System.out.println("sum static method ");
		
		
	}
	
	

}
