package collections;

import java.util.*;
import java.time.LocalDateTime;

public class J_Contracts {

	public static void main(String[] args) {
		/*
		 * Contract 
		 */
		LocalDateTime date1 = LocalDateTime.of(2024, 11, 20, 11, 30);
		LocalDateTime date2 = LocalDateTime.of(2025, 12, 16, 12, 30);
		
		Custom_Class_For_Contract obj1 = new Custom_Class_For_Contract(1,"Travis",new LocalDateTime[]{date1},30000.23);
		Custom_Class_For_Contract obj2 = new Custom_Class_For_Contract(2,"Arya",new LocalDateTime[] {date2}, 45000.98);
		Custom_Class_For_Contract obj3 = new Custom_Class_For_Contract(1,"Travis",new LocalDateTime[]{date1},30000.23);
		
//  Output of all printing statements before overloading hashCode() and equals()		
		
		System.out.println(obj1);  // 1: Travis : 2024-11-20T11:30 : 30000.23
		System.out.println(obj2);  // 2: Arya : 2025-12-16T12:30 : 45000.98
		System.out.println(obj3);  // 1: Travis : 2024-11-20T11:30 : 30000.23

System.out.println("***********Before Overloading hashCode() and equals90******************");		
		
		System.out.println(obj1.hashCode());  // 772777427
		System.out.println(obj2.hashCode());  // 83954662
		System.out.println(obj3.hashCode());  // 1751075886

System.out.println("*****************************************************************");				
		
		System.out.println(obj1.equals(obj2));  // false
		System.out.println(obj1.equals(obj3));  // false
		
System.out.println("*************** Hash Set ***************************************");		
		
		HashSet<Custom_Class_For_Contract> con1 = new HashSet<>();
		con1.add(obj1);
		con1.add(obj2);
		con1.add(obj3);
		
		Iterator<Custom_Class_For_Contract> itra = con1.iterator();
		while(itra.hasNext()) {
			System.out.println(itra.next());
		}  // ==>> output  ⬇️⬇️
		// 1: Travis : 2024-11-20T11:30 : 30000.23
		// 1: Travis : 2024-11-20T11:30 : 30000.23
		// 2: Arya : 2025-12-16T12:30 : 45000.98
		
System.out.println("*********** After Overloading hashCode() and equals90******************");		
	
		System.out.println(obj1.hashCode());  // 10007
		System.out.println(obj2.hashCode());  // 10006
		System.out.println(obj3.hashCode());  // 10007
		
		System.out.println(obj1.equals(obj2));  // false
		System.out.println(obj1.equals(obj3));  // true
		
//   => output 
//		1: Travis : 2024-11-20T11:30 : 30000.23
//		2: Arya : 2025-12-16T12:30 : 45000.98
	
		System.out.println("*******Adding new element: ");
		Custom_Class_For_Contract obj4 = new Custom_Class_For_Contract(2,"Thor",new LocalDateTime[]{date1},65000.23);
	
		con1.add(obj4);
		Iterator<Custom_Class_For_Contract> updat = con1.iterator();
		while(updat.hasNext()) {
			System.out.println(updat.next());
		}
	
		System.out.println(obj4.hashCode());  // 10006
		System.out.println(obj2.hashCode());  // 10006
		// This is called hashCollision because both elements have same hashCode
		// then it checks equals method also
	}

}


class Custom_Class_For_Contract{
	int id;
	String name;
	LocalDateTime[] bookings_date;
	double price;
	
	Custom_Class_For_Contract(int i,String n,LocalDateTime[] book,double rate){
		this.id = i;
		this.name = n;
		this.bookings_date = book;
		this.price = rate;
		
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for(LocalDateTime time_day : bookings_date)
		sb.append(time_day);
		
		return this.id + ": " + this.name + " : " + sb + " : " + this.price;
	}
	
	
	public int hashCode() {
		System.out.println("hashcode Checking....");
		return 10000 + this.id + this.name.length();
	}
	
	public boolean equals(Object obj) {
		
		Custom_Class_For_Contract cont2 = (Custom_Class_For_Contract)obj;
		
		System.out.println("Checking .equals after hashCode is same.");
		return this.id == cont2.id && this.name.equals(cont2.name);
	}
	
}













