package Arrays_ProGram;
import java.util.Scanner;
public class ZigZagArray 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter a size of Array A ");
		int sizeA=sc.nextInt();
		
		int a[]=new int[sizeA];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter a size of array B" );
		int sizeB=sc.nextInt();
		int b[]=new int[sizeB];
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		int c[]=new int[a.length+b.length];
		
		int length=0;
		int index=0;
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
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		
	}
}
