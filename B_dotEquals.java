package collections;

public class B_dotEquals {

	public static void main(String[] args) {
		
		String name1 = new String("ABC");
		String name = "ABC";
		String name2 = new String("ABC");
		
		System.out.println(name.intern() == name2);     // check reference in non-primitive
		System.out.println(name2.equals(name1));// checks actual content inside String 
		
		System.out.println("*************************************");
		
		Custom_class clas1 = new Custom_class(1,"XYZ");
		Custom_class clas2 = new Custom_class(1,"XYZ");
		
		System.out.println(clas1 == clas2);  // false it checks memory reference
        System.out.println(clas1.equals(clas2));
         // ⬆️⬆️ checks reference in class not values as long as you override .equals method in your custom class
        System.out.println("*******************************************");
       
        

       
		

	}

}

class Custom_class{
	int id ;
	String name;
	
	public Custom_class(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	public boolean equals(Object obj) { 	 // override the equals methods
		Custom_class own = (Custom_class) obj;
		return this.id == own.id && this.name.equals(own.name);
	}
}




