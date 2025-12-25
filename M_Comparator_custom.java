package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class M_Comparator_custom {

	public static void main(String[] args) {

/*
 * Comparator is a functional interface used to define custom sorting logic for objects.also called custom order
 * it also have some default and static methods also present.		
 * ⚠️ Why Comparator is Needed?   Use Comparator when:
   ==>> ✔ You cannot modify the class  ✔ You want multiple sorting logics  ✔ Sorting logic should be external
   ✔ You want custom order(desc, multi-field, etc.).✔️We want to keep sorting logic separate from the class definition.
 * ⏺️ It will return a negative integer if obj1 < obj2. ⏺️ It will return 0 if both objects are equal.
   ⏺️ It will return a positive integer if obj1 > obj2.
   
 * The Collections.sort() method arranges the elements of a List based on the rules defined by a Comparator.
 * It annotated by @functionalInterface because it will added some extra methods default, static later on
      (backward compability 1.8)  to avoid confusion they give a annotation functionalInterface  it still have 
      only one abstract method.  
 * and functionalInterface came in 1.8 version later on comparator(1.2)   that's the reason comparable does't
    have annotated functionalInterface but called as functional interface   
         
 */
		
		Emp_data em1 = new Emp_data(12,"Nicoles",234.45,"IT");
		Emp_data em2 = new Emp_data(34,"Bruse",543.12,"HR");
		Emp_data em3 = new Emp_data(13,"Natasha",432.23,"Finance");
		Emp_data em4 = new Emp_data(89,"Tony",907.43,"Marketing");
		Emp_data em5 = new Emp_data(54,"Jackob",43.24,"IT");
		Emp_data em6 = new Emp_data(13,"Tony",234.45,"HR");   // duplicate in all fields 
		
		TreeSet<Emp_data> dat1 = new TreeSet<>(new Sort_name());
		dat1.add(em5);
		dat1.add(em4);
		dat1.add(em3);
		dat1.add(em2);
		dat1.add(em1);
		dat1.add(em6);
		
		
		Iterator<Emp_data> it = dat1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());			
		}
		
	
	}

}

// when you have custom class without comparable implemented ⬇️⬇️ then you need comparator for sorting

class Emp_data // implements Comparable<Emp_data> // when you don't use
{
	int id;
	String name;
	double salary;
	String dept;
	
	Emp_data(int i,String n,double sal,String de){
		this.id = i;
		this.name = n;
		this.salary = sal;
		this.dept = de;
	}
	
	public String toString() {
		return this.id + " : " + this.name + " : " + this.salary + " : " + this.dept;
	}

//	@Override
//	public int compareTo(Emp_data o) {
//		
//		return Integer.compare(this.id,o.id);
//		
//	}
	
}
//********************************************************************************************
class Sort_name implements Comparator<Emp_data>{

	Sort_name(){
		System.out.println("Sorting done by Naming:: ");
	}
	
	@Override
	public int compare(Emp_data o1, Emp_data o2) {
		return o1.name.compareTo(o2.name);
	}
}
//********************************************************************************************
class Sort_dept implements Comparator<Emp_data>{
     
	Sort_dept(){
		System.out.println("Sorting done by Department:: ");
	}
	
	@Override
	public int compare(Emp_data o1, Emp_data o2) {
		
		return o1.dept.compareTo(o2.dept);
	}
}
//********************************************************************************************
class Sort_sal implements Comparator<Emp_data>{

	Sort_sal(){
		System.out.println("Sorting done by Salary:: ");
	}
	
	@Override
	public int compare(Emp_data o1, Emp_data o2) {
		return Double.compare(o1.salary, o2.salary);
	}
	
	
}






