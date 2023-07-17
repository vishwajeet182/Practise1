package Number_Program;
import java.util.Scanner;

public class TechNo
{

	public static int count(int n)
	{ 
		int ct=0;
	while(n>0)
	{
		n=n/10;
		ct++;
	}
	return ct;
	}
	
	
public static int reminder(int n)
{
	int sum=0;
	int sum1=0;
	int sum2=0;
	int sum3=0;
	for(int i=1;i<=count(n);i++)
	{
		int rem=0;
		int rem1=0;
		if(i<=count(n)/2)
		{
			rem=n/10;
			sum1=sum1*10+rem;
			
		}
		else
		{
			rem1=n%10;
			sum2=sum2*10+rem1;
		}
		
		if(sum2>0)
		{
			int rem2=sum2%10;
			sum3=rem2*10+rem2;
			sum2/=10;
		}
	}
	sum=sum1+sum3;
	return sum;
}
public static int squere(int n1)
{
	int s=n1*n1;
	return s;
	
}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number :");
	int n=sc.nextInt();

	int rem=reminder(n);
	int sq=squere(rem);
	if(sq==n)
	{
		System.out.println("This Is a tech number");
	}
	else
	{
		System.out.println("This Is not an Tech Number");
	}
	
}
}
