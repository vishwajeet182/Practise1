package Arrays_ProGram;
import java.util.Iterator;
import java.util.Scanner;
public class FoundElement 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a size of an array:");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		System.out.println("Eneter a element which you want find :");
		int box=sc.nextInt();
		
		for (int i = 0; i < a.length; i++) 
		{
			if(box==a[i])
			{
				System.out.println("the "+a[i]+" elment get found in an array ");
				return;
			}
			
		}
		System.out.println("Element not found :");
		
	}
}
