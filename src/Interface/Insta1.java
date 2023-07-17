package Interface;

public abstract class Insta1 implements Instagram 
{
	String name;
	String password;
	

	public Insta1(String name,String pass)
	{
	     
		this.name=name;
		this.password=pass;
		
		System.out.println("Account Log In Succesfully!");
	}
	
	public Insta1() {
		// TODO Auto-generated constructor stub
	}

	 public void post(String ip)
	{
		System.out.println(ip);
		
		System.out.println("Posted!");
	}
	
	public  void comment(String name,String ip)
	{
		System.out.println(ip);
		
		System.out.println("Comment!");
	}
	
	public void massage(String a)
	{
		System.out.println(a);
		
		System.out.println("Sent!");
		
//		abc();
	}
}
