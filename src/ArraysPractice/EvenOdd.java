package ArraysPractice;
import java.util.Scanner;

public class EvenOdd
{
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number of size");
	
	int size=sc.nextInt();
	
	int []a=new int[size];
	
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.println("Enter a element");
		a[i]=sc.nextInt();
	}
	
	for(int i=0;i<=a.length-1;i++)
	{
		if(a[i]%2==0)
		{
			squere(a[i]);
		}
		else
		{
			cube(a[i]);
		}
	}
}

public static int squere(int a)
{
	int squ=1;
	squ=a*a;
	System.out.print(squ+" ");
	return squ;
}

public static int cube(int a)
{
	int cube=1;
	cube=a*a*a;
	System.out.print(cube+" ");
	return cube;
}

}
