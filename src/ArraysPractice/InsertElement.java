package ArraysPractice;
import java.util.Scanner;
public class InsertElement 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a size of array :");
		
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int b[]=new int[a.length+1];
		
		
		System.out.println("Enter a location ");
		int loc=sc.nextInt();
		System.out.println("enter a element ");
		
		
		for(int i=0;i<b.length-1;i++)
		{
			if(loc==i)
			{
			b[loc]=sc.nextInt();
			}
			else
			{
				b[i]=a[i];
			}
		}
		
		for(int i=0;i<b.length;i++)
		{
			if(i==loc)
			{
				System.out.println(b[loc]);
			}
			else
			{
				System.out.print(b[i]+" ");
			}
		}
		
	}
}
