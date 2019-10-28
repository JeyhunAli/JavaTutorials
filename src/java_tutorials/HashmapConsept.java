//Hashmap is base on key and value  (k and v)
//Hashmap is a class which is extends abstract map which is implements map interface 
//and which implement map interface, its memeber of map family thats why its implemenet map interface
//hashmap is contains unique elements 
//hashmap stores the value in the form of key and value of pair 
//hashmap it may have one null key and multiple null values
//in hash map lets say we are printing the key which is not exisitng in the code while executing its not gonna give out of bound exception
//it will give null
//we use Entry interface in hashmap to traverse the value 
////hashmap is not synchronized it means if i use multi threading concept then more than one thread can i access proccess of the hashmap
//going to be simultaneously   it means all the threads are running and and hashmap object can be accessibly by all the threads
//then performance of the hashmap will be increased automatically 
//whenever we need fast performance we use hashmap
//we dont use hashtable for fast performance because hashtable is synchronized hashtable accesible only one thread but hashmap 
//accesible multible threads  it means hashap is not thread safe 
//soo there is a problem with the hashmap let me explain 
//
//usually in multi threading application hashmap is used in order to improve the performance 

// if i want to avoid from multhi threding in hashmap instead of hashmap need to use concurrent hashmap and this hashmap came to the market 
//jdk 1.6

//lets say i have one hashmap object created with key and value pair 
//and there also some more threads and they can access to main object  once they access it if they do some manupilation or some change 
//or main hashmap  if some change happening in hashmap object u are excepting something but u getting different updated version
//and this candititon call in java fail fast  at that time its gonna give concurrent modification exception






package java_tutorials;

import java.util.HashMap;
 
import java.util.Map.Entry;

public class HashmapConsept {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "hello Testing");
		hm.put(3, "YouTube");
		hm.put(4, "Dell laptop");
		
		  System.out.println(hm.get(1));
		  System.out.println(hm.get(2));
		  System.out.println(hm.get(5));   //here if we run this program its not gonna give us any outofboundexception 
		  System.out.println("******************");       //its only gonna give null on the console 
		 
		//if we want to print all the values for that we use for loop 
		//iterating of the hashmap using for loop 
		  //this the concept of iterating
		  
		  //Entry here 
		  
		  
		  for( Entry  m: hm.entrySet()) {         //this is the consept of fecthing the value 
			  System.out.println(m.getKey() +" "+m.getValue());   // m here is storing reference value 
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		
		  
		  System.out.println("**********************************");
		  
		  
		  System.out.println("before removing the value"+hm); // printing all the value 
		  hm.remove(3); // removing method we can remove some of the method as well 
		  System.out.println("after removing the value "+hm); 
		  
		  
		  
		  System.out.println("*********************************************************************");
		  
		  HashMap<Integer, Employee> emp = new HashMap<Integer,Employee>();
		  Employee emp1 = new Employee("tom",25,"Brooklyn","qa");
		  Employee emp2 = new Employee("Steve",24,"Canada","qa");
		  Employee emp3 = new Employee("Adam",34,"NewYork","dev");
		  Employee emp4 = new Employee("Jeyhun",30,"Brooklyn","dev");
		  
		  emp.put(1, emp1);
		  emp.put(2, emp2);
		  emp.put(3, emp3);
		  emp.put(4, emp4);
		  
		  //traversing the hashmap;
		  //Entry here is interface which is use to traverse the value 
		  for(Entry <Integer,Employee> m: emp.entrySet()) {
			  int key = m.getKey();
			  Employee e = m.getValue();
			  System.out.print("Employee " +key + " info ");
			  System.out.println(e.name+" "+e.age+" "+e.city+" "+e.Dept);
		  }

		  
		  
		  
		  
		//if you want to fetch the value of from hashmap we have to use 	
		
	}

}
