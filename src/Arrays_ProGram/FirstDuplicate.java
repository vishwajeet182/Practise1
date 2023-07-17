package Arrays_ProGram;
import java.util.Iterator;
import java.util.Scanner;
public class FirstDuplicate 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter a size of an Array :");
		
		int [] a=new int[sc.nextInt()];
		
		for(int i=0;i<a.length;i++)
		{
		a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			int ct=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					ct++;
				}
			}
			if(ct>0)
			{
				System.out.println(a[i]);
		 
				return;
			}
			else
			{
				System.out.println("Thanks!");
			}
			
		}
	}
}
