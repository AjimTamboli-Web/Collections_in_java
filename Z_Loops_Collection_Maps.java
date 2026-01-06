package collections;

public class Z_Loops_Collection_Maps {

	public static void main(String[] args) {

/*
 *     Iterator					                            ListIterator

It can traverse a collection of any type. 	        It traverses only list collection implemented classes like LinkedList, ArrayList, etc.
Traversal can only be done in forwarding direction.	Traversal of elements can be done in both forward and backward direction.
Iterator object can be created by calling iterator() ListIterator object can be created by calling listIterator() method of the 
method of the collection interface.							collection interface.
Deletion of elements is allowed using remove() method.	Deletion of elements is allowed.
It throws ConcurrentModificationException on 				Addition of elements is allowed.
doing addition operation. Hence, addition is not allowed. 	
In iterator, we can't access the index of	         In listIterator, we have nextIndex() and previousIndex() methods for accessing the 
 the traversed element.			 					  indexes of the traversed or the next traversing element.
Modification of any element is not allowed.	         Modification is allowed.		
 */

	}

}
