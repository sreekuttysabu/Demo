package study.java;

public class Students {
	
public  int a;

public  int b;

public int c;
	
	
	
public 	Students(int m,int n,int p)
{
	
	
	this.a=m;
	this.b=n;
	this.c=p;
	System.out.println("sreekutty sabu"+a+b+c);
	
	
}
public 	Students(int x,int y)
{
	
	
	this.a=x;
	this.b=y;
	
	System.out.println("sreekutty sandeep"+a+b);
	
	
}	
	
public  void 	StudentsB4()	
{
	
	System.out.println(a+b+c);
	
}
	
	
	
	public static void main(String[] args) {
		
		Students str= new Students(3,5);
		str.StudentsB4();
		
		/*
		 * str.a=2; str.b=4; str.c=6; str.StudentsB4();
		 */
		
		
		}
		
		
		
		
		
		
		
		
		
		

	

}
