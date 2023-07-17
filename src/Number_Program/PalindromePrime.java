package Number_Program;
import java.util.Scanner;
public class PalindromePrime 
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num=sc.nextInt();
		int temp=num;
		int ct=ArmStrongPrime.count(num);
		int sum=0;
		for(int i=1;i<=ct;i++)
		{
		while(num!=0)
		{			
		    int rem=num%10;
            sum=sum*10+rem;
			num/=10;
		}
		}
//		System.out.println("Sum :"+sum);
		if(sum==temp)
		{
			if(ArmStrongPrime.checkPrime(temp))
			{
				System.out.println("It Is An Palindrome Prime");
			}
			else
			{
				System.out.println("it is Only palindrome");
			}
		}
		else
		{
			System.out.println("It is not an Palindrome number");
		}
	}
}
