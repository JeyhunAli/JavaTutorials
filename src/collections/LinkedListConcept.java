
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
 * in linkedlist we have addfirst and addlast methods which is not have in arraylist
 * 
 * 
 * The LinkedList class has all of the same methods as the ArrayList 
 * class because they both implement the List interface. 
 * This means that you can add items, change items, 
 * remove items and clear the list in the same way.
 * 
 * 
 * 
 * <<<<<<<<<<When To Use>>>>>>>>>>>>>>>>>
It is best to use an ArrayList when:

You want to access random items frequently
You only need to add or remove elements at the end of the list
It is best to use a LinkedList when:

You only use the list by looping through it instead of accessing random items
You frequently need to add and remove items from the beginning or middle of the
list
 * 
 * 
 *  LinkedList provides several methods to do certain operations more efficiently:
 *  
 *  addFirst()	    Adds an item to the beginning of the list.	
    addLast()	    Add an item to the end of the list	
    removeFirst()	Remove an item from the beginning of the list.	
    removeLast()	Remove an item from the end of the list	
    getFirst()	    Get the item at the beginning of the list	
    getLast()	    Get the item at the end of the list


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

		System.out.println(ll); // it will print all the values in one line

		ll.addFirst("Jeyhun");
		ll.addLast("leaning");// here we use add first and add last method to add some more changes to our
								// first ll

		System.out.println(ll); // here i use get method to get the index of value
		System.out.println(ll.get(0)); // here get method is example of the method overloading concept in java
		System.out.println(ll.get(2));

		ll.set(0, "Azerbayjan"); // set method in linkedlist is used to set new value in index where exactly u
									// want
		System.out.println(ll.get(0)); // earlier in 0 index it was jeyhun now is azerbaijan

		ll.set(2, "Python");
		System.out.println(ll.get(2));

		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);

		ll.remove("testng"); // remove method is also example of the method overloading concept
		System.out.println(ll); // here remove method removing specific object

		/**
		 * so to print all the values in linkedlist we have several ways
		 * 
		 * 1st for loop 2nd advanced for loop 3rd iterator 4while loop
		 * 
		 */
		System.out.println("<<<<<<<<<<<<<<<<<<getting all the data using for loop >>>>>>>>>>>>>>>>>>>>>.");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		System.out.println("<<<<<<<<<<<<<<<<<<getting all the data using for advanced loop >>>>>>>>>>>>>>>>>>>>>");
		for (String str : ll) {
			System.out.println(str);

		}

		System.out.println("<<<<<<<<<<<<<<<<<<getting all the data using ITERATOR  >>>>>>>>>>>>>>>>>>>>>");
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("<<<<<<<<<<<<<<<<<<getting all the data using while loop  >>>>>>>>>>>>>>>>>>>>>");

		int num = 0;
		while (ll.size() > num) {
			System.out.print(ll.get(num));
			num++;

		}

	}

}
