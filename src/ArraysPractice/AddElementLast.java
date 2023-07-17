package ArraysPractice;
import java.util.Scanner;
public class AddElementLast
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter a size of an array ");
		
		int size=sc.nextInt();
		
		int []a=new int[size];
		
		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		int last=a.length;
		
		int b[]=new int[a.length+1];
		
		for(int i=0;i<b.length-1;i++)
		{
			b[i]=a[i];
		}
		
		System.out.println("add element at last :");
		for(int i=last;i<b.length;i++)
		{	
		b[i]=sc.nextInt();
		}
		
	for (int i = 0; i<b.length; i++) 
	{
		System.out.println(b[i]);
	}
	
}
}
