package ExeptionHandling;
import java.util.InputMismatchException;
//import java.util.InputMismatchException;
import java.util.Scanner;
public class TryCatchBlock 
{
	static
	{
	System.out.println("Finslly Bloc will Not Exucute when the exception is occerd outside the try block!");	
	}
	public static void main(String[] args) 
	
	{
		
		try
		{
			Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Numerator!");
		int num=sc.nextInt();
		System.out.println("Enter A dENOMANATOR!");
		int dem=sc.nextInt();
		
		
		int res=num/dem;
		System.out.println(res);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dont Divide A Numrator by Zero!");
			System.out.println("this Is From Arithmatic Exception Block !");
		}
//		catch(InputMismatchException e)
//		{
//			System.out.println("Inavlid data Please Enter a Data In variable according to the tyepe Of Conatiner int,char,String,long etc");
//			System.out.println("This Is From Input Misss Match Block !");
//		}
		catch(RuntimeException e)
		{
			System.out.println("Dont Divided any No Bye Zero!");
			System.out.println("This Is A Runtime Eception!");
		}
		catch(Exception e)
		{
			System.out.println("Enter A Valid Input Data!");
			System.out.println("this Is A Exception catchBloc !");
		}
		catch(Throwable e)
		{
			System.out.println("Please Provide the Proper Reff OF Sn Object!");
			System.out.println("this is From Throwable obl=ject Created  OF eception Block!");
		}
		finally
		{
			System.out.println("You Are In Exeptin Handling!");
			System.out.println("This Is From Finally Block !");
			System.out.println("Thhank For Doing PrograMing With us!");
		}
	}
}
