package java_tutorials;
//This class implements a hash table
//A hash table is a data structure that is used to store keys/value pairs.
//It uses a hash function to compute an index into an array in which an element will be inserted or searched
// hashtable is synchronized   it means one by one 
// its similiar to the hashmap 
//hashtable  key in form of the object  and value in form the hashcode each and every value has own unique code 
//hashtable is allows unique values but not nul values
//but in hashmap we can store multiple null values 
//generics are allowed in hashtable



import java.util.Hashtable;

public class HashtableConsept {

	public static void main(String[] args) {

		Hashtable h = new Hashtable();
		h.put(1, 100);
		h.put('s', 500);
		h.put(2, 222);
		System.out.println(h.size());
		System.out.println(h.get('s'));
		
		
		h.put(2, 55);
		h.put(5, 568);
		h.put(3, "tom");
		
		System.out.println(h.get(5));
		System.out.println(h.get(3));
		
		Hashtable <Integer, Integer> h1 = new Hashtable <Integer, Integer>(); //here we are restricting the value by giving arguments 
		h1.put(55, 256);
		h1.put(6, 236);
		System.out.println(h1.size());//here running of the size 
		System.out.println(h1.get(55));// here by giving key value we running the program
		
		
		Hashtable <Integer, String> h2 = new Hashtable <Integer, String>(); //here we are restricting the value by giving different arguments 

		h2.put(5, "Jeyhun");
		h2.put(6, "inQueens");
		h2.put(9, "inQaEnvironment");
		
		System.out.println(h2.get(5));
		System.out.println(h2.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
       	
		}
	

}
