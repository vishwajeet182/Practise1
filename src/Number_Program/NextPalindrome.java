package Number_Program;
import java.util.Scanner;
public class NextPalindrome
{
	 public static int reverse(int n)
	  {
		 int sum=0;
		  while(n>0)
		  {
			 int rem=n%10;
			 sum=sum*10+rem;
		  }
		  return sum;
	  } 
	 public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a Numebr : ");
	    int n=sc.nextInt();
	    while(n!=0)
	    {
	    for(int i=n; ;i++)
	    {
	    	int n1=i;
	    	if(reverse(n)==n1)
	    	{
	    		System.out.println(n1);
	    		System.exit(0);
	    	}
	    	
	      }
	    
	    }
	 }
}
