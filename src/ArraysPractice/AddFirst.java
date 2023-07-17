package ArraysPractice;
import java.util.Scanner;
public class AddFirst  
{
	
public static void main(String[] args) 
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Eneter a number a size of an array :");
	int size=sc.nextInt();
	
	int a[]=new int [size];
	
	System.out.println("Enter a "+size+" element in array");
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	int b[]=new int[a.length+1];
	System.out.println("add The extra Element in the Array :");
	for (int i = 0; i<b.length-a.length; i++)
	{
		b[i]=sc.nextInt();
	}
//a[0]=b[1];
	for (int i=0; i <b.length-1; i++) 
	{
		b[i+1]=a[i];
	}
	
	for (int i = 0; i <b.length; i++) 
	{
		System.out.println(b[i]);
	}
 }
}
