package study.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class ListInteface {

	public static void main(String[] args) {
		
// duplicates are allowed
// insertion order is preserved
// Null insertion allowed 
// resizable array 

		
// Initialize Array
		ArrayList <String> al= new ArrayList<String>();
        al.add("sree");
        al.add("sabu");
        al.add("sandeep");
        al.add("sankar");
        al.add("sushama");
        al.add("sabu");
        al.add("sabu");
        
        ArrayList <String> bl= new ArrayList<String>();
        bl.add("100");
        bl.add("300");
        bl.add("400");
        
        
//  get one element .
        
       System.out.println("Get"+bl.get(2));
       
// Set one element 
		bl.remove(0);
		bl.set(1, "90");
		
		System.out.println("removal nd set : "+ bl); 

		al.addAll(6, bl);

		System.out.println("after adding: "+ al); 
	

	
// AVoiding duplicates .
	
	Set <String> sit=  new HashSet<>(al);
	al.clear();
	al.addAll(sit);
	
	
	System.out.println("removing duplicates: "+ al); 
	
	Collections.sort(al);   
	// printing the sorted ArrayList   
	System.out.println("After Sorting: "+ al);   
	
// Linked ArrayList
	
	 LinkedList <String> Li= new LinkedList<String>();
	 Li.add("Anu");
	 Li.add("Asha");
	 Li.add("kochu");
	 Li.add("kuttan");
	 
	 for (int j=0;j<Li.size();j++)
	 {
		 System.out.println("Linked"+Li.get(j));
		 
	 }
	 
	 
	 Iterator<String> itr= Li.iterator();
	 
	 while (itr.hasNext())
	 {
		 System.out.println("iteratr"+itr.next());
	 }
	 
	 
	 
	
	}	
	
}
