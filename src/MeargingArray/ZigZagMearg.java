package MeargingArray;
import java.util.Scanner;
public class ZigZagMearg 
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a size of Array A  : ");
		int sizeA=sc.nextInt();
		
		int []a=new int[sizeA];
		
		System.out.println("Add data into the Arrray A:");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter a size of an Array B :");
		int sizeB=sc.nextInt();
		
		int []b=new int[sizeB];
		
		System.out.println("add the Data into the Arrray B :");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		int []c=new int[a.length+b.length];
		int index=0;
		int length=0;
		if(a.length>b.length)
		{
			length=a.length;
		}
		else
		{
			length=b.length;
		}
		
		for(int i=0;i<length;i++)
		{
			if(i<a.length)
			{
				c[index++]=a[i];
			}
			if(i<b.length)
			{
				c[index++]=b[i];
			}
		}
		System.out.print("Mo.No : +91-");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+"");
		}
	}
}
