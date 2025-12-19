package collections;

import java.util.TreeSet;

public class M_Comparable_natural {

	public static void main(String[] args) {

/* 
 * ⏺️ Elements are sorted using:
			Comparable (natural ordering)- ascending and descending order, or
			Comparator (custom ordering)
   ⏺️ Elements are placed based on compareTo() / compare(), NOT hashCode()
    
   ⏺️  In this file we discuss Comparable in Tree Set.
 * Comparable => it have only compareTo() method.
 * Return Values Meaning  => 
  				Negative value  → current object < given object		 10.compareTo(20) → -1	
				Zero            → current object == given object		 20.compareTo(20) → 0		
				Positive value  → current object > given object		 30.compareTo(20) → +1	
 * comparable implements in same class only and it present since 1.2 version
 * That have only one method in Comparable<T> interface.(public int compareTo(T o);) but it is not functional 
   interface because functional interface added in 1.8 version.
 * Note: this class has a natural ordering that is inconsistent with equals.
 * @param   o the object to be compared.
 * @return  a negative integer, zero, or a positive integer as this object
      is less than, equal to, or greater than the specified object.
 * It is modifying the main source code for sorting.    
 */
		String st = "John";
		String st2 = "Johnny";
		System.out.println("Compare: " + st2.compareTo(st));
		System.out.println("IgnoreCase: " + st2.compareToIgnoreCase(st));
		
		
		Sort_objects one1 = new Sort_objects(12,"Teleporter");
		Sort_objects two2 = new Sort_objects(43,"Flask");
		Sort_objects three3 = new Sort_objects(2,"Vispa");
		Sort_objects four4 = new Sort_objects(8,"Pen");
		Sort_objects five5 = new Sort_objects(26,"Bat");
		
		TreeSet<Sort_objects> set1 = new TreeSet<>();
		set1.add(three3);  // 2
		set1.add(one1);    // 12
		set1.add(four4);   // 8
		set1.add(two2);    // 43
		set1.add(five5);   // 26
		System.out.println("Sorting with id: " + set1);
	
		System.out.println("********************************************");
		
		Sort_String I =  new Sort_String(234,"James");
		Sort_String II =  new Sort_String(765,"Leonardo");
		Sort_String III =  new Sort_String(213,"Jack");
		Sort_String IV =  new Sort_String(987,"Chris");
		
		TreeSet<Sort_String> set2 = new TreeSet<>();
		set2.add(IV);
		set2.add(III);
		set2.add(II);
		set2.add(I);
		
		System.out.println("Sorting with Name: " + set2);
	}

}

class Sort_objects implements Comparable<Sort_objects>
{
	int id;
	String name;
	
	Sort_objects(int i, String s){
		this.id = i;
		this.name = s;
	}
	
	public String toString() {
		return this.id + " : " + this.name;
	}

	@Override
	public int compareTo(Sort_objects o) {
	
		return Integer.compare(this.id, o.id);
	}
}

class Sort_String implements Comparable<Sort_String>
{
	int emp_id;
	String name;
	
	Sort_String(int f,String l){
		this.emp_id = f;
		this.name = l;
	}
	
	public String toString() {
		return this.emp_id + " = " + this.name;
	}

	@Override
	public int compareTo(Sort_String o) {
	
		return this.name.compareTo(o.name);
	}
	
	
}
