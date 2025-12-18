package collections;


import java.util.*;
public class M_TreeSet {

	public static void main(String[] args) {
		
/*
 * TreeSet is a Sorted Set implementation that stores unique elements in sorted order.Elements are stored in ascending order by default
 * It is part of java.util package that implements the SortedSet interface, and internally uses a Red-Black tree to maintain sorting.
 * Does not allow duplicates and null values.❌ Only one null allowed (Java 7−) / ❌ Not allowed (Java 8+)
 * Null not allowed, Why? => Because TreeSet needs to compare elements, and null cannot be compared.
   
 * ❌ No Thread-safe ,   Access Time =>  O(log n) slowest						  ↗️	➡️  Collection					
 * ⭕ TreeSet uses a Red-Black Tree data structure.			     implements ↗️		  ↑			
 * ⭕ Elements are sorted using:											  ↗️    		 Set 					
     ⚠️ Comparable (natural ordering),Or	                                 ↑      	      ↑────── extends		
 	 ⚠️ Comparator (custom ordering)		   						AbstractCollection SortedSet 					 
	 													   extends ──────↑		      ↑────── extends							
 * 🧠 How TreeSet Decides Duplicates:                                AbstractSet   NavigableSet
      compareTo() == 0   OR   compare() == 0								 ↑            ↑────── implements
      If comparison returns 0, element is treated as duplicate.	 extends  --------- TreeSet
      
 * ⭕ Elements are placed based on compareTo() / compare(), NOT hashCode()    
 * Implements the NavigableSet interface and provides navigation methods like higher(), lower(), ceiling() and floor().
 * The TreeSet can only allow those generic types that are comparable. For example, 
                    the Comparable interface is being implemented by the StringBuffer class.
 * Note: ⏺️ A class must implement Comparable (or provide a Comparator) to be stored in a TreeSet.    
         ⏺️ Built-in classes like String, wrapper classes, etc., already implement Comparable. 
         Comparable is a functional interface which is have compareTo method.  
    since 1.2 ⬆️   and     1.8 ⬆️   that's why comparable doesn't mark functional interface but it actually functional interface.
 */
		
		List<Integer> list = new ArrayList<>();
		
		// add all elements same time using addAll method
		Collections.addAll(list, 23,54,76,98,76,34,12,5,98);
		System.out.println("List: " + list);
		
		
  Set<Integer> set = new HashSet<>(list);  // because set is interface can't implement directly
    System.out.println("Set: " + set + " --> Set Doesn't allowed duplicates elements.");
			
      HashSet<Integer> has = new HashSet<>(list);
        System.out.println("Hash Set: " + has + "--> Doesn't maintain any specific order of elements. ");
        
      LinkedHashSet<Integer> linke = new LinkedHashSet<>(list);
        System.out.println("LinkedHashSet: " + linke + "--> Maintain the Insetion order. ");
    
    
	SortedSet<Integer> sor = new TreeSet<>(list);
	  System.out.println("Sorted Set: " + sor + "-->  Sorted Order. ⬇️⬇️⬇️⬇️⬇️");
		
	  NavigableSet<Integer> nav = new TreeSet<>(list);
		System.out.println("Navigable Set: " + nav);
	
		TreeSet<Integer> tre = new TreeSet<>(list);
		  System.out.println("Tree Set: " + tre);
		  
		  
		  
		  
		TreeSet<String> tree = new TreeSet<>();
		
		tree.add("H");
		tree.add("I");
		tree.add("A");
		tree.add("P");
		tree.add("Q");
		tree.add("H");
		tree.add("4");
		
// because String already implemented copareTo method for custom class you need to override the compareTo method
		// and for overriding you need to implement Comparable<T> interface to your class
		System.out.println(tree);  // [4, A, H, I, P, Q]
		  
	
	// ⚠️ Why we need Comparable interface	
		  SortNon_Primitive one1 = new SortNon_Primitive(1,"Neo");
		  SortNon_Primitive two2 = new SortNon_Primitive(1,"Natasha");
		  SortNon_Primitive three3 = new SortNon_Primitive(2,"Sonia");
		  
		  TreeSet<SortNon_Primitive> sets = new TreeSet<>();
		  sets.add(one1);
		  sets.add(two2);
		  sets.add(three3);
		  System.out.println(sets); // ❌ it give you error => java.lang.ClassCastException
//	       because it does not know which field should be compare to get lists.
		  // >>> for solution look M_Comparable_natural.java file
	}

}

class SortNon_Primitive{  // not implemented Comparable interface 
	int id;
	String name;
	
	SortNon_Primitive(int i,String n){
		this.id = i;
		this.name = n;
	}
}




