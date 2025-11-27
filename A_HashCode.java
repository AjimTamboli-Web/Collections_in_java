package collections;

public class A_HashCode {

	public static void main(String[] args) {


		Form_hash hash = new Form_hash();
		
		Form_hash hash2 = new Form_hash();
	
		// whenever you call hashCode directly with new reference always show unique integer
		 System.out.println(hash.hashCode());    // before hashCode method override => 1867750575                   
         System.out.println(hash2.hashCode());  // before hashCode method override => 2046562095
        // After override hashCode method it's show custom integer for both instance(reference) object
         
	}

}	


class Form_hash{
	
	int id;
	String name;
	
	// when you override hashCode method form Object class you can create custom hash code for yourself
    public int hashCode() {
    	  System.out.println("This hashCode method override from Object class to custom class: ");
    	  return 505;
    }
	
}