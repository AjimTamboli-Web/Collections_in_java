package collections;

public class C_generics {

	public static void main(String[] args) {
		
		Itype<Integer> mak = new Maker();
		
		mak.show(23);
		
		Itype<String> mak1 = new Maker1();
		mak1.show("John");
		
		Itype<?> mak2 = new Maker2();
		
		Itype<String> mak3 = new Converters();
		mak3.show("Targaryen");
	    System.out.println(mak3.dos("Lannisters"));
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

class Maker2<T> implements Itype<T>{
	
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


