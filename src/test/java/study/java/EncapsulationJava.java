package study.java;

public class EncapsulationJava {

	private int a;
	private String b;
	
	
	
	public int getRollNo()
	{
		return a;
	}
	
	public void  setRollNo(int roll)
	{
		this.a=roll;
	}
	
	public String getName()
	{
		return b;
	}
	
	public void  setRollNo(String name)
	{
		this.b=name;
	}
	
	
	
	
	public static void main(String[] args) {
		
		EncapsulationJava enp = new EncapsulationJava();
		enp.setRollNo(20);
		System.out.println(enp.getRollNo());
	}

}
