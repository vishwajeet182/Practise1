package AssignArray;
import java.util.Scanner;
public class Q3 
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
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
//					a[j]=0;
				}
			}
			if(count>=2)
			{
				if(a[i]!=0)
				{
					System.out.println(a[i]);
					return;
				}
			}
		}
	}
}
