//Array is a fixed length data structure whereas ArrayList is a variable length Collection class.
//We cannot change length of array once created in Java but ArrayList can be changed.
//if we want to change size of static array it gonna give us outofbounding error
//to solve this issue we use one of the dynamic array consept calls Arraylist

//We cannot store primitives in ArrayList, it can only store objects. But array can contain both primitives and objects in Java. 

package java_tutorials; 

import java.util.ArrayList; //once we created object of Array list here we are importing 

public class ArraylistInJava {

	public static void main(String[] args) {
        //here we can add all kind of data types in our arraylist 
		
		ArrayList ar = new ArrayList(); //creating the ArrayList Object  its default alredy exist in java 
		                             //  this is the non generic array list collection.because we didnt define them and they give yeollow color warning 
		ar.add(100);          //but in array consept first we declare of the size then we are giving the value 
		ar.add(200);         
		ar.add(300);
		
		//checking current size for that we use .size method alredy inside of the java 
		System.out.println(ar.size());  
		
		
		//Adding some more value 
		ar.add(400);  //in arraylist we can store duplicate values as well 
		ar.add(500);  //in arraylist it maintenance insertion order it means  it starts from zero 
		ar.add(600);  // synchronized
		ar.add(600); 
		
		System.out.println(ar.size());
		
		ar.add("hello Automation");
		ar.add(true);  //advantages of ArrayList we can declare all kind of data type in one class
		ar.add('A');   //remember it stores the values in decimal indexes 
		ar.add(25.66);
		ar.add(false);
		ar.add(245);
		ar.add("gelmishdun");
		System.out.println(ar.size());
		
		ar.remove(12); //remove method available just in case
		
		System.out.println(ar.size());
		
		//if i want to check what is the value of 4th location for that we use get method in java 
		//if want to check the index location which is not available its gonna throw out of bound exception
		
		System.out.println(ar.get(4)); 
		System.out.println(ar.get(6));
		System.out.println(ar.get(10));
		//System.out.println(ar.get(13));  //index out of bounds exception
		
		
		//if we want to get all the values on the console we use for loop consept 
		
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
			
			}
		
		
		//restiriction of data type in my arraylist once we restrict it we can declare only that particular data type 
		//for that first we create object with which data tyoe we want to define 
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(5000);
		//ar1.add("learning java")  once we declared data type as integer then we cannot use another data type 
		ar1.add(6000);
		ar1.add(45687);
		System.out.println(ar1.size());  
		
		
		ArrayList <String> ar2 = new ArrayList<String>(); //this is generic arraylist what does is means ? it means we are defining in our arraylist
		                                 //in what kind data type we are gonna store our values 
		                                //if its string generics we can store only string, and so on 
		ar2.add("Jeyhun");                 //before the 1.5java jdk version java didnt support generics .but now java suports jeneric 
		ar2.add("inAmerica");              //at the same time we can store different data type as well as specific data types 
		ar2.add("atVacation");
		System.out.println(ar2.size());
		System.out.println(ar2.get(2));
		
		
		
		
		
	}

}
