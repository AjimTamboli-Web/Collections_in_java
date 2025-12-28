package collections;

import java.util.Comparator;
import java.util.TreeMap;

public class Q_TreeMap {

	public static void main(String[] args) {
/*
 * TreeMap is a Map implementation that: stores key-value pairs in a sorted order using a natural or custom comparator.
 *  TreeMap internally uses a Red-Black tree for efficient sorting. Provides O(log n) time for insertion and deletion.
 * ✔️ Does not allow null keys , but allows null values.							Map
 * ✔ Slower than HashMap / LinkedHashMap                                          |         
 *                                                                            SequencedMap (java 21)                 
 * 🔹 Internal Working (Very Important 🔥) TreeMap uses Red-Black Tree:            |               
	 Each node:    key | value | left | right | parent | color                 SortedMap                       
 * Properties of Red-Black Tree:	  ⭕ Every node is red or black                    |                  
	⭕ Root is black                                                           NavigableMap                      
    ⭕ Red node cannot have red child                                               ¦     implements
	⭕ Every path has same black-height                                          TreeMap                    
	➡ Ensures tree height = O(log n)                                                                  
  *  1️⃣ Natural Ordering (Comparable) Integer → ascending ,  String → lexicographical       
  *  2️⃣ Custom Ordering (Comparator) 
 *  ⭕ Null key  	❌ not allowed   ⭕ Null value   ✔ allowed
 * 📌 Reason: comparison with null not possible
 *       
 */
		// Natural sorting using key
		TreeMap<Integer,String> tm = new TreeMap<>();
		
		tm.put(2, "Reasons");
		tm.put(4, "of");
		tm.put(5, "why");
		tm.put(7, "??");
		tm.put(1, "13");
	
		System.out.println(tm);
		
		// Custom sorting using key with custom class SortF1 
		TreeMap<Character,FormulaOne> teams = new TreeMap<>(new SortF1()); // Comparator overrides natural order
		
		FormulaOne one = new FormulaOne("Red Bull","Max,Liam","RB21");
		FormulaOne two = new FormulaOne("McLaren","Lamdo,Oscar","MCL38");
		FormulaOne three = new FormulaOne("Ferrari","Lewis,Charles","SF24");
		FormulaOne four = new FormulaOne("Mercedes","George,Andrea","W12");
		FormulaOne five = new FormulaOne("Aston Martin","Fernando,Lance","AMR23");
		
		teams.put('R', one);
		teams.put('M', two);
		teams.put('F', three);
		teams.put('W', four);
		teams.put('A', five);
		
		for(var map:teams.entrySet()) {
		   System.out.println(map.getKey() + " {" + map.getValue() + "}");
		}
		
		System.out.println("Lowest Key: " + teams.firstKey());
		System.out.println("Highest Key: " + teams.lastKey());
		
		System.out.println(teams.descendingMap());
		
	}

}

class FormulaOne{
	String car;
	String driver;
	String model;
	
	FormulaOne(String car,String driver,String model){
		this.car = car;
		this.driver = driver;
		this.model = model;
	}
	
	public String toString() {
		return this.car + ": " + this.driver + ": " + this.model;
	}
}


class SortF1 implements Comparator<Character>{

	@Override
	public int compare(Character o1, Character o2) {
		
		return o2.compareTo(o1);
	}

	
	
}

