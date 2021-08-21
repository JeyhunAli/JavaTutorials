
/** 
 *
 * java collections is used when data is dynamic 
 * java collections are framework that provides to store and manipulate the group of the data 
 * java collections can achieve all the operations that i we can perform in java such as inserting deleting searching sorting 
 * java collections provides many interfaces like set list queue 
 * and classes Arraylist, linkedlist, Hashset, linkedhashset
 * 
 * 
 */

//Array is a fixed length data structure whereas ArrayList is a variable length Collection class.

//We cannot change length of array once created in Java but ArrayList can be changed.
//if we want to change size of static array it gonne give us outofboundexception
//to solve this issue we use one of the dynamic array consept calls Arraylist

//
//
//
package collections;

import java.util.ArrayList; //once we created object of Array list here we are importing 

public class ArraylistInJava {

	public static void main(String[] args) {
		// here we can add all kind of data types in our arraylist

		ArrayList ar = new ArrayList(); // creating the ArrayList Object its default alredy exist in java
										// this is the non generic array list collection.because we didnt define them
										// and they give yeollow color warning
		ar.add(100); // but in array consept first we declare of the size then we are giving the
						// value
		ar.add(200);
		ar.add(300);

		// checking current size for that we use .size method alredy inside of the java
		System.out.println(ar.size());

		// Adding some more value
		ar.add(400); // in arraylist we can store duplicate values as well
		ar.add(500); // in arraylist it maintenance insertion order it means it starts from zero
		ar.add(600); // synchronized
		ar.add(600); // duplicate value are allowed in arrayy list

		// System.out.println(ar.get(7)); if i run this line it will give
		// <<<java.lang.IndexOutOfBoundsException>>>

		System.out.println(ar.size());

		ar.add("hello Automation");
		ar.add(true); // advantages of ArrayList we can declare all kind of data type in one class
		ar.add('A'); // remember it stores the values in decimal indexes
		ar.add(25.66);
		ar.add(false);
		ar.add(245);
		ar.add("gelmishdun");
		System.out.println(ar.size());

		ar.remove(12); // remove method available just in case

		System.out.println(ar.size());

		// if i want to check what is the value of 4th location for that we use get
		// method in java
		// if want to check the index location which is not available its gonna throw
		// out of bound exception

		System.out.println(ar.get(4));
		System.out.println(ar.get(6));
		System.out.println(ar.get(10));
		// System.out.println(ar.get(13)); //index out of bounds exception

		// if we want to get all the values on the console we use for loop consept

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));

		}

		// restiriction of data type in my arraylist once we restrict it we can declare
		// only that particular data type
		// for that first we create object with which data type we want to define
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(5000);
		// ar1.add("learning java") once we declared data type as integer then we cannot
		// use another data type
		ar1.add(6000);
		ar1.add(45687);
		System.out.println(ar1.size());

		ArrayList<String> ar2 = new ArrayList<String>(); // this is generic arraylist what does is means ? it means we
															// are defining in our arraylist
		// in what kind data type we are gonna store our values
		// if its string generics we can store only string, and so on
		ar2.add("Jeyhun"); // before the 1.5java jdk version java didnt support generics .but now java
							// suports jeneric
		ar2.add("inAmerica"); // at the same time we can store different data type as well as specific data
								// types
		ar2.add("atVacation");
		System.out.println(ar2.size());
		System.out.println(ar2.get(2));

		/**
		 * Arraylist is implementing list interface in arraylist we insert the values in
		 * basis of ordering like start from 0,1,2,3,4 so on arraylist is not
		 * synchronized thats why its slow in arraylist we can fetch the value by the
		 * random access by index if we are using array list without generics we can
		 * store all kind of data type ---and this calls non generics array list concept
		 * but once we define generics in our array list we have to pass that values to
		 * the array list
		 */

		/**
		 * sometimes in arraylist we have to define our user define means --- class
		 * object
		 * 
		 * 
		 * 
		 * Java ArrayList class uses a dynamic array for storing the elements. It
		 * inherits AbstractList class and implements List interface.
		 * 
		 * The important points about Java ArrayList class are:
		 * 
		 * +Java ArrayList class can contain duplicate elements. +Java ArrayList class
		 * maintains insertion order -- it means starts from zero +Java ArrayList class
		 * is non synchronized. +Java ArrayList allows random access because array works
		 * at the index basis. +In Java ArrayList class, manipulation is slow because a
		 * lot of shifting needs to be occurred if any element is removed from the array
		 * list.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * default capacity of arraylist is 10 whenever we are creating object of the
		 * arraylist java internally spare a capacity for that and its ten there ywo
		 * type of the capacity one virtual another one is physical capacity
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
