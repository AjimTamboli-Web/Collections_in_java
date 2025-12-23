package collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class N_PriorityQueue {

	public static void main(String[] args) {

/*
 *  Initial capacity is 11
 * PriorityQueue =>> A PriorityQueue in Java is a queue where elements are ordered based on their priority,
                      rather than the order of insertion	.
                  >> PriorityQueue is a Queue where elements are removed based on priority, not FIFO.  
        >> Insertion does't matter who gets delete first that is matter.
 * By default,it uses natural ordering (min-heap),but a custom comparator can be used to define different priorities.
 *  ❌ Not thread-safe  ❌ No index access  ❌ Not FIFO   ❌ Iteration order unpredictable    
 ❔ How PriorityQueue grows internally?
    =>> newCapacity = oldCapacity + (oldCapacity >> 1)  ≈ 1.5x growth   ✔ Similar to ArrayList
      Ex. newCapacity = 11 + (11 / 2) = 16							✔ NOT based on load factor
 *            	
 */

		Queue<Integer> pq = new PriorityQueue<>();  // natural sorting (ascending)
		
//		PriorityQueue<Integer> pq = new PriorityQueue<>(5);  //we can set initial Capacity
		
//		PriorityQueue<Integer> pq = new PriorityQueue<>(new Custom_Int());  // custom sorting (descending)

		pq.offer(9);
		pq.add(4);        // insertion order does't matter
		pq.offer(7);     // showing random numbers
		pq.add(2);
		pq.offer(10);   // but deletion done by order
		pq.add(1);
		pq.offer(8);
		pq.add(4);   // ✔️ duplicate allowed
//		pq.add(null);  // ❌ does not allowed null value
		
// 		 ⬆️⬆️⬆️  smallest add always last		
		
		System.out.println(pq); // ❗ Printing PriorityQueue does NOT show sorted order
		// This shows heap structure, not sorted list. ✔ Only poll() gives correct priority order
		
		System.out.println(pq.remove());  // ✔ Smallest element always comes first
		System.out.println(pq.poll()); // deletion has a sequence lowest value first delete
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
		System.out.println(pq);
		
	}

}

// Making Custom comparator because PriorityQueue by default delete lowest first (ascending order) to make
//   delete largest first (descending order) make your own custom comparator using override compare method. 
class Custom_Int implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {

		return Integer.compare(o2.intValue(), o1.intValue());
	}
	
}
