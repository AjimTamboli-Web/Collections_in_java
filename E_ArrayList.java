package collections;
import java.util.*;

public class E_ArrayList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(23);
		list.add(56);
		list.add(12);
		list.add(876);
		list.add(65);
		list.add(2234);
		list.add(223);
		System.out.println(list);
		System.out.println(list.size());  // 7
		System.out.println(list.contains(65)); // true
		System.out.println(list.indexOf(2234)); // 5 
		System.out.println(list.lastIndexOf(876)); // 3
		System.out.println(list.remove(2));     // delete 12
		System.out.println(list); // updated list
		System.out.println(list.getFirst());  // 23
		System.out.println(list.getLast());   // 223
		System.out.println(list.reversed());  // reverse
		System.out.println(list);  // immutable
		
		
	}

}
