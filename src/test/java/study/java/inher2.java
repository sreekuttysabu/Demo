package study.java;

public class inher2 extends Inher1 {

	public int i=90;
	public int j=100;
	public int k=110;
	
	public void feb()
	{
		System.out.println(i+""+j+""+k);
		
	}
	
	public void jan()
	{
		System.out.println("kinu");
		super.jan();
	}
	
	
	public static void main(String[] args) {
		inher2 intr2= new inher2();
		intr2.feb();
		intr2.jan();

	}
}
