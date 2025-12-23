package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class O_Deque {

	public static void main(String[] args) {

/* Queue (one end only)			Deque (both ends)						Collection
 * Add → REAR					Add → FRONT or REAR							|
   Remove → FRONT				Remove → FRONT or REAR					  Queue
 * 																			|
 *  Deque => Double Ended Queue				 FRONT  <------->  REAR		  Deque	
 *  It is a queue where you can add and remove elements from BOTH ends. 		└───── ArrayDeque	
 *  Represents a linear collection that allows insertion, removal, and retrieval of elements from both ends.
 *  Flexible Data Structure: Can be used as a stack (LIFO) or a queue (FIFO).
 *  Resizable Implementations: Implementations like ArrayDeque grow dynamically as needed.
 *  Thread Safety: Most implementations are not thread-safe; synchronization is required for concurrent use.
 *  
 */

	Deque<Integer> de = new ArrayDeque<>();
	de.add(23);
	de.offer(43);
	de.offer(90);
	de.add(23);
	de.add(12);
	de.offer(56);
	de.add(90);
	de.offer(56);
	
	System.out.println(de); // [23, 43, 90, 23, 12, 56, 90, 56]
	System.out.println(de.remove());   // 23
	System.out.println(de.poll());    // 43
	System.out.println(de.pop());     // 90
	
	de.offerFirst(75);
	de.offerLast(1);
	System.out.println(de); // [75, 23, 12, 56, 90, 56, 1]
	
	System.out.println(de.peekFirst()); // 75
	System.out.println(de.peekLast());  // 1
	
	
	de.pollFirst();  // FIFO  queue
	de.pollLast();   // LIFO  stack
	System.out.println(de); // [23, 12, 56, 90, 56]
		
	de.push(900);   // stack
	System.out.println(de);  // [900, 23, 12, 56, 90, 56]
	
	System.out.println(de.pop());  // stack
	System.out.println(de);
	
	}

}
