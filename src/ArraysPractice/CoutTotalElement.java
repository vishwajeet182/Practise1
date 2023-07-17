package ArraysPractice;
import java.util.Scanner;
public class CoutTotalElement 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number of size of an Array ");
		int size =sc.nextInt();
		
		int []a=new int [size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int ct=0;
		for(int i=0;i<a.length;i++)
		{
			if(true)
			{
				ct++;
			}
		}
		System.out.println("The Total Count of an element is :"+ct);
	}
}
