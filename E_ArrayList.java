package collections;
import java.util.*;

public class E_ArrayList {

	public static void main(String[] args) {
		
/*
 * ⏺️ ArrayList => An ArrayList in Java is a resizable (or dynamic) array from the java.util package that can grow or shrink 
 * 						automatically as elements are added or removed, unlike regular arrays with a fixed size.		
 *  ArrayList is a resizable (dynamic) array in Java.  It is part of the java.util package and implements the List interface.
 *  																				ArrayList(class)
 *  ⚠️ Why ArrayList? => 	Because normal arrays are fixed size.					  |							  extends
 *  																				  └--------> List(interface)────────────>Collection
 * ⭕ Indexed Access: Elements can be accessed using their index,just like arrays.    implements     
 * ⭕ Allows Duplicates: Duplicate elements are allowed.
 * ⭕ Maintains Insertion Order: Elements are stored in the order they are inserted.
 * ⭕ Not Synchronized: ArrayList is not thread-safe. To make it thread-safe, you must wrap it manually using Collections.synchronizedList().
 * 
 *  💪🏻 Initial capacity = 10 (default).  When array fills up, it increases size by 1.5 times
 *  
 *  🔥 Advantages of ArrayList => ✔ Fast access  ✔ Dynamic resizing  ✔ Easy to iterate ✔ Store heterogeneous data using Object type
                                    ✔ Many utility methods available
 *  ⚠️ Disadvantages of ArrayList => ❌ Slow removal and insertion in middle  ❌ Not thread-safe
          	                          ❌ Inefficient for large data insertions    ❌ Shifting of elements required on removal    
 *  🚀 Complexity of Java ArrayList =>   Access: O(1)	       Insert end: O(1) amortized
										 Insert middle: O(n)   Remove middle: O(n)
										 Search: O(n)          Space: O(n)     	                                                         
 */
		
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(23);
		list.add(56);
		list.add(12);
		list.add(876);
		list.add(65);
		list.add(65);
		list.add(2234);
		list.add(223);
		list.add(null);  // allows null values
		
		System.out.println(list);
		System.out.println(list.size());  // 9
		System.out.println(list.contains(65)); // true
		System.out.println(list.indexOf(2234)); // 6
		System.out.println(list.lastIndexOf(876)); // 3
		System.out.println(list.remove(2));     // delete 12
		System.out.println(list); // updated list
		System.out.println(list.getFirst());  // 23
		System.out.println(list.getLast());   // null
		System.out.println(list.reversed());  // reverse
		System.out.println(list);  // immutable
		
		list.set(2, 12);
		System.out.println("List after updation of value:\n" + list);
		
	}

}
