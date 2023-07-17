package ArraysPractice;
import java.util.Scanner;
public class ArrayNeon 
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size of an array :");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			isNeon(a[i]);
		}
	}
	public static void isNeon(int num)
	{
		
		int sum=0;
		
		int sqr=suqere(num);
//		System.out.println(sqr);
		while(sqr>0)
		{
			int rem=sqr%10;
			sum=sum+rem;
			sqr/=10;
		}
		if(sum==num)
		{
			System.out.println("number is neon no :"+num); //9=81=8+1=9
		}
		
	}
	public static int suqere(int num)
	{
		int sqr=1;
		sqr=num*num;
		return sqr;
	}
}
