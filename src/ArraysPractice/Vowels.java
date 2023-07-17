package ArraysPractice;
import java.util.Scanner;
public class Vowels {
public static void main(String[] args)
{
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter a size");
	int size=sc.nextInt();
	
	char [] c= new char[size];
	
	for(int i=0;i<=c.length-1;i++)
	{
		System.out.println("Enter a charecter ");
		c[i]=sc.next().charAt(0);
	}
	
	for(int i=0;i<=c.length-1;i++)
	{
		vowels(c[i]);
	}
	
	
}
public static char vowels(char ch)
{
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
	ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	{
		System.out.print(ch+" ");
	}
	return ch;
}
}
