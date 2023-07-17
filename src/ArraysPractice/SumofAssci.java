package ArraysPractice;
import java.util.Scanner;
public class SumofAssci
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size of an array");
		int size=sc.nextInt();
		
		char []a=new char[size];
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("Enter a chrecter ");
			a[i]=sc.next().charAt(0);
		}
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+(int)a[i];
		}
		System.out.println("sum of assci value of arrey is :"+sum);
	}
}
