package ArraysPractice;
import java.util.Scanner;
public class XylomNumber 
{
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a size of an Array :");
		int a[]=new int[sc.nextInt()];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			isXylom(a[i]);  //34326
		}
 }
 public static void isXylom(int n)
 {
	 int temp=n;
	 int temp1=temp;
	 int sumEX=0;
	 int sumMEAN=0;
	 int ct=count(n);
//	System.out.println(ct);
	int count=ct; 
	while(temp!=0)
	{
		 while(ct>0)
		 { 
			int rem=temp%10;
			 if(ct==1||count==ct)
			 {
				sumEX=sumEX+rem; 
//				System.out.println("Ex "+sumEX);
			 }
			 else
			 {
				sumMEAN=sumMEAN+rem; 
//				System.out.println("Mean "+sumMEAN);
			 }
			 temp/=10;
			 ct--;
		 }
	}
	 if(sumEX==sumMEAN)
	 {
		 System.out.println("The Given No IS a Xylom "+temp1);
	 }
	 else
	 {
		 System.out.println("The Given No is Pholem "+temp1);
	 }
	 
	 
 }
 public static int count(int num)
 {
	 int ct=0;
	 while(num>0)
	 {
		 num/=10;
		 ct++;
	 }
	 return ct;
 }
}
