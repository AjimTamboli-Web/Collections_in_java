package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;



public class L_LinkedHashSet {

	public static void main(String[] args) {

/*
 * LinkedHashSet in Java implements the Set interface of the Collections Framework.
 * Initial capacity → 16    Load factor → 0.75
 * It combines the functionalities of a HashSet with a doubly-linked list to maintain the insertion order of elements.
 ⏺️ LinkedHashSet stores unique elements only and allows a single null.	  Set			
 ⏺️ Implements Set, Cloneable and Serializable interfaces.				   ↑	    -- implements	
 * ⚠️  LinkedHashSet is a Set implementation that:						AbstractSet
    ⭕ Stores unique elements  ⭕ Maintains insertion order 				   ↑    -- Extends
    ⭕ Allows only one null    ⭕ Is not synchronized						HashSet
																		   ↑    -- Extends
 * Performance Slightly slower (due to order tracking)					LinkedHashSet
 * Must override: for maintain uniqueness in custom classes
	equals()  hashCode()
 */
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
			
		lhs.add("Harry");
		lhs.add("John");
		lhs.add("Dany");
		lhs.add("Cleo");
		lhs.add("Jerry");
		lhs.add("John");   // ❌ ignored 
		lhs.add(null);
		lhs.add(null);    // ❌ ignored
	// insertion order maintain	
		System.out.println(lhs);
	    lhs.addFirst("Tom");  // because it has node head and tail it all operations on first and last node.
	    lhs.addLast("Robert");
	    System.out.println("Updated set: " + lhs);
	    
	    for(String s:lhs) {
	    	System.out.println(s);
	    }
	    
		
/*
 * 	From Java 10, you can use the var keyword to declare a LinkedHashSet variable without writing the type twice.
  				 The compiler figures out the type from the value you assign.
 *	This makes code shorter, but many developers still use the full type for clarity. 
     Since var is valid Java, you may see it in other code, so it's good to know that it exists:	
 */

		
	// task => remove duplicates but keep order
		var list = Arrays.asList(10, 20, 10, 30,34,65,2,65,12,34,67);   
		var sor = new LinkedHashSet<Integer>(list);
		System.out.println("Linked Hash Set: " + sor);
		
		List<Integer> lis = new ArrayList<>(sor);
		System.out.println("Array List: " + lis);
		
		
// retaining all		
		LinkedHashSet<Integer> setli = new LinkedHashSet<>();
		setli.add(32);  setli.add(78); setli.add(20);  setli.add(10);
		System.out.println("Before retaining: " + setli);
		setli.retainAll(list);
		System.out.println("After retaining with linked hash set list: " + setli);
	}

}
