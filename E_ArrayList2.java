package collections;

import java.util.*;

public class E_ArrayList2 {

	public static void main(String[] args) {
	
// **** Remove all duplicates from an ArrayList
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList
				           (34,54,76,45,12,76,54,21,34,76,87,12));
		
		System.out.println(list);
		System.out.println("Before deletion: " + list.size()); // 12
		
		for(int i = 0; i < list.size(); i++) {
			
			for(int j = i + 1; j < list.size(); j++) {
				
				if(list.get(i).equals(list.get(j))) {
					System.out.println(i + " " +  list.get(i) +  " " + j + " " + list.get(j));
					list.remove(j);
					j--;
				}
				
			}
		}
		
		System.out.println(list);
        System.out.println("After deletion: " + list.size());
        
 //***  find smallest no 
        
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList
		           (34,76,87,2,45,54,879,21,34749,354,36,1));
        
         int min = list2.get(0);
         
        for(int i = 1;i<list2.size();i++) {
        	   if(list2.get(i) < min) {
        		   min = list2.get(i);
        	   }
        }
        System.out.println("smallest int: " + min);
        
  //****  find the largest no   
        
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList
		           (21,34,7,49,1,35,4,36));
        
        int max = list3.get(0);
        
        for(int i = 1; i<list3.size();i++) {
        	  
        	   if(max < list3.get(i)) {
        		   max = list3.get(i);
        	   }
        }
        System.out.println("Largest int: " + max);
        
   // *** count how many time a number appears in an arraylist
        
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList
		           (21,34,7,49,1,35,4,34,36,76,67,34));
        
        
        int counter = 0;
        int no = list4.get(0);
        for(int i = 0; i < list4.size(); i++) {
        	   for(int j = i + 1;j < list4.size();j++) {
        		   if(list4.get(i).equals(list4.get(j))) {
                   no = list4.get(i);      
        			   counter++;			   
        		   }
        	   }
        	 
        }
        System.out.println(no + " frequency :  " + counter);
        
 // ** Remove all even numbers from an ArrayList       
        
		ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList
		           (21,34,7,49,1,35,4,34,36,76,34));
		
		System.out.println(list5);
		
		for(int i = 0; i < list5.size();i++) {
			if(list5.get(i)%2 == 0) {
				list5.remove(i);
				i--;
			}
		}
		System.out.println(list5);
		
 // *** Reverse an ArrayList without using Collections.reverse()
		
		ArrayList<Integer> list6 = new ArrayList<>(Arrays.asList
		           (21,34,7,49,1,35,4,34,36,76,34));
		
		System.out.println(list6);
		
		int i = 0;
		int j = list6.size()-1;
		
		while(i < j) {
			
			int temp = list6.get(i);
			list6.set(i, list6.get(j));
			list6.set(j, temp);
			
			i++;
			j--;
		}
		
		System.out.println("Reverse:  " + list6);
	}

}
