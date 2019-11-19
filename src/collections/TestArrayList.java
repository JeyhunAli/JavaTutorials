package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		
		
		
		/**
		 * employee object created 
		 * 3 emp added 
		 */
		 Employee e1 = new Employee("Jeyhun ", 30, "Brooklyn "," IT");
		Employee e2 = new Employee("Nastyush", 31, "Brooklyn", "Nurse");
		Employee e3 = new Employee("Emiliya", 2, "Brooklyn", "home");
		Employee e4 = new Employee("chloe", 8, "18avenue", "home 1stfloor");

		 
		/**
		 * creating object of the arraylist and passing all these three data to arraylist 
		 * this is the most important concept 
		 * 1st creating class with constructor adding all the parameters  then inside Testarraylist class 
		 * creating that particular class object then creating arraylist object then passing class name inside the arraylist 
		 * then add method 
		 * but if i want to get all the values for that i have to use iterator with the while loop 
		 * then has next method after that next method 
		 * 
		 */
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		/**
		 * now im gonna use iterator to traverse the value 
		 * why i cannot use the for loop because here im iterting  object and iteration works with while loop 
		 * 
		 */
		Iterator <Employee> it = list.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.print(emp.age);
			System.out.println(emp.city);
			System.out.println(emp.Dept);
			System.err.println(emp.name);
		}
		
		
	}

}
