package Arrays_ProGram;
import java.util.Scanner;
public class SmallestNo 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter a Array Size");
	int size=sc.nextInt();
	int []a=new int[size];
	
	for(int i=0;i<a.length;i++)
	{
		
		a[i]=sc.nextInt();	
		
	}
	int small=a[0];
	for(int i=0;i<a.length;i++)//a[0]
	{
	
			if(small>a[i])
			{
				small=a[i];
			}
	}
	System.out.println(small);
    }
}



