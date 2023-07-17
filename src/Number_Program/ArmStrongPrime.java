package Number_Program;
import java.util.Scanner;
public class ArmStrongPrime
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Nubmer : ");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		int ct=count(num);
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+pow(rem,ct);
			num/=10;
		}
		if(sum==temp)
		{
			
			if(checkPrime(temp))
			{
				System.out.println("it is An ArmStrong prime Number");
			}
			else
			{
				System.out.println("It is An Not Armstrong prime  numbre");
			}
		}
		else
		{
			System.out.println("It is Not an Armstrong number");
		}
	}
	
	public static int count(int n)
	{
		int ct=0;
		while(n!=0)
		{
			n/=10;
			ct++;
		}
		return ct;
	}
	
	public static int pow(int base,int raise)
	{
		int power=1;
		for(int i=0;i<raise;i++)
		{
			power=power*base;
		}
		return power;
	}
	
	public static boolean checkPrime(int n)
	{
		int i=1;
	
			for(i=2;i<n;i++)
			{
				if(n%i==0)
				{
					break;
				}
			}
			if(n==i)
			{
				return true;
			}
			return false;
			
	}
}