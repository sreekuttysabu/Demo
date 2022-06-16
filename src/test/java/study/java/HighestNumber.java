package study.java;

import java.util.HashMap;
import java.util.Set;

public class HighestNumber {

	public static void main(String[] args) {
		
	String str="Hello world am waiting for your choice";	
		
		
	String[]st= str.split(" ");	
		
		
	HashMap<String,Integer> map= new HashMap<String,Integer>();
		
		
	for (String snt:st)
	{
		
		if (map.containsKey(snt))
		{
			map.put(snt, 2);
			
		}
		
		else
		{
			map.put(snt, 1);
			
		}
	}
		
		
	System.out.println(map);	
		
		
		
	}
	
}
