package ExeptionHandling;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ObjectPropagation
{
	public static void main(String [] args)
	{
		System.out.println("It is a Procces Of movement of exception object reff "
				+ "from Called Method To the Calling Method,"
				+ "When The Exceptin Is Not handeld,"
				+ "It Is called As Exception Object Propagation");
		try
		{
			test();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dont Divided No By Zero!");
		}
	}
	
	public static void test()
	{
	System.out.println(10/0);	
	}
}
