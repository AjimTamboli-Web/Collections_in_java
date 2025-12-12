package collections;
import java.util.*;
public class J_Collection_Set {

	public static void main(String[] args) {
		
 /*  The Set interface of the Collections Framework.
  * Set is a Collection that:
		   ⏺️ Does NOT allow duplicate elements, Stores unique values
		   ⏺️ Does NOT maintain insertion order (except LinkedHashSet)
		   ⏺️ Allows null (except TreeSet)   Set is part of java.util package.
  * set is used to maintain the uniqueness in the given collection class.
  * 🔶 Why Set is used?	         												Iterable											
       Use Set when:   													     		↑												
		⭕	You want unique data												Collection	
		⭕	You don’t care about order											    ↑
		⭕	You want to remove duplicates							 			   Set(interface)
		⭕	You need faster search operations					     		        ├── HashSet
	⭐ Types of Set in Java - Java provides three main implementations:	=>	        ├── LinkedHashSet
						   														SortedSet────TreeSet										
  * 🔥 Why duplicates are not allowed?
  *  => Because before storing value in Set:
		✔️ HashSet → checks using hashCode() + equals()
		✔️ TreeSet → checks using compareTo()
		✔️ LinkedHashSet → uses both above
	If values are equal → Set rejects duplicate.				   													
 */
		
			Set<Integer> set = new HashSet<>();
			set.add(32);	set.add(89);	set.add(34);    set.add(23);	set.add(54);	 set.add(32); // ignore
			System.out.println(set);
			System.out.println(set.contains(32)); // true
			System.out.println(set.remove(54));   // true
			System.out.println(set.isEmpty());   // false
			System.out.println(set.hashCode());  // 178
			System.out.println(set.size());     // 4
			System.out.println(set);
			
			Set<Integer> set1 = new LinkedHashSet<>();
			set1.add(32);	set1.add(54); 	 set1.add(65);		set1.add(34);		set1.add(54);	set1.add(32); // ignore
			System.out.println(set1);
			System.out.println(set1.equals(set));  // false
			set1.clear(); // remove all elements
			System.out.println(set1.isEmpty()); // true
	}

}
