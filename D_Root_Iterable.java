package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class D_Root_Iterable {

	public static void main(String[] args) {
/*
 * An Iterator in Java is one of the most commonly used cursors in the Java Collections Framework. 
   It is used to traverse or iterate through elements of a collection one by one.
 * ⏺️ It is used to traverse elements in the forward direction only.	
 * ⏺️ Removes elements safely during traversal using remove().
 * ⏺️ Iterator is a universal cursor that applies to all collection types — List, Set, and Queue.
 * 												                 Iterable
 * ⭕ Methods of Iterator Interface					                 ↪ 	 Collection
 * ⏺️ hasNext(): Returns true if the iteration has more elements.                ↪  	List
 * ⏺️ next(): Returns the next element in the iteration.                                ↪  Iterator
          It throws NoSuchElementException if no more element is present.
 * ⏺️ remove():Removes the last element returned by next().This method can be called only once per call to next().
 * 
 * 
 */
		
		
	// you can iterate over a collection with the help of 1> for loop , 2> enhanced for loop,
		// 3> iterator interface, 4> list iterator interface

// why concurrent exception occurred enhanced for loop and no exception in simple for loop when deleting object
		
		
		List<Integer> list = new ArrayList<>();
		list.add(32);
		list.add(87);
		list.add(23);
		list.add(52);
		list.add(84);
		
		System.out.println(list);
		
		Iterator<Integer> it = list.iterator(); // Obtain an iterator for the ArrayList
		
		while(it.hasNext()) { // Iterate through the elements and print each one
			
			Integer n = it.next(); // // Get the next element
			System.out.println("Value: " + n);
		}
	
		
		
		
	// Concurrent modification exception in loops	
		// it occurred when  modCount != expectedModCount not equal throws ConcurrentModificationException
		// give error because it's fail-fast, internally it uses the Iterator which is fail-fast
//		for(int i:list) {  // for each loop            
//			if(i == 32) {
//			list.remove(1);   // concurrent modification exception
//			}
//			System.out.println(i);
//		}
// for-each loop throws ConcurrentModificationException because it internally uses Iterator,which is fail-fast.
		
//******************************************************************************		
		
//		for(int i=0; i<list.size();i++) { // for loop
//			System.out.println(list.get(i));
//			list.remove(1);                                // unpredictable output
//		}   // it does not give error but it is risky to use
	
//**************************************************************************		
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {   // iterator interface
//			System.out.println(itr.next());
			if(itr.next() == 23) {               // safe to use 
				itr.remove();
			}
		}
		System.out.println(list);
	
		// it does not give you error because it update modCount & expectedModCount, both remain equal
		// so no exception
	}

}
