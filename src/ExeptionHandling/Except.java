package ExeptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Except 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter a number!");
			int num1=sc.nextInt();
			System.out.println("Enter A Second Number !");
			int num2=sc.nextInt();
			int res=num1/num2;
			
			System.out.println("The Ans Is "+res);
		}
		catch(ArithmeticException q)
		{
			System.out.println("This Is An ArithMatic Exception !");
			System.out.println("Pleas Dont't Devide any Numrator  with denomenator zero!");
		}
		catch(InputMismatchException z)
		{
			System.out.println("This Is From Input Miss Match Block ");
			System.out.println("You Need To follow The Rule Of Storing varaible in respective Type Of datatype!");
		}
		finally
		{
			System.out.println("Thank You For Choosing Exception Handling !");
		}
	}
}
