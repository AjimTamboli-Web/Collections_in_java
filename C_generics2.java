package collections;

public class C_generics2 {

	public static void main(String[] args) {
		
		Itypo t = new Cleverse();  // raw type
		t.see(23, 23);
		t.see("Name" , "John");
      
		Itypo<Integer> inte = new Cleverse<Integer>();  // type safe 
		inte.see(34, 34);
		
		Itypo<String> strin = new Cleverse<String>();
		strin.see("Name: ", "John");
	
		
		CharStr converters = new CharStr();
		System.out.println(converters.charge("John","Walker"));
		
		
	}
}

interface Itypo<T>{
	
	void see(T t1,T t2);
	
}
interface Conv<T,R>{
	R charge(T t1,T t2);
}

class Cleverse<T> implements Itypo<T>{
	
	public void see(T t1, T t2) {
		if(t1 instanceof Integer && t2 instanceof Integer) {
			 System.out.println((int)t1 + (int)t2);
		}
		else if(t1 instanceof String && t2 instanceof String) {
			System.out.println("String Found: " + (String)t1 + (String)t2);
		}
	}
}


class CharStr implements Conv<String,Character[]>{

	@Override
	public Character[] charge(String t1, String t2) {
		
		char[] char1 = t1.toCharArray();
		char[] char2 = t2.toCharArray();
		
		int i = char1.length+char2.length;
		
		Character[] chars = new Character[i];
		
		for(int j = 0; j < char1.length; j++) {
			chars[j] = Character.valueOf(char1[j]);
		}
		
		return chars;
	}
	
	
	
	
}