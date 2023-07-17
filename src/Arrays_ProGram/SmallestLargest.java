package Arrays_ProGram;
import java.util.Scanner;
public class SmallestLargest
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enete a  size of an array");
		int size=sc.nextInt();
		
		int a[] =new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int small=a[0];
		int large=a[0];
		for(int i=0;i<a.length;i++)
		{
			
			if(small>a[i])
			{
				small=a[i];
			}
			else if(large<a[i])
			{
				large=a[i];
			}
		}
		System.out.println("The largest no is "+large);
		System.out.println("The Smallest no is "+small);
	}
}
