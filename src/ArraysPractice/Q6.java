package ArraysPractice;
import java.util.Scanner;
public class Q6
{
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter asize of an Array :");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("The Duplicate ");
		for(int i=0;i<a.length;i++)
		{
			int ct=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					ct++;
//					a[i]=0;
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
