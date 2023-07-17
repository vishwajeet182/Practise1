package AssignArray;
import java.util.Scanner;
public class Q4 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array :");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter a element :");
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					
				}
				
			}
			if(count>1)
			{
			System.out.println(a[i]);
		    a[i]=0;
			}
		}
	}
}
