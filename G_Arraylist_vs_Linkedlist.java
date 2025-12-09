package collections;

import java.util.*;

public class G_Arraylist_vs_Linkedlist {

	public static void main(String[] args) {
		
		ArrayList<ListOps> list = new ArrayList<ListOps>();
		
		for(int i =0; i<100000000;i++) {
			list.add(new ListOps(1,"Name",40000.00f));
		}

		long start = System.nanoTime();
		
		list.add(new ListOps(100,"Tom",23003.00f)); // 2200,1400,1800,1500,1100,1800
		
//	    list.remove(970037); // 100,200,300,300,200,300
		
		
	    
	    long end = System.nanoTime();
	    
	    System.out.println("ArrayList Time taken: " + (end-start));
		
	    
	    
//	    LinkedList<ListOps> list2 = new LinkedList<ListOps>();
//	    
//	    for(int i=0;i<1000000;i++) {
//	    	list2.add(new ListOps(1,"Name",50000.00f));
//	    }
//	    
//	    long start1 = System.nanoTime();
//	    
//	    list2.add(new ListOps(100,"Tom",23003.00f)); // 1700,1600,1800,1600,1900,1800
//	    
////	    list2.remove(970037); // 311100,300600,339400,330700,302500,354200
//	    
//	    long end2 = System.nanoTime();
//	    
//	    System.out.println("LinkedList Time taken: " + (end2-start1));
	}

}


class ListOps{
	int id;
	String name;
	float price;
	
	ListOps(int i,String n,float f){
		this.id = i;
		this.name = n;
	    this.price = f;
	    
	}
}