package Arrays_ProGram;
import java.util.Scanner;
public class BinarySort 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Size of an Array: ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j])
				{
					int swap=a[i];
					a[i]=a[j];
					a[j]=swap;
				}
			}
		}
//		for (int i = 0; i < a.length; i++) 
//		{
//		System.out.print(a[i]+" ");
//		}
		int b[]=new int [a.length];
		for(int i=0;i<b.length;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
			
		
		
	}
	
}
