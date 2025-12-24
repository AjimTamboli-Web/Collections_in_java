package collections;

import java.util.ArrayDeque;
import java.util.Iterator;


public class O_E_ArrayDeque {

	public static void main(String[] args) {
		
/*
 ❓❔ What is ArrayDeque?                                           Collection
  =>> ArrayDeque is a Resizable, array-based implementation of Deque.		|
 * 👉 It allows: ⭕ Add / remove from FRONT, ⭕  Add / remove from REAR	└── Queue
 * Allowing elements to be added or removed from both ends efficiently.		 |
 * ArrayDeque grows dynamically. ArrayDeque is not Thread-Safe				 └── Deque
 *  initial capacity to hold 16 elements.										   |
 * ArrayDeque has no capacity restrictions.           							   └── ArrayDeque
        																		 
 * Operations like addFirst(), addLast(), removeFirst(), removeLast() are all done in constant time O(1).
 */								
		
		ArrayDeque<Integer> aq = new ArrayDeque<Integer>(); // initial capacity is 16
		   // add() method to insert
		 aq.add(1);
		 aq.add(2);       // insertion order is as added maintain
		 aq.addFirst(3);
		 aq.addLast(4);
		   // offer() method to insert 
		 aq.offer(5);
		 aq.push(6);
		 aq.offer(6);  // ✔️ duplicate allowed
		 aq.offerFirst(7);
		 aq.offerLast(8);
//		 aq.offer(null);    ❌ Null pointer Exception
		
		 System.out.println(aq); // [7, 3, 1, 2, 4, 5, 6, 6, 8]
	
		 // retrieves only not deleted elements
		 int first = aq.getFirst();
		 int last = aq.getLast();
		 
		 int end = aq.peek();
		 int head = aq.peekFirst();
		 int tail = aq.peekLast();
		
	   System.out.println("Retrive only using getFirst(), getLast() method: \n" + first + "\n" + last + "\n" +
				  "Retrive using peek(),peekFirst(),peekLast() method: \n" + end + "\n" + head + "\n" + tail);
		
	   // Remove elements using various methods
	   
	   System.out.println("Before deleting: " + aq);
	   
	   int re = aq.remove();
	   int reFirst = aq.removeFirst();
	   int reLast = aq.removeLast();
	   
	   int pol = aq.poll();
	   int pollHead = aq.pollFirst();
	   int pollTail = aq.pollLast();
	   
	   int popStack = aq.pop();  // remove front
	   
	   System.out.println("Remove using remove(), removeFirst(), removeLast() methods: \n" + re + "\n" + reFirst
			   + "\n" + reLast + "\n" + "remove using poll(),pollFirst(),pollLast() methods: \n" + pol + "\n"
			   + pollHead + "\n" + pollTail + "\n" + "Using pop behave like stack: \n" + popStack);
	   
	   System.out.println("After deleting: " + aq);
	   
// ******************************************************************
	   System.out.println("*******************************************************");
	   
	   ArrayDeque<String> arr = new ArrayDeque<>(25); // capacity is 25
	   arr.offer("Tom");
	   arr.offer("Steve");
	   arr.offer("Tony");
	   arr.offer("Natasha");
	   arr.offer("Bruce");
	   arr.offer("John");
	   arr.offerFirst("Jack");
	   arr.offer("Wonda");
	   arr.offer("Jane");
	   arr.offer("Nancy");
	   
	   System.out.println(arr);
	   System.out.println(arr.size());
	  
	   // Iterate using Iterator interface from the front of the queue

	   System.out.println("Iterating in ForwardOrder: ");
	   for(Iterator<String> i = arr.iterator(); i.hasNext();) {
		   System.out.println(i.next() + " ");
	   }
	   
	   
	}

}
