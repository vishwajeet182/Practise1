package AssignArray;
import java.util.Scanner;
public class Q6 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number size :");
		
		int size=sc.nextInt();
	    
		char []a=new char[size];
		
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=sc.next().charAt(0);
		}
		System.out.println("The Unique Element Are:");
		for(int i=0;i<a.length;i++)	
		{
			int ct=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					ct++;
					a[j]=0;
				}
			}
			if(ct==0)
			{
				if(a[i]!=0)
				{
					System.out.println(a[i]);
					return;
				}
			}
		}
	}
}
