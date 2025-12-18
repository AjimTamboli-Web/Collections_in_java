package collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class M_Comparator_custom {

	public static void main(String[] args) {
	
		Emp_data em1 = new Emp_data(12,"Nicoles",234.45,"IT");
		Emp_data em2 = new Emp_data(34,"Bruse",543.12,"HR");
		Emp_data em3 = new Emp_data(13,"Natasha",432.23,"Finance");
		Emp_data em4 = new Emp_data(89,"Tony",907.43,"Marketing");
		Emp_data em5 = new Emp_data(54,"Jackob",43.24,"IT");
		Emp_data em6 = new Emp_data(13,"Tony",234.45,"HR");
		
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

class Emp_data implements Comparable<Emp_data>
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

	@Override
	public int compareTo(Emp_data o) {
		
		return Integer.compare(this.id,o.id);
		
	}
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






