package ArraysPractice;
import java.util.Scanner;
public class CopyOneIntoAnother 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a number of an Array :");
	
	int size=sc.nextInt();
	
	int a[]=new int[size];
	
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	int b[]=new int[size];
	
	for (int i = 0; i < b.length; i++) 
	{
		b[i]=a[i];
	}
	for (int i = 0; i < a.length; i++) {

		System.out.println(b[i]);
	}
	
}
}
