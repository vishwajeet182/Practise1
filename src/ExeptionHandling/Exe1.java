package ExeptionHandling;
import java.util.Scanner;
public class Exe1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		
		try
		{
			System.out.println("Enter A Numrator!");
			int num=sc.nextInt();
			
			System.out.println("Enetr a Denomanator!");
			int den=sc.nextInt();
			
			int res=num/den;
			System.out.println(res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dont Devide By Zero");
		}
		
	}
	
//	public int div(int a,int b)
//	{
//		int res=a/b;
//		return res;
//	}

}
