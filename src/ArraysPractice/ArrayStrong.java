package ArraysPractice;
import java.util.Scanner;
public class ArrayStrong 
{
 public static void isStrong(int num)
 {
	 int temp=num;
	 int sum=0;
	 
	 while(num>0)
	 {
		 int rem=num%10;
		 
		 sum=sum+factorial(rem);
		 num/=10;
		 
	 }
	 if(temp==sum)
	 {
		System.out.println("the no is "+temp); 
	 }
 }
 public static int factorial(int n)
 {
	 int fact=1;
	 for(int i=1;i<=n;i++)
	 {
		fact=fact*i; 
	 }
	 return fact;
 }
 public static void main(String[] args) 
 {
	 Scanner sc=new Scanner(System.in);
		System.out.println("Enetr a size of array");
		int a[]=new int[sc.nextInt()];
		
			for(int i=0;i<a.length;i++)
			{
			a[i]=sc.nextInt();	
			}
			for(int i=0;i<a.length;i++)
			{
				isStrong(a[i]);//1 2 145 40585
			}
 }
}
