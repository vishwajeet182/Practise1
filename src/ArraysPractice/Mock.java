package ArraysPractice;
import java.util.Scanner;
public class Mock 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a element :");
		int size=sc.nextInt();
		
		int []a=new int [size];
		
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			{
				System.out.println();
			}
		}
	}
}
