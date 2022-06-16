package study.java;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharectr {

	public static void main(String[] args) {
		
//	HashMap<String, Integer>	map=new HashMap<String,Integer>();
//	map.put("sree", 1)	;
//	map.put("sabu", 2)	;
//	map.put("sandeep", 3);
//	
//	Set<String> keys= map.keySet();
//	
//	for(String k:keys)
//	{
//		System.out.println(map.get(k));
//		
//	}

// Find duplicates 
	
	String str="sreekutty";
	
	char[] cr=str.toCharArray();
	
	HashMap<Character, Integer>	maps=new HashMap<Character,Integer>();
	
	for (char c:cr)
	
	
	{
		
		if (maps.containsKey(c))
		{
			maps.put(c, 2);
			
		}
		
		else
		{
			maps.put(c, 1);
		}
		
	}
		
		
	System.out.println(maps);	
		
		
	for (char ct:maps.keySet())
	{
		if (maps.get(ct)>=2)
		{
			System.out.println(ct);
		}
		
	}
	
	

	}
	
}
