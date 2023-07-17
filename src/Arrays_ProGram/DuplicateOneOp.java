package Arrays_ProGram;
import java.util.Scanner;
public class DuplicateOneOp 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter a Size Of An Array :");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.err.println("The Duplicate Number is in Array are as Below :");
		for(int i=0;i<a.length;i++)
		{
			int ct=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					ct++;
					a[j]=0;
				}
			}
			if(ct>0)
			{
				if(a[i]!=0)
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}
