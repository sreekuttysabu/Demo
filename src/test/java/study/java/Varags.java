package study.java;

public class Varags {

	
	public void month (int...var)
	{
		
		

		for (int n : var) {
			
			System.out.println(n);
		}

	}
	
	
	
	public static void main(String[] args) {
		
		
		Varags ven= new Varags();
		ven.month(3,5);
		
		
	}

}
