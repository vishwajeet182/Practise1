package ArraysPractice;
import java.util.Scanner;
public class Consonents 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a size of Array");	
	int size=sc.nextInt();
	
	char [] a=new char[size];
	
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.println("Enter a Charecter :");
		a[i]=sc.next().charAt(0);
	}
//	int ctvowels=0;
//	int ctcon=0;
	for(int i=0;i<=a.length-1;i++)
	{
		if(!(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||
				a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'))
		{
			System.out.println(a[i]);

		}

//		System.out.print(a[i]+" ");	
	}


	}

	
}
