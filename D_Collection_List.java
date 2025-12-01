package collections;

import java.util.ArrayList;
import java.util.List;

public class D_Collection_List {

	public static void main(String[] args) {
	
		List list = new DD();      // generic
          list.add(23);
          list.add("AJJ");
          list.add(new int[] {34,23,54});
          System.out.println(list);
          
          
	}

}

class DD<T> extends ArrayList<T> {
	
	public void shows(T i) {
		System.out.println(i);
	}
	
}