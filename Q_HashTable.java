package collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class Q_HashTable {

	public static void main(String[] args) {
		
/**
 * It is a legacy class like vector. which has been part of Java since its early versions.                     Object
 * Java Hashtable class doesn't allow null key or value.														   ⬇️
 * To successfully store and retrieve objects from a hashtable, the objects used as keys must implement        Dictionary (Abstract class)
   the hashCode method and the equals method.																   ⬇️ 	
 * Initial default capacity 11 , load factor 0.75 . Hashtable stores key/value pair in hash table.             HashTable
 * It is similar to HashMap, but is synchronized.thread-safe.													      ↪ implements >> Map	
 * HashMap doesn't provide any Enumeration, while Hashtable provides not fail-fast Enumeration.                
 * Java Hashtable class contains unique elements.														    Dictionary is obsolete now
 * The Hashtable class also implements the Enumeration interface for going over its elements.
 * The interface is old and inferior to iterators or enhanced for loop features, but it is there for compatibility issues with old Java code.	
 * How data is stored?
	⭕	Uses hash table
	⭕	Internally uses an array of buckets
	⭕	Each bucket stores Entry objects
	⭕	Collisions are handled using linked list	
	
 */

		Hashtable<Integer,String> ht = new Hashtable<>();
		
		ht.put(3, "null");
//		ht.put(null, null);  // NullPointerException - did not take null key or null value 
		ht.put(4, "Percy");
		ht.put(8, "Will");
		ht.put(2, "Nancy");
		ht.put(9, "Derek");
		
		System.out.println("HashTable Elements: " + ht);
		
		// Iterating using enhanced for loop
		for( Map.Entry<Integer, String> map :  ht.entrySet()) {
			
			System.out.println("value Name: " + map.getValue() + "|| key number: " + map.getKey() );
		}
		
		System.out.println("Remove Element : " + ht.remove(3));
		
		System.out.println("Updated list: " + ht);
		
		
		// Using Enumeration (Legacy way) 
		Enumeration<Integer> keys = ht.keys();
		while(keys.hasMoreElements()) {
			Integer key = keys.nextElement();
			System.out.println(key + " " + ht.get(key));
		}
		
	}

}
