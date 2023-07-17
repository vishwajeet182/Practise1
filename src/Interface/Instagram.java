package Interface;

public interface Instagram 
{
	
	public abstract void post(String ip);
	
	public abstract void comment(String name,String ip);
	
	public abstract void massege(String msg) ;
	
	public static void welcome(String name)
	{
		System.out.println("Hey ! "+name+ " Welcome To InstaGram!");
	}
	
	
	public abstract void story(String ip);
	
	public abstract void reply(String name,String ip);
	
//	default void abc()
//	{
//		System.out.println("from default Method from Interface !");
//	}
}
