package ArraysPractice;
import java.util.Scanner;
public class CharUnique 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Eneter a Size of An charecter size:");
	int size=sc.nextInt();
	
	char c[]=new char[size];
	for(int i=0;i<c.length;i++)
	{
		c[i]=sc.next().charAt(0);
	}
	for(int i=0;i<c.length;i++)
	{
		int ctt=0;
		int ct=0;
		
		for(int j=i+1;j<c.length;j++) 
		
		{
			if(c[i]==c[j])
			{
				ct++;
				ctt=ct;
			}
		}
		if(ctt==0)
		{
			System.out.println(c[i]);
		}
	}
}
}
