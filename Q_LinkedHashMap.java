package collections;

import java.util.*;
public class Q_LinkedHashMap {

	public static void main(String[] args) {
		
/*
 * 👉 It is a child class of HashMap  ✔️Stores unique key–value pairs   ✔️Maintains order 
 * It stores key-value pairs while maintaining the insertion order of the entries. 
 * It maintains the order in which elements are added.   ✔️Uses HashMap + DoublyLinked List
 * Allows one null key and multiple null values.   ✔️ It is not thread-safe;
 * LinkedHashMap uses: 1.Hash table → fast access   2. Doubly linked list → maintains order
 * 🫙 initial capacity 16  🔃 load factor 0.75
 * Cache implementation Easy using LRU cache (Least Recently Used)
 * Access Order(Used in Cache 🔥) Ex: LinkedHashMap<Integer,String> map =new LinkedHashMap<>(16, 0.75f, true);
   ⭕ Recently accessed entry moves to end
   ⭕ Used in LRU cache    (true)	                                          Map ----------------- e
     👉 LRU Cache removes the data that was used least recently            |                   ¦ x
   	 👉 Recently used data stays in cache                              AbstractMap             ¦ t
     👉 Old / unused data is removed automatically                         |                   ¦ e
                                                                        HashMap                ¦ n
 * 🔹 Why LRU Cache is Needed?                                             |                   ¦ d
 *  Cache has limited memory, so when it becomes full:                     |  extends          ¦ s
        ⭕ We must decide which data to remove                              |               SequencedMap    
 		⭕ LRU removes least recently accessed data                     LinkedHashMap-----------⌋ (implements)
 		📌 Used in: Browsers, Operating systems, Databases, CPU memory, Web servers
 		
 *  LinkedHashMap consumes more memory and is slightly slower than HashMap because it maintains a doubly
 *   linked list and supports access order and LRU caching, whereas HashMap focuses only on fast 
 *    key-based access.		
 */
          
	LinkedHashMap<String,Integer> lm = new LinkedHashMap<>(16,0.75f,true);
	
	lm.put("Where", 2);
	lm.put("Are", 8);
	lm.put("you", 4);
	lm.put("Now", 9);
	lm.put("??", 7);
	
	System.out.println(lm); // o/p {Where=2, Are=8, you=4, Now=9, ??=7} 
    
	//🔹 LRU Cache Rules : 1️⃣ Cache has fixed size
//						     2️⃣ Every get() or put() makes item most recently used
//						     3️⃣ When full → remove least recently used
	
	lm.get("Where"); // access where (make latest access)
	
	System.out.println(lm); // o/p {Are=8, you=4, Now=9, ??=7, Where=2}
          
	
	LinkedHashMap<Integer,String> LRUsed = new LinkedHashMap<>() {   // see cache magic
        							protected boolean removeEldestEntry(  // Automatically removes oldest entry
        								Map.Entry<Integer,String> eldest) {
        									return size() > 3;  			// Used to limit size of map
        								}
    							};
    							
    			LRUsed.put(1, "Now");
    			LRUsed.put(2, "You");
    			LRUsed.put(3, "See");
    			
    			System.out.println(LRUsed);
    			
    			LRUsed.put(4, "Me");  // removes key 1
    			
    			System.out.println("after put new elements: \n " + LRUsed);
    			
    			
    							
    							
    							
	}
}


