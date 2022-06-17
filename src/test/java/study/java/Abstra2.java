package study.java;

public  class Abstra2  extends Google{
///////////////
	
	public void message()
	{
		System.out.println("messages");
		
	}
	
	public void songs()
	{
		System.out.println("songs");
		
	}
	
	
	
	
	public static void main(String[] args) {
	
		Abstra2 obj= new Abstra2();
		
		obj.message();
		
		obj.songs();
		
		obj.images();
	}

}
