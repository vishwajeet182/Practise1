package ArraysPractice;
import java.util.Scanner;
public class CountofOdd
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Size of Array");
		int size=sc.nextInt();
		
		int []a=new int[size];
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print("Enter a element : ");
			a[i]=sc.nextInt();
//			System.out.println();
			
		}
    	
	    int cto=0;
	    int cte=0;
	    for(int i=0;i<=a.length-1;i++)
	    {
	    	if(a[i]%2!=0||a[i]!=0)
	    	{
	    		cto++;
	    	}
	    	else
	    	{
	    		cte++;
	    	}
	    		
	    }
	    System.out.println("The Count of Oddd No In The Array is :"+cto);
	    System.out.println("The Count of even No In The Array is :"+cte);
	}
}
