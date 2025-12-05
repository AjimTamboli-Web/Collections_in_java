package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class D_Collection_List {

	public static void main(String[] args) {

/*
 * ⏺️ Collections => Collection in Java is a framework that provides classes and interfaces to store and manipulate groups of objects.
 * 				    	It is found in:	 👉 java.util package
 * 		      The Java Collections class is used with the static methods that operate on the collections or return the collection. 
 * ⚠️ Why Collection Framework?
		Before collections, we used arrays, but arrays have drawbacks:  ❌ Fixed size  
		 		Iterable												❌ Only same type of elements
		            ↑													❌ No built-in methods (sort, search, add/remove dynamically)
		   		Collection													Collections solve all this.     
		   		    ├── List  (Ordered, Allows Duplicates)
		   		    ├── Set   (No Duplicates)
		   		    └── Queue  (FIFO: First In First Out)                                                      
 *		
 */
		
		List<Integer> al = new ArrayList<Integer>();  // create a arrayList to store elements.
		
		al.add(12);  al.add(54);  al.add(98);  al.add(76);  al.add(12);  al.add(67);  al.add(56);   al.add(98);
		
		System.out.println(al);
		
		List<String> ll = new LinkedList<String>();	  // create a LinkedList to store elements.
		
		ll.add("John"); ll.add("Dany"); ll.add("Robb"); ll.add("Jamie"); ll.add("Tyrion");  ll.add("Arya"); ll.add("Cersey");
		
		System.out.println(ll);
// *************************************************************************************************************************
		
		Set<Integer> hs = new HashSet<Integer>();
		
		hs.add(12); hs.add(56); hs.add(12); hs.add(65); hs.add(54); hs.add(34); hs.add(78); hs.add(98); hs.add(34);
		
		System.out.println(hs);
		
		Set<String> ts = new TreeSet<String>();
		
		ts.add("Aeron");  ts.add("Daemon");  ts.add("Stefan");  ts.add("Elena");  ts.add("Elija");  ts.add("Aeron");    
		
		System.out.println(ts);
		
	}

}

