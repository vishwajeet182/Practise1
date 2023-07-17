package ArraysPractice;
import java.util.Scanner;
public class ArrayPerfect 
{

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enetr a size of array");
	int a[]=new int[sc.nextInt()];
	
		for(int i=0;i<a.length;i++)
		{
		a[i]=sc.nextInt();	
		}
	
		for(int i=0;i<a.length;i++)
		{
		isPerfectNo(a[i]);
		}
	}
	
	public static void isPerfectNo(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println("The no is perfect no "+num); //6=1+2+3
		}
	}
}
