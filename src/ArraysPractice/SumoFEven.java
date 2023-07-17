package ArraysPractice;
import java.util.Scanner;
public class SumoFEven 
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr a numbr of size of array");
		int size=sc.nextInt();
		
		int [] a=new int[size];
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("enter a element");
			a[i]=sc.nextInt();
		}
		int sumofeven=0;
		int sumofodd=0;
		for(int i=0;i<=a.length-1;i++)
		{
		
			if(a[i]%2==0)
			{
			sumofeven=sumofeven+a[i];
			}
			else
			{
				sumofodd=sumofodd+a[i];
			}
		}
		System.out.println("The Sum of Only Even Number "+sumofeven);
		System.out.println("The Sum of Only odd Number "+sumofodd);
	}
}
