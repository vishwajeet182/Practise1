package Method_Overriding;

public class ABDriver
{
	public static void main(String[] args)
	{
		A a1=new B();
		X x1=new A();
		x1.usefull();
		a1.useless();
        
	}
}
