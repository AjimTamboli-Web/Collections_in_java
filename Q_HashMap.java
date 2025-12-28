package collections;
import java.util.*;
public class Q_HashMap {

	public static void main(String[] args) {
	
/*
 * HashMap is a class in java.util that stores data as key–value pairs.		Key -> Value
 * It stores elements in key-value pairs, where, Keys are unique. and Values can be duplicated.
 * It takes two parameters, namely as follows:
	K -> Type of keys maintained by this map		 V -> Type of mapped values
 * Internally uses Hashing, hence allows efficient key-based retrieval,insertion,and removal with an average of O(1) time.	
 * Insertion order is not preserved in HashMap.									Map(interface)
 * ✔ Keys unique		✔ Values can be duplicate                                    │		└----⌉ implements
 * ✔ Allows one null key	✔ Allows multiple null values                (implements)│		AbstractMap
 * ✔ Not thread-safe	✔ Order NOT guaranteed                                       │		   ¦
 * 🧩 Internal Data Structure (Java 8+) =>> Array + LinkedList + Red-Black Tree	 HashMap ------- extends
 * 
 * Default capacity	16	 Load factor 0.75	Threshold capacity × load factor  16 × 0.75 = 12 → Resize when elements > 12
 * 	
 * 
 */

		HashMap<Integer,String> hm = new HashMap<>(); // initial capacity 16 and load factor is 0.75
		hm.put(4, "Elia");
		hm.put(9, "Romeo");
		hm.put(2, "Rose");  // insertion order not maintain.
		hm.put(7, "Owen");
		hm.put(null, "Owen"); // only one null key accepted & multiple duplicate value accepted
		hm.put(null, "Alan");
		hm.put(2, "Jack");   // when key is same value is different value will be override with first one
		hm.put(1, "Jerry");
		
		hm.putIfAbsent(5, "Xavier");
		
		
		for(Map.Entry<Integer,String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}
		
		System.out.println(hm);
		System.out.println("******************************");

		//**********************************************************************
		
		HashMap<Integer,Maker23> orders = new HashMap<>();

		Maker23 mk = new Maker23(4,"Sandwich",'S');
		Maker23 mk1 = new Maker23(8,"Pizza",'P');
		Maker23 mk2 = new Maker23(2,"Burger",'B');
		Maker23 mk3 = new Maker23(4,"LargeSandwich",'L');
		Maker23 mk4 = new Maker23(6,"Pasta",'P');
		
		orders.put(1,mk);
		orders.put(2,mk1);
		orders.put(3,mk2);
		orders.put(4,mk3);
		orders.put(5,mk4);
		orders.put(6,mk4);
		
		// Traversing map
		for(Map.Entry<Integer,Maker23> ma : orders.entrySet()) {
			Maker23 ker = ma.getValue();
			System.out.println("Details:" + ma.getKey());
			System.out.println(ker.id + " " + ker.name + " " + ker.ch);
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
		}
	
		
	
	}

}

class Maker23{
	int id;
	String name;
	char ch;
	
	Maker23(int id,String name,char ch){
		this.id = id;
		this.name = name;
		this.ch = ch;
	}
	
//	public String toString() {
//		return this.id + " " + this.name + " " + this.ch;
//	}
//	
//	public int hashCode() {
//		return this.id;
//	}
//	
//	public boolean equals(Object ob) {
//		Maker23 mak = (Maker23) ob;
//		return this.id == mak.id && this.name.equals(mak.name)
//				  && this.ch == mak.ch;
//	}
	
}
