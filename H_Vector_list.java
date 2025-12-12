package collections;

import java.util.*;

public class H_Vector_list {

	public static void main(String[] args) {
	
/*
 * Vector is a legacy class in Java (introduced in JDK 1.0).  It is similar to ArrayList but:
	 ✔ Thread-safe (synchronized)   ✔ Slower than ArrayList    ✔ Grows automatically (dynamic array)
        Vector is part of java.util package.		
   ✔ 1. Dynamic Array  Size grows automatically.  Default capacity = 10
         When full, its capacity doubles (capacity × 2).
   ✔ 2. Synchronized (Thread-safe)   All methods are synchronized.
         That means only one thread can access a Vector method at a time.
		 Result:  Safe for multithreading , But slower performance      
   ✔ 3. Allows duplicates + NULL + maintains insertion order , Same as ArrayList:
		 ✔ Duplicate values allowed    ✔ NULL allowed    ✔ Order is maintained   
   ✔ 4. Legacy class -> Before Java Collections Framework existed.
         Still used only when: ➡ Multithreading + dynamic array required	  
       
 *   Java Vector contains many legacy methods that are not the part of a collections framework.
 *   
 *   ✔ Load Factor => Vector also does NOT have a load factor.  ✔ Node Factor => Vector does not use nodes → uses array internally.
 *   ✔ Growth Factor (Most Important) => Vector increases capacity by 2× (double) when full.  ⭕ new capacity = old capacity * 2
 */
		
		Vector<String> v = new Vector<String>();
		
		v.add("A");
		v.add("B");
		v.add("C");
		v.add(null);
		v.add("D");
		v.add("E");
		v.add(null); // accept null value
		v.add("H");
		v.add("R");
		v.add("A");  // duplicate allowed
		
		System.out.println(v.capacity());  // default 10  newCapacity = oldCapacity * 2 
		v.add("Y"); // add 11 number
		
		System.out.println(v.capacity());  // now capacity is 20
		
		System.out.println(v);
		
		Vector<String> v2 = new Vector<String>(4);
		
		System.out.println(v2.capacity());  // capacity is 4
		
	}

}
