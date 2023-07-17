package StaticVariable;

public class StattVar1
{
	static String s="JSPIDER";
	public static void main(String[] args) 
	{
		System.out.println(s);
		s="Pyspider";
		System.out.println(s);
		test(); 
		System.out.println(s);
	}
	public static void test()
	{
		s="Qspider";
		System.out.println(s);
	}
}
