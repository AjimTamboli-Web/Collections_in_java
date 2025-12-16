package collections;

import java.util.*;

public class K_HashSet {

	public static void main(String[] args) {
		
/*
 * HashSet in Java implements the Set interface of the Collections Framework. 
    It is used to store the unique elements, and it doesn't maintain any specific order of elements.
 *  Capacity is the number of buckets in HashSet, while load factor decides when HashSet should resize based on how full it gets.
 *  Capacity = 16, Load Factor = 0.75 =>>  Threshold = 16 × 0.75 = 12 ➡️ When you add the 13th element, 
   													HashSet resizes   ➡️ New capacity becomes 32
   Threshold is the limit calculated using capacity and load factor;when the number of elements exceeds this limit,the HashSet resizes
 *  🧩 Why Threshold Exists?    Prevents too many collisions    Maintains O(1) average time complexity
                                Balances memory vs performance												
 *  Default capacity is 16  and load factor is 0.75 there is no guarantee of insertion order.
 * 	HashSet does not allow duplicate elements.
 *  Uses HashMap internally which is an implementation of hash table data structure.
 *  Also implements Serializable and Cloneable interfaces.
 *  HashSet is not thread-safe. To make it thread-safe, synchronization is needed externally.
   
 *  💡 Why HashSet is Fast?  =>> Because it uses a HashMap internally, which is based on a hash table.
 *  ⭐ Why HashSet Ignored Duplicates?  =>> Because it checks:
															✔️ hashCode()
															✔️ equals()
		If both match → duplicate → reject.  That’s why custom objects require overriding both methods.
 * 
 * ⭐ When to use HashSet?  =>> Use HashSet when:   ✔️  Fast search needed    ✔️  No duplicates allowed
												  ✔️  Order doesn’t matter   ✔️  Want unique list	
 * It inherits the AbstractSet class and implements Set interface.
 * 													
 */
		
		Hashing ha = new Hashing(1,"Home",234.54);
		Hashing ha1 = new Hashing(2,"Office",234.56);
		Hashing ha2 = new Hashing(1,"Home",234.54);  // duplicate ❌
		Hashing ha3 = new Hashing(3,"Home",234.54);
		Hashing ha4 = new Hashing(4,"House",234.54);
		Hashing ha5 = new Hashing(5,"Home",234.54);
		Hashing ha6 = new Hashing(6,"Flat",234.54);
		Hashing ha7 = new Hashing(7,"Home",234.54);
		Hashing ha8 = new Hashing(8,"Home",234.54);
		Hashing ha9 = new Hashing(9,"Banglow",234.54);
		Hashing ha10 = new Hashing(5,"Home",23.54);
		Hashing ha11 = new Hashing(4,"Villa",234.54);
		Hashing ha12 = new Hashing(3,"Home",734.54);
		Hashing ha13 = new Hashing(8,"Office",734.54);
	
		// instantiate an object of HashSet
		HashSet<Hashing> hashh = new HashSet<Hashing>();  // capacity is 16 and load factor 0.75
		                                                  // Threshold = 16 × 0.75 = 12 
		// adding elements
		hashh.add(ha);
		hashh.add(ha1);
		hashh.add(ha2);
		hashh.add(ha3); hashh.add(ha4); hashh.add(ha5); hashh.add(ha6); hashh.add(ha7); hashh.add(ha8);
		hashh.add(ha9); hashh.add(ha10); hashh.add(ha11); hashh.add(ha12);
		// adding 13 elements in hashset ,   ➡️ Adding the 13th element triggers rehashing
		hashh.add(ha13); // at this moment capacity resizing(increment)  ➡️ Capacity becomes 32
		                 //  ➡️ New threshold = 32 × 0.75 = 24
		
/*
 * Capacity and threshold of HashSet cannot be accessed directly because they are private internal details of 
    HashMap. We can only calculate threshold using capacity and load factor, or view them using reflection or 
    debugging.
 * Capacity, threshold, and load factor are internal to HashSet and not exposed via public APIs; load factor is
     known from the constructor, while capacity and threshold must be inferred or calculated. 
*/
		System.out.println(hashh);
		
		System.out.println(ha.equals(ha2));
		
		// Using iterator() method to iterate Over the HashSet
		System.out.println("Using Iterator(): ");
		Iterator<Hashing> iterator = hashh.iterator();
		
		// Traversing HashSet
		while(iterator.hasNext()) {
			System.out.println(iterator.next() + ", ");
		}
		
        // Using enhanced for loop to iterate Over the HashSet
        System.out.print("Using enhanced for loop : ");
        for (Hashing enhanc : hashh)
            System.out.print( enhanc + ", \n");
		
  System.out.println("************************************************");
   
		HashSet<Integer> haha = new HashSet<>();
		haha.add(12);
		haha.add(54);
		haha.add(3);
		haha.add(2);
		System.out.println(haha);
		System.out.println(haha.remove(12));
		System.out.println(haha);
		// internally it sum of integers(Only primitive) to generate HashCode
		System.out.println(haha.hashCode()); 
//		System.out.println(Integer.hashCode(9));
		
		//  HashSet(int initialCapacity, float loadFactor)
		HashSet<String> hash = new HashSet<>(32,0.8f);  // capacity: 32 Load Factor: 0.8
		                                                // Threshold = 32 × 0.8 = 25 
		hash.add("Custom");
		hash.add("Capacity");
		hash.add("Load");
		hash.add("Factor");
		System.out.println(hash);
		
	}

}

class Hashing{
	
	int id;
	String name;
	double price;
	
	Hashing(int id, String name, double price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return this.id +  " " +this.name + " " +this.price;
	}
	
	public boolean equals(Object obj) {
		Hashing hs = (Hashing)obj;
		return this.id == hs.id && this.name == hs.name && this.price == hs.price; 
	}
	
	public int hashCode() {
		return this.id+(int)this.price;
	}
	
}