package collections;

import java.util.*;

public class I_Stack_Vector {

	public static void main(String[] args) {
		
/*
 * ⏺️ Stack is a linear data structure that follows the Last In First Out (LIFO) principle and is defined in the java.util package.
            Internally, it extends the Vector class, so Stack is:  ✔ Dynamic   ✔ Thread-safe (because Vector is synchronized)	
 * ⏺️ Stack class maintains insertion order and allows duplicates and null values. Grows dynamically when its capacity is exceeded.
 * ⏺️ Stack is considered a legacy class, introduced in early versions of Java and a preferred solution to implement Stack Data
            Structure (especially when thread synchronization is not needed) is either to use ArrayDeque or LinkedList
 * ⏺️ Stack class implements List, RandomAccess, Cloneable, and Serializable interfaces.
 * ⏺️ Empty Stack:If the stack has no element is known as an empty stack.When the stack is empty the value of the top variable is -1.
 * 
 */
		
		Stack<Integer> st = new Stack<>();
		
		st.push(12); 			//	|90  | <- Head   pop first
		st.push(56); 			//	|null|
		st.push(11); 			//	|45  |
		st.push(90);  			//	|87  |	
		st.push(87);  			//	|90  |
		st.push(45);  			//	|11  |	
		st.push(null); 			//	|56  |
		st.push(90);			//	|12  | <- tail	
		                        //  ‾‾‾‾‾‾stack 
		
		System.out.println(st);
		System.out.println("pop: " + st.pop()); // delete the object at the top of this stack 
		
		System.out.println(st);
		System.out.println("peek: " + st.peek()); // show the top element at in stack

		System.out.println("First Element: " + st.firstElement());
		System.out.println("Last Element: " + st.lastElement());
		
//		System.out.println("0 index : " + st.get(0));  this will get confuse that why not use in stack it gives random access
//		System.out.println("2 index : " + st.get(2));   stack should maintain LIFO order.
		
//      Searches for an element from the top of the stack and returns 1-based position.		
		System.out.println(st.search(12)); // it follow opposite of list order index base, stack use head to tail to search
		System.out.println(st.empty());   // false
		
		System.out.println(st.capacity());
		
		
		while(!st.empty()) {
			st.pop();
		}
		
		System.out.println(st); // stack is empty []
		System.out.println(st.empty());  // true
		
		System.out.println(st.size()); // 0
		st.add(78);
		st.add(65);
		System.out.println(st.size()); // 2
		System.out.println(st.lastElement()); // 65
		System.out.println(st.firstElement()); // 78
		
	}

}
