package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tasks_Collections {

	public static void main(String[] args) {
	
	// Provided list [23,76,34,98,23,76,90] sort the array with unique values only
		
		List<Integer> list = new ArrayList<>();
		list.add(23); list.add(76); list.add(34); list.add(98); list.add(23);list.add(76); list.add(90);
		  // [23,76,34,98,23,76,90]
		System.out.println("list: " + list);
		
		Set<Integer> set = new HashSet<>(list);
		
		System.out.println("Set: " + set);

	}

}
