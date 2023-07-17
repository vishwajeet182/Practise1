package ExeptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionOfObjectPropagation 
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter a numbers!");
//			System.out.println("Enter a numrator");
//			int num=sc.nextInt();
			div(sc.nextInt(),sc.nextInt());
		}
		catch(ArithmeticException e)
		{
			System.out.println("This Is arithmatic block!");
			System.out.println("Pleas Don't divide numerator with Denamonator Zero !");
		}
		catch(InputMismatchException e)
		{
			System.out.println("This Is From Input Miss MatchBlock!");
			System.out.println("It us invalid data!");
			System.out.println("Add Officaila respective data in that!");
		}
		finally
		{
			System.out.println("You can Enter Anything bcz this Is A finally block!");
		}
		
	}
	public static int div(int a,int b)
	{
		int res=a/b;
		System.out.println("this Is ans : "+res);
		return res;
	}
}
