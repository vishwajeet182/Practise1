package StaticVariable;

public class Staticvariable
{
	static int i;
	public static void main(String[] args)
	{
		System.out.println(i);
		i=10;
		System.out.println(i);
		a();
	}
	public static void a()
	{
		System.out.println(i);
	}

}
