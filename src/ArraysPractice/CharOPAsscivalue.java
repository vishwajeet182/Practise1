package ArraysPractice;
import java.util.Scanner;
public class CharOPAsscivalue 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Size of Arrey");
		int size=sc.nextInt();
		
		char []a=new char[size];
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("Enter a Charecter");
			a[i]=sc.next().charAt(0);
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print((int)a[i]+" ");
		}
	}
}
