package Interface;

public class Insta2 extends Insta1
{
	public Insta2()
	{
		
	}
	
	Insta2(String name, String PassWord)
	{
		super(name,PassWord);
		
	}
	public void story(String ip)
	{
		System.out.println(ip);
		System.out.println("Story Added!");
		System.out.println("It will Disappear in 24 Hr !");
	}
	
	public void reply(String name,String ip)
	{
		System.out.println(ip);
		
		System.out.println(name+" reply sent!");
//		abc();
	}

	@Override
	public void massege(String msg) 
	{
		System.out.println(msg);	
	}
}
