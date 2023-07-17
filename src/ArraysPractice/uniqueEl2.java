package ArraysPractice;
import java.util.Scanner;
public class uniqueEl2 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enetre a size of array ");
	
	int []a=new int[sc.nextInt()];
	
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	
	for(int i=0;i<a.length;i++)
	{
		int ct=0;
		for(int j=0;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				ct++;
			}
		}
		if(ct==1)
		{
			System.out.print(a[i]+" ");
		}
}
}
}
