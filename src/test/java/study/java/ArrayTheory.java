package study.java;

public class ArrayTheory {

	
	
	
	
	
	public static void main(String[] args) {
		
		
		int[][] var= {{2,3,4},{5,6,7}};
		
		for (int[] a:var)
		{

			for (int m:a)
			{
				System.out.println(m);
			}

		}
		
	// Jagged Array 
		
		int[][] test = {{-4, -5, 6, 9},{1},{2, 3}};
		
		for (int i=0;i<test.length;i++)
		{
			for (int j=0;j<test[i].length;j++)
			{
				System.out.println("sree"+test[i][j]);
			}
			
		}
		
		

	}

}
