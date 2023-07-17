package AssignArray;
import java.util.Scanner;
public class Q9 
{
   

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a Size of an array ");
	
	int size=sc.nextInt();
	
	char a[]=new char[size];
	
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.next().charAt(0);
	}
	
	for(int i=0;i<a.length;i++)
	{
		int ct=1;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				ct++;
				a[j]=0;
			}
		}
		if(ct>1)
		{
			if(a[i]!=0)
			{
				System.out.println(a[i]);
			
			}
		}
			
	}
}
}