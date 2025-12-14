package collections;

import java.util.*;

public class K_HashSet {

	public static void main(String[] args) {
		
/*
 *  Default capacity is 16
 *  and load factor is 0.75
 *  there is no guarantee of insertion order
 * 	
 */
		
		Hashing ha = new Hashing(1,"Home",234.54);
		Hashing ha1 = new Hashing(2,"Work",234.56);
		Hashing ha2 = new Hashing(1,"Home",234.54);
	
		HashSet<Hashing> hashh = new HashSet<Hashing>();
		
		hashh.add(ha);
		hashh.add(ha1);
		hashh.add(ha2);
		System.out.println(hashh);
		
		System.out.println(ha.equals(ha2));
		
        System.out.println("************************************************");
   
		HashSet<Integer> haha = new HashSet<>();
		haha.add(12);
		System.out.println(haha.hashCode());
		System.out.println(Integer.hashCode(23));
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