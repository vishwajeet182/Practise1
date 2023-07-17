package Wrapperclass;

public class Boxing 
{
	public static void main (String[] args)
	{
		int a=20;
		
		int i=Integer.valueOf(a);   // PROGRAMER DO AUTOBOXING EXPLICITALY
		
		int j=a;      //Now Compiler Did Automatically or implicitally Autoboxing
		
//		int j=Integer.valueOf(i);
		
		System.out.println(a);
		System.out.println(i);
		System.out.println(j);
		
		
		
	}
}

