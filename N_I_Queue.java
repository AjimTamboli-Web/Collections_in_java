package collections;


import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class N_I_Queue {

	public static void main(String[] args) {

/* ⚠️ What is Queue?
 * Queue is a data structure that follows FIFO (First In First Out), where elements are added from rear and
  		removed from front.
 * A Queue is a linear data structure that follows the principle:  👉 FIFO – First In First Out
	The element inserted first is removed first , Example: Line at a ticket counter 🎟️
 * The Queue interface is part of the java.util package. It extends the Collection interface.
 * Elements are processed in the order determined by the queue implementation (First In First Out or FIFO for
     LinkedList, priority order for PriorityQueue).
 * Elements cannot be accessed directly by index. it does not implements random access interface.
 * A queue can store duplicate elements.
 * 
 * Common implementation of Queue interface:
 * LinkedList: A FIFO queue that allows null elements and implements both Queue and Deque interfaces.
 * ArrayDeque: A resizable array-based queue that is faster than LinkedList and does not allow nulls.
 * PriorityQueue: A queue where elements are processed according to their priority instead of insertion order.
 *     
 * 
 * 
 * why queue is overflow when add give exception no space available how?
 * 
 * 																	 Collection
    PriorityQueue	      Priority-based ordering					    |
	LinkedList              FIFO queue + Deque					        └── Queue
	ArrayDeque		       Fast, no capacity limit						    |
	ConcurrentLinkedQueue    Thread-safe								        ├── Deque
																	        |     |
		⚠️ Note: Queue does NOT allow random access	     			        |     ├── ArrayDeque
															        AbstractQueue └── LinkedList
 * ⚠️ Core Queue Operations = Insert --  Add element at rear			        |
  		    				      Remove -- Remove element from front		    └── PriorityQueue
  		    				      Peek  --  View front element

 */
	
//  We cannot instantiate a Queue directly as it is an interface. Here, we can use a PriorityQueue class 
//	 that implements this interface.
		
		Queue<Integer> que = new PriorityQueue<Integer>();
		que.offer(32);
		que.offer(67);  //Note: PriorityQueue arranges elements according to priority order(ascending by  	
		que.offer(23);  //       default), not insertion order.
		que.offer(98);
		que.offer(32);  // allow duplicate
		que.offer(92);
//		que.offer(null);  ❌ null value not acceptable  / Runtime error
		que.add(49);
		
		System.out.println("Queue: " + que);
	
		System.out.println(que.element());
		System.out.println(que.peek());
		
		System.out.println(que.poll());
		System.out.println(que.remove());
		
		System.out.println(que);
		
/*
	Difference: add vs offer	 
	⏺️	Method		If Queue is full
		add()		 ❌ Exception
		offer()		 ✅ false
		
	⏺️	Method		If Queue empty
		remove()		 ❌ Exception
		poll()	     ✅ null
		
	⏺️	Method		If Queue empty
		element()	 ❌ Exception
		peek()		 ✅ null
		
*/
	System.out.println("****************************************************");	
		// to make queue full use ArrayBlockingQueue class to see null and exceptions when queue is full
	Queue<Integer> queue = new ArrayBlockingQueue<>(3);  // capacity became 3
	
	queue.add(34);
	queue.offer(23);
	queue.add(89);  // right now queue is full
	
	System.out.println(queue);
	
	System.out.println(queue.offer(32));   // false
//	System.out.println(queue.add(43));  // give you IllegalStateException
	
	queue.remove();
	queue.remove();
	queue.poll();  // here queue is empty
	System.out.println(queue.peek());
//	System.out.println(queue.element());  // give you NoSuchElementException
	
//	queue.remove();  // it gives you NoSuchElementException
	queue.poll();  // null
	}

}
