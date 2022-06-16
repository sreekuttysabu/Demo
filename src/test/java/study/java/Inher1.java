package study.java;


public class Inher1 {

	public int a=7;
	public int b=9;
	public int c=4;
	
	public void jan()
	{
		System.out.println(a+""+b+""+c);
		
	}
	
	
	
	
	public static void main(String[] args) {
		Inher1 intr= new Inher1();
		intr.a=3;
		intr.b=4;
		intr.c=5;
		intr.jan();

	}

}
