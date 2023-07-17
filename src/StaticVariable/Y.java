package StaticVariable;

public class Y extends X
{
	String s;
	
	public Y()
	{
		//Default Constucter
	}
	 public Y(int a,String s)
	 {
		super(a);
		this.s=s;
		System.out.println("From Y class");
	 }
}
