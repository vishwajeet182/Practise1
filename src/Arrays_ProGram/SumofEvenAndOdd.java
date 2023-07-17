package Arrays_ProGram;
import java.util.Scanner;
public class SumofEvenAndOdd 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a Size ");
	int []a=new int[sc.nextInt()] ;
	
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
		
	}
	int evsum=0;
	int odsum=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			evsum+=a[i];
		}
		else
		{
			odsum+=a[i];
		}
	}
	System.out.println("the sum of even no only "+evsum);
	System.out.println("The Sum of Oddd Numbers Only "+odsum);
}
}
