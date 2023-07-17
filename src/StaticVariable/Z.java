package StaticVariable;

public class Z extends Y
{
	double d;
	
	
	public Z()
	{
		//default Constructer
	}
	
	public Z(int a,String s,double d)
	{
		super(a,s);
		this.d=d;
		System.out.println("from z class");
	}

}
