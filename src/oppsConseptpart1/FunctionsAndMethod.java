//how we write the method ----->>> return type, method name and if there paramaters we are passing them 
//mathod cn have return type it mught not have the return type void 
//any data type can be return type 
//A method is a set of code which is referred to by name and can be called
//by  method's name.

package oppsConseptpart1;


public class FunctionsAndMethod {

	public static void main(String[] args) {  //main method is starting point of executing 
		//always remember function and method are same 
		//in this lesson we will talk about anly  non-static method 
		//how to create method "public void and method name"public is open to everyone void it means itsnot returning anything 
		FunctionsAndMethod fndm = new FunctionsAndMethod();  //created object of the class.here newfunction is the object not (fndm)
		fndm.test();                     		//(fndm)is object refrence name 

		
		int j =fndm.pqr();              //and here the value of method return c 10 is given to fndm.pgr. and in order to store and print it 
		System.out.println(j);                      //on the console we use int. //because its an integar number 


       String s1 = fndm.qa();
System.out.println(s1);

 int div = fndm.divison(50,25);   // we have pass to variable some num instead of the x,y 
System.out.println(div);



		//ones we created object of class all the methods that we created earlier 
		//the copy of all the methods given to the new object 
	}                                  //main method is static rest no 
	//object cannot hold the static method only non static method 
	// now we will call each and every method to inside of the main method in order to run and print them inside of the console 
	public void test() { //return type void   
		//after name brackets means this is the method inside of the brackets u can pass some arguments 
		System.out.println("Test method");         //no input no output
	}
	public int pqr() {//return type int  //here as u see no input but some output
		int a=10;
		int b=20;
		int c=b-a;
		return c;  //if returning something automaticly we have to change void to return type int 
		//if its double,char,boolean,string automaticly to that data types 
	}
	public String qa() {   // return type string   //here as u see no input but some output 
		System.out.println("qa");
		String s= "selenium";
		return s;
	}
	// int x, int y --->> input parameters/arguments.
	public int divison(int x,int y) {
		System.out.println("divison");
		int d = x/y;
		return d;
		//**************************************************************************************************************
		//if you will run this program now it will not run why because the main method is empty we 
		// are not printing anything in order to print it we have to call each and every method we declared 
		//for each and every method we need one entity.how we create entity for that we have to create one object 
		//for that we creating object of the class. 1st class name equal to new same class name 
		//***************************************************************************************************************
	}
}
//always remember if you want to call inside of the main method non static method you have to create object of the class 
// because inside of the object all the methods there 
//note why main method is void .because we never write return statement inside of the main method 
