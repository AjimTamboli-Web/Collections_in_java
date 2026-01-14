package collections;

import java.util.*;

public class P_Maps_Entry_entrySet {

	public static void main(String[] args) {
	
/*
 * Map.Entry is a nested interface inside the Map interface.		
 * Each key–value pair in a Map is represented as a Map.Entry object.			  interface Map<K, V> {
   A Map does NOT store elements directly like List or Set.					    interface Entry<K, V> {
   Instead, it stores pairs:  key  →  value										        K getKey();
   Java needs a way to represent one pair  ➡️ That representation is Map.Entry			V getValue();
   Accessing Map.Entry using entrySet()					   						        V setValue(V value);
    Set<Map.Entry<Integer, String>> entries = map.entrySet();						    }
    entrySet() returns Set of Entry objects,Each Entry = one key-value pair.		}
 * By gaining access to the entry of the Map we can easily manipulate them.
 * 1)equals (Object o)  2)K getKey()  3)V getValue()  4)V setValue(V v) 
 * Set<Map.Entry> entrySet() - Returns the Set view of the entire map. 
 * Note : This is not a method of Map.entry interface but it is discussed here because this method is 
   useful while working with Map.Entry interface.   
 * 
 */
	
		Map<Integer,String> map1 = new HashMap<>();
		
		map1.put(4, "Nolan");
		map1.put(8, "Joe");
		map1.put(1, "Hank");
		map1.put(5, "Quientessa");
		map1.put(9, "Peter");
		
		 // Displaying the Map
		System.out.println("Initial mapping: " + map1); // {key=value,.....}
		
	 // Using entrySet() to get the entry's of the map / get the set view	
		Set<Map.Entry<Integer, String>> entr = map1.entrySet();
		System.out.println("The set is: " + entr);  // [key=value,....]
		
/* Map entrySet() method
	The java.util.Map.entrySet() method in Java is used to create a set out of the same elements contained in the map.
	It basically returns a set view of the map or we can create a new set and store the map elements into them.
 ⚠️ Why does entrySet() return a Set?
    ✔ Keys are unique    ✔ Set does not allow duplicates    ✔ Entry uniqueness depends on key 
      
*/	
		
		for(Map.Entry<Integer, String> en:entr) {  // enhanced for loop
//			System.out.println(en); // get entry one by one
			
			System.out.println("Get key and value: " + en.getKey() + " and " + en.getValue());	
		}
		
		map1.put(3, "Elena");
		System.out.println(entr);
		
	System.out.println("Using Iterator::  ");	
		// Using Iterator
		Iterator<Map.Entry<Integer, String>> ite = map1.entrySet().iterator();
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		// ✔ Allows safe removal using it.remove()
		
	}

}
