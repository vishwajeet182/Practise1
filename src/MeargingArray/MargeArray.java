package MeargingArray;
import java.util.Scanner;
public class MargeArray 
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter a size of array A:");
		int sizeA=sc.nextInt();
		int [] a=new int [sizeA];
		System.out.println("Enetr a "+sizeA+" Element in a array ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enetr a size of array B :");
		int sizeB=sc.nextInt();
		int []b=new int[sizeB];
		System.out.println("Enetr a "+sizeB+" Element in a array ");
		for(int i=0;i<a.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		int []c=new int[a.length+b.length];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			c[index++]=a[i];
		}		
		for(int i=0;i<b.length;i++)
		{
			c[index++]=b[i];
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+ " ");
		}
		
	}
}
