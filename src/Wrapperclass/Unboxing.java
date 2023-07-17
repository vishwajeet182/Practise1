package Wrapperclass;

public class Unboxing 
{
	public static void main(String[] args)
	{
		Integer a=new Integer(20);
		
		
		int i=a.intValue();// Programer tries To Do Explicitally unboxing
		
		int j=a;//This is Implicitally Done By A Programmer
		System.out.println(j);
		System.out.println(a);
		System.out.println(i);
	}

}
