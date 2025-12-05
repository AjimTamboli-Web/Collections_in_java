package collections;

public class C_generics {

	public static void main(String[] args) {

/*
 * ⏺️ Generics => Generics means parameterized types. They allows us to write code that works with different
                    data types using a single class, interface or method.    ✔ Compile-time error checking
 *           Generics means writing code that works for any data type (like int, String, Double) without 
                  rewriting the same code again and again.  ✔ Type-safe code  ✔ Reusable code
 *  ⚠️ Why Generic? -> Without generics, collections store Object → risk of ClassCastException.
 *  
 *                    With Generics, you can specify the type the collection will hold like ArrayList<String>. 
 *                    Now, Java knows what to expect and it checks at compile time, not at runtime. 
 * ⭕ Types of Java Generic  ->  1. Generic Class     2. Generic Method                             
 */
		
		
		Itype<Integer> mak = new Maker();      // generic class
		
		mak.show(23);
		
		Itype<String> mak1 = new Maker1();
		mak1.show("John");
		
//		Itype<T> mak2 = new Maker2();
		
		Itype<String> mak3 = new Converters();
		mak3.show("Targaryen");
	    System.out.println(mak3.dos("Lannisters"));
	    
	    Itype2<String,Integer> mak4 = new Conver();
	    System.out.println(mak4.see(23));
	    
	    Itype2<Integer,String> mak5 = new Conver2();
	    System.out.println(mak5.see("Jannifer Lawrence"));
	   
	    MethGen.methGen(23);      					 // generic methods
	    MethGen.methGen("Hellow");  
	    MethGen.methGen(23.45);
	}

}


interface Itype <T>{
	 
	void show(T t);
	default int dos(T s) {
		return 0;
	}
}

class Maker implements Itype<Integer>{
	
	public void show(Integer t) {
		System.out.println(t);
	}
}

class Maker1 implements Itype<String>{
	public void show(String n) {
		System.out.println(n);
	}
}

class Maker2<T> implements Itype<T>{         // generic class
	
	public void show(Integer i) {
		System.out.println(i);
	}
	public void show(String s) {
		System.out.println(s);
	}
	public void show(T e) {
		System.out.println(e);
	}
}

class Converters implements Itype<String>{
	public void show(String s) {
		System.out.println(s);
	}
	
	public int dos(String e) {
		return e.length();
	}
}

interface Itype2 <T,R>{
	
	 T see(R re);
	
}

class Conver implements Itype2 <String,Integer>{
	public String see(Integer a) {
		if(a > 18) {
			return "Vote Eligible";
		}
		return "try again";
	}
}

class Conver2 implements Itype2 <Integer,String>{
	public Integer see(String st) {
		return st.length();
	}
}


class MethGen{              // Method generic
	MethGen(){
		System.out.println("This is class to have method is generic.");
	}
	
	public static <T> void methGen(T elements) {
		System.out.println(elements.getClass().getName() + " = " + elements);
	}
}
