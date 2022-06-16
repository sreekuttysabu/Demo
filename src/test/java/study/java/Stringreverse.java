package study.java;

import java.util.HashMap;
import java.util.Map;

public class Stringreverse {

	public static void main(String[] args) {

	
// Simple program 
		String str="Sreekutty";
		
		char[] ch= str.toCharArray();
		
		String tr="";
		for (int i=ch.length-1;i>=0;i--)
		{
			
			tr=tr+ch[i];
		}
		
		
		System.out.println(tr);

		
// String builder 
		
		StringBuilder sb= new StringBuilder("sreekutty");
		
		StringBuilder sn=sb.reverse();
		
		System.out.println(sn);
		
//Square root numbe4
		
		int a=9;
		
		System.out.println(Math.sqrt(a));
// Duplicate :
		
		
		String blogName = "howtodoinjava dot com";
	    char[] chars = blogName.toCharArray();
	     
	    Map<Character, Integer> map = new HashMap<>();
	    for(char c : chars) 
	    {
	      if(map.containsKey(c)) {
	        int counter = map.get(c);
	        map.put(c, 2);
	      } else {
	        map.put(c, 1);
	      }
	    }
	     
	    System.out.println("Duplicate characters:");
	     
	    //Print duplicate characters
	    for(char c : map.keySet()) {
	      if(map.get(c) > 1) {
	        System.out.println(c);
	      }
	    }
	     
	    System.out.println("Duplicate characters excluding white space :");
	     
	
	  }
	}


