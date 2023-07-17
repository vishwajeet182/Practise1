package ArraysPractice;
import java.util.Scanner;
public class ArmstrongNo
{
	static Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	public static void isArmStrong(int num)
	{
		int temp=num;
//		System.out.println(temp);
	   	int sum=0;
	   while(num!=0)
	   {
		   int rem=num%10;
		   sum=sum+pow(rem,count(temp));
		   num/=10;
		   
	   }
	   System.out.println(sum);
	   if(sum==temp)
	   {
		 System.out.println("no is a Armstrong no :"+temp);  
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
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a size of an Array :");
	int a[]=new int[sc.nextInt()];
	
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
		isArmStrong(a[i]);  //1634 9774
	}
	}
}
