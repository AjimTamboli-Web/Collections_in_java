package collections;

import java.util.HashMap;
import java.util.Map;

public class P_Map {

	public static void main(String[] args) {
		
/*
 * Map=> 👉 Map is an interface in java.util package that stores data in key–value pairs.	
 * ⭕ Keys are unique  ⭕ Values can be duplicate  ⭕ Each key maps to only one value
   ⭕ Map is NOT a part of Collection interface                                 Map (Interface)
 * Why map is not a collection part❔ 												│
   => ⭕ Stores key–value pairs ⭕ put() method   ⭕ Example: HashMap, TreeMap          ├── HashMap
      ⭕ So Map has separate hierarchy.												│     └── LinkedHashMap	
 *	How Map Works Internally	❔														│
 *	=> ⏺️ Internally uses keys to find values  ⏺️ Most maps (HashMap) use hashing		├── TreeMap
 *	⏺️ Key’s hashCode() decides bucket  ⏺️ equals() checks exact key match			│
 *	⏺️ 📌 That’s why hashCode() + equals() are important.							├── Hashtable
 *  📌 If same key is inserted again → old value replaced
 * A Map is useful if you have to search, update or delete elements on the basis of a key.
 * A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method.
 *   
 *    							Map (interface)
				                    |
				    ---------------------------------------
				    |               |                     |
				SortedMap        ConcurrentMap        (Direct Implementations)
				    |               |                     |
				NavigableMap   ConcurrentHashMap     HashMap
				    |                                   |
				 TreeMap                          LinkedHashMap
				                                   |
				                               Hashtable (legacy)
 * 
 */
		
     Map<Integer,String> map = new HashMap<>();
     map.put(2, "fsad");
     map.put(8, null);
     map.put(10,"Walker");  // no order 
     map.put(9, null);     // multiple value allowed but key is different
     map.put(3, "Dany");
     map.put(null, null); // accept only one null key 
     map.put(9, "peter");
     map.put(null, "dot");  // add latest insertion and override it
     map.put(2, null);   // override the key value and pair
     
     System.out.println(map);
     System.out.println(map.containsValue("Dany"));
     System.out.println(map.containsKey(2));
     System.out.println(map.size());
     System.out.println(map.get(10));
     
     System.out.println("**************************************");
     
    // count frequency of given string
     
     String name = "abbcd ddecaa";
     
     char[] chars = name.toCharArray();
     
     Map<Character, Integer> map2 = new HashMap<>();
     
     for(char c : chars) {
    	 
    	  int frequency = 1;
    	  
    	  if(map2.containsKey(c)) {
    		  frequency = map2.get(c) + 1;
    	  }
    	   
    	   map2.put(c, frequency);
    	 
     }
     System.out.println(map2);
     
  // second way *********************************************   
    
     for(int i = 0; i<chars.length;i++) {
    	    int fre = 1;
    	   char c = chars[i];
    	    
    	    if(map2.containsKey(c)) {
    	    	   fre = map2.get(c) + 1;
    	    }
    	    map2.put(c, fre);
     }
     
     System.out.println(map2);
     
	}

}
