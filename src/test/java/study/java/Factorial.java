package study.java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		 
			
		
		
			  int i,factorial=1;  
			  int number; 
// User input			  
			  Scanner myObj = new Scanner(System.in);  
			  System.out.println("Enter Number");
			  number=myObj.nextInt();
			  
//Calculating factorial
			  
			  for(i=1;i<=number;i++){ 
				  
				  factorial=factorial*i; 
			      
			      if (factorial%3==0)
			    	  
			      {
			    	System.out.println("hokey");  
			      }
			      
			      else if (factorial%5==0)
			      {
			    	  System.out.println("pokey");  
			    	  
			      }
			      
			      else if (factorial%3==0 && factorial%5==0 )
			      {
			    	  System.out.println("hokey­pokey");  
			    	  
			      }
			  }    
			  System.out.println("Factorial of "+number+" is "+factorial);    
			   
			  
	}

}
