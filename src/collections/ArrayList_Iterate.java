package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayList_Iterate {

	public static void main(String[] args) {
	
		
		ArrayList<String> students = new ArrayList<String>();
		students.add("Naveen");
		students.add("Jeyhun");
		students.add("Sahib");
		students.add("Elnur");
		students.add("Famil");
		students.add("Gelmishdun");
		
		//typical for loop 
		for(int i=0; i<students.size(); i++) {
			System.out.println(students.get(i));
		}
		
		
		System.out.println("----------------------");
		
		//for each loop
		for(String e: students) {
			System.out.println(e);
		}
		
		System.out.println("----------------------");
		
		
		//jdk 8 Strams with lambda 
		students.stream().forEach(elements -> System.out.println(elements));
		
		System.out.println("----------------------");
		
		//Iterator
		Iterator<String> it = students.iterator();
		while(it.hasNext()) {
			String listOfStudents = it.next();
			System.out.println(listOfStudents);
		}
		
		System.out.println("----------------------");
		
		//declaring arraylist as this passing inside constructor arrays class and  aslist method then all your values 
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		System.out.println(numbers);
		
		//negative indexing its not allowed in java collection 
		
		
		
		
		
		
		
	}

}
