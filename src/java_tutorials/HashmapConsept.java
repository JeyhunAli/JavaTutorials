//Hashmap is base on key and value  (k and v)
//Hashmap is a class which is extends abstract map which is inherit from abstarct map class
//and which implement map interface, its memeber of map family thats why its implemenet map interface
//hashmap is contains unique elements 
//hashmap stores the value in the form of key and value of pair 
//hashmap it may have one null key and multiple null values
//
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
		  for(Entry  m: hm.entrySet()) {         //this is the consept of fecthing the value 
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
		  
		  for(Entry <Integer,Employee> m: emp.entrySet()) {
			  int key = m.getKey();
			  Employee e = m.getValue();
			  System.out.print("Employee " +key + " info ");
			  System.out.println(e.name+" "+e.age+" "+e.city+" "+e.Dept);
		  }

		  
		  
		  
		  
		//if you want to fetch the value of from hashmap we have to use 	
		
	}

}
