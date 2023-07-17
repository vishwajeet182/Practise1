package ArraysPractice;
import java.util.Scanner;
public class SecondLargest 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a szie of an array :");
		int size=sc.nextInt();
		
		int []a=new int [size];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0];
		int ct=0;
		int secMax=0;
		for (int i = 0; i < a.length; i++) {
			
			if(max<a[i])
			{
//				max=a[i];
				if(i==a.length-2)
				{
					secMax=a[i];	
				}
				
			}
		}
//System.out.println("The Maximum No Is :");		
//System.out.println(max);
         System.out.println("2nd Max No :");
		 System.out.println(secMax);
		
		
		
	}
}
