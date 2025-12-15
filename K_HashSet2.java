package collections;

import java.time.LocalDateTime;
import java.util.*;

public class K_HashSet2 {

	public static void main(String[] args) {
		
			//LocalDateTime[]
		
		LocalDateTime date1 = LocalDateTime.of(1999, 5, 24, 11, 45);
		LocalDateTime date2 = LocalDateTime.of(2022, 07, 18, 07, 28);
		
		Services mh20 = new Services(12,"Xuv700",new LocalDateTime[] {date1,date2});
		Services mh12 = new Services(34,"ScorpioN10",new LocalDateTime[] {date1,date2});
		Services mh24 = new Services(12,"Xuv700",new LocalDateTime[] {date1,date2});
		
		Set<Services> hs = new HashSet<Services>();
		hs.add(mh20);
		hs.add(mh12);
		hs.add(mh24);
		
		System.out.println(hs);
		
		System.out.println(mh12.hashCode());// 44
		System.out.println(mh20.hashCode());// 18
		System.out.println(mh24.hashCode());// 18
		
		System.out.println(mh20.equals(mh24));
		
		for(Services se: hs) {
			System.out.println(se);
		}
	}

}


class Services{
	
	int id;
	String name;
	LocalDateTime[] servicings;
	
	public Services(int i,String n,LocalDateTime[] serv) {
		this.id = i;
		this.name = n;
		this.servicings = serv;
	}
	
	public int hashCode() {
		return this.id+this.name.length();
	}
	
	public boolean equals(Object obj) {
		Services se = (Services)obj;
		return this.id == se.id && this.name.equals(name);
	}
	
   public String toString() {
		
	   StringBuffer bd = new StringBuffer();
		
		for(LocalDateTime ser : servicings) {
			bd.append(ser.toString() + "|");
		}
		return this.id + " : " + this.name + " : " + bd;
		
	}
	
	
}