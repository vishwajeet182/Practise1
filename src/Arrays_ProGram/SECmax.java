package Arrays_ProGram;
import java.util.Scanner;
public class SECmax 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Size of an Array :");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
		int secMax=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (max<a[i])
			{
				secMax=max;
				max=a[i];
				
			}
			else if(secMax<a[i] && max!=a[i])
			{
				secMax=a[i];
			}
		}
		System.out.println(max);
		System.out.println(secMax);
		
	}

}
