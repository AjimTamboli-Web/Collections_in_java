package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class E_A_List_Iterator {

	public static void main(String[] args) {

/*
 * It work on only list interface that mean it only eligible for ArrayList,LinkedList,Vector,Stack classes to implements.
 * An iterator for lists that allows the programmer to traverse the list in both direction, modify the list during iteration.		
 * ListIterator is a type of Java cursor used to traverse all types of lists, such as ArrayList,LinkedList, Vector and Stack.
 *  It was introduced in Java 1.2 and extends the Iterator interface.			Iterable
 *  It supports bi-directional traversal (forward & backward).					↪ 	 Collection				⌈ > Iterator
 *  Supports Create, Read, Update, Delete (CRUD) operations.									↪  	List			¦ (extends)
 *  																								  ↪  ListIterator 
 * There is no current element in ListIterator. Its cursor always lies between the previous and next elements.
 *  a list of length n, there are n+1 possible cursors. 
 * It has Forward and backward direction iteration methods=>
 *      hasNext(),next(),nextIndex(), hasPrevious(), previous(), previousIndex() 
 */
		
		List<Integer> li = new LinkedList<>();
		
			li.add(23);
			li.add(76);
			li.add(23);
			li.add(98);
			li.add(52);
			li.add(38);
			li.add(3);
			li.add(13);
			
			
			System.out.println(li);
			
		ListIterator<Integer> Ite = li.listIterator(); // here you can also pass the index no in parameter
			
			System.out.println("Forward Direction Iteration >>>>>");
			while(Ite.hasNext()) {
				System.out.println(Ite.next());
			}
		System.out.println("**********************************");
	
		// remember to use previous or hasPrevious you need to forward at least one cursor 
		System.out.println("Backward Direction Iteration <<<<<<");
		while(Ite.hasPrevious()) {
			System.out.println(Ite.previous());
		}
	
		System.out.println("**********************************");

//***************************************************************************************************
		
		List<String> li2 = new ArrayList<>();
		
		li2.add("Jack");
		li2.add("John");
		li2.add("William");
		li2.add("Percy");
		li2.add("Nancy");
		li2.add("El");
		li2.add("Roman");
		li2.add("Erika");
		li2.add("xavier");
		
		System.out.println(li2);
		
//		ListIterator<String> iter = li2.listIterator(5); // no of index will jump the cursor at that position
//		An initial call to previous would return the element with the specified index minus one.
		
		ListIterator<String> iter = li2.listIterator();
		iter.next(); // move to cursor next position 1
		iter.next(); // move again cursor 2 position
		
		while(iter.hasPrevious()) {  // need to move cursor at least one position
			System.out.println(iter.previous());
//			if(iter.previous().equals("El")) {
//				iter.remove();  only one previous method run
//			}
		}
		
		System.out.println(li2);
			
	}

}
