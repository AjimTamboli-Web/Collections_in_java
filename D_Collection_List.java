package collections;

import java.util.ArrayList;
import java.util.List;

public class D_Collection_List {

	public static void main(String[] args) {
	
		List list = new DD();      // generic raw type
          list.add(23);
          list.add("AJJ");
          list.add(new int[] {34,23,54});
          System.out.println(list);
          
       List<Integer> list2 = new DD<Integer>();    // type safe
        list2.add(23);
        list2.add(25);
        System.out.println(list2);
        
       DD list3 = new DD();
       list3.shows(list2);
	}

}

class DD<T> extends ArrayList<T> {
	
	public void shows(T i) {
		System.out.println(i);
	}
	
}