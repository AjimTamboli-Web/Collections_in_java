package collections;

import java.util.LinkedList;
import java.util.List;

public class F_LinkedList {

	public static void main(String[] args) {
		
		
		List<Integer> list = new LinkedList<Integer>();
		
		list.add(34);
		list.add(45);
		list.add(12);
		list.add(76);
		list.add(65);
		list.add(34);
		list.add(90);
		
		System.out.println(list);
		System.out.println(list.hashCode());
	}

}
