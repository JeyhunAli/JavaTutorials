

 /**  Linkedlist concept in java collection
  * linkedList is java class which is implementing list interface and as well as dequeue  interface 
  * linkedList is storing the data by two things    <<<< actual data and reference data >>>
  * in linkedList there are some more example of method overloading like 
  * add method , addAll method, remove method 
  * 
  * 
  * <<<<differeneces between collection and collections in java >>>>>>
  * collection is interface 
  * collections is java class
  * 
  * differences between arraylist and linkedlist 
  * ArrayList is better for storing and accessing data.
  * LinkedList is better for manipulating data.
  * arraylist accessing to the any index or object randomly is possible 
  * in linkedlist is not possible 
  * 
  */

package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add(" selenium ");
		ll.add(" java ");
		ll.add(" testng ");
		ll.add(" saat ");
		ll.add(" macbook ");
		ll.add(" dell ");
		ll.add(" Emiliya ");
		ll.add(" Nastush ");
		ll.add(" Jeyhun ");
		
		
		System.out.println(ll); //it will print all the values in one line 
		
		ll.addFirst("Jeyhun");
		ll.addLast("leaning");// here we use add first and add last method to add some more changes to our first ll 
		
		System.out.println(ll);          // here i use get method to get the index of value 
		System.out.println(ll.get(0));  //here get method is example of the method overloading concept in java 
		System.out.println(ll.get(2));
		
		ll.set(0, "Azerbayjan");   // set method in linkedlist is used to set new value in index where exactly u want 
		System.out.println(ll.get(0));  // earlier in 0 index it was jeyhun now is azerbaijan 
		
		ll.set(2, "Python");
		System.out.println(ll.get(2));

		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		
		ll.remove("testng");  // remove method is also example of the method overloading concept 
		System.out.println(ll); // here remove method removing specific object 
		
		
		/**
		 * so to print all the values in linkedlist we have several ways 
		 * 
		 * 1st for loop 
		 * 2nd advanced for loop 
		 * 3rd iterator 
		 * 4while loop 
		 * 
		 */
		System.out.println("<<<<<<<<<<<<<<<<<<getting all the data using for loop >>>>>>>>>>>>>>>>>>>>>.");
		for(int i=0; i<ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		
		System.out.println("<<<<<<<<<<<<<<<<<<getting all the data using for advanced loop >>>>>>>>>>>>>>>>>>>>>");
		for (String str : ll) {
			System.out.println(str);
			
		}
		
		System.out.println("<<<<<<<<<<<<<<<<<<getting all the data using ITERATOR  >>>>>>>>>>>>>>>>>>>>>");
		 Iterator<String> it = ll.iterator();
			 while(it.hasNext()) {
				 System.out.println(it.next());	 
			 }
			
			 
       System.out.println("<<<<<<<<<<<<<<<<<<getting all the data using while loop  >>>>>>>>>>>>>>>>>>>>>");
		
		int num = 0;
		while(ll.size()>num) {
			System.out.print(ll.get(num));
			num ++;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
