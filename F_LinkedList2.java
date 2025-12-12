package collections;

import java.util.*;

public class F_LinkedList2 {

	public static void main(String[] args) {

//  Delete specific comment(Object) and compaired 
		
		LinkedList<Comment> co = new LinkedList<Comment>();
		co.add(new Comment(1,"Nice"));
		co.add(new Comment(2,"Good"));
//		co.add(null);  cannot read field because is null
		co.add(new Comment(3,"Average"));
		
		System.out.println(co); // without overriding toString method
//O/p ->   [collections.Comment@5e9f23b4, collections.Comment@4783da3f, null, collections.Comment@378fd1ac]
		
		System.out.println(co);  // with overriding toString method
//O/p ->     1 : Nice, 2 : Good, null, 3 : Average]		
		
		Comment remo = new Comment("Average"); // create object for checking value with in comments in co.
		
		System.out.println(co.contains(remo)); // check object with .equals override
		System.out.println(co.remove(remo));   // it remove object in list
		
		System.out.println(co);  // updated list
		
		
		
	}

}

class Comment{
	
	int id;
	String content;

	Comment(int i,String con){
		this.content = con;
		this.id = i;
	}
	
	Comment(String com){
		this.content = com;
	}
	
	public String toString() {
		return this.id + " : " + this.content;
	}
	
	public boolean equals(Object obj) {
		Comment com = (Comment)obj;
		return this.content.equals(com.content);
	}
}