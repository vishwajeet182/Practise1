package Arrays_ProGram;
import java.util.Scanner;
public class Largestno 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enete a Size ");
		int size=sc.nextInt();
		int []a=new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int large=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(large<a[i])
			{
				large=a[i];
			}
		}
		System.out.println("the largest no is : "+large);
	}
}
