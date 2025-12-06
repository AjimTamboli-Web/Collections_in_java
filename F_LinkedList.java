package collections;

import java.util.LinkedList;
import java.util.List;

public class F_LinkedList {

	public static void main(String[] args) {
		
/*
 * ⏺️ LinkedList => It implements a doubly-linked list data structure where elements are not stored in contiguous memory.
 *                  LinkedList is a linear data structure that stores elements in nodes.  
 *  ⭕ each node contains: ✔️ 1️ Data  ✔️ 2️ Address of next node → next   ✔️ 3️ Address of previous node → prev (in doubly linked list)
 * ⭕ Dynamic Size: LinkedList grows or shrinks dynamically at runtime.
 * ⭕ Maintains Insertion Order: Elements are stored in the order they are added.
 * ⭕ Allows Duplicates: Duplicate elements are allowed.
 * ⭕ Not Synchronized: By default, LinkedList is not thread-safe. To make Thread-safe use of Collections.synchronizedList().
 * ⭕ Efficient Insertion/Deletion: Adding or removing elements at the beginning or middle is faster compared to ArrayList.
 * 		+---------+---------+---------+
        |  prev   |  data   |  next   |        Ex:  null ← [10] ⇔ [20] ⇔ [30] → null
        +---------+---------+---------+
 */
		List<Integer> list = new LinkedList<Integer>();
		
		list.add(34);   list.add(45);   list.add(12);    list.add(76);   list.add(65);   list.add(34);    list.add(90);
		
		System.out.println(list);
		
		List<String> l = new LinkedList<String>();
		
		l.add("One"); l.add("Six"); l.add("Nine");  l.add("Two");  l.add("Eight");  l.add("Ten");  l.add("Two");  l.add("One");
		
		System.out.println("Original: " + l);
		l.add(2,"Three");
		System.out.println("Updated: " + l);
		
		l.remove("Two");
		System.out.println("Deleted: " + l);
		
		for(int i=0;i<l.size();i++) {        // Using the Get method and the for loop
		 System.out.print(l.get(i) + " ");
		}
		
		
		
	}

}
