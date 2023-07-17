package Arrays_ProGram;
import java.util.Scanner;
public class Array2 
{
	public static void main(String [] args)
	{
    Scanner sc=new Scanner (System.in);
    
    System.out.println("Enter a number of size");
    int size=sc.nextInt();
    
    int []a=new int[size];
    
    System.out.println("Enter a data ");
    a[0]=sc.nextInt();
    System.out.println("Enter A data");
    a[1]=sc.nextInt();
    System.out.println("Enter A data");
    a[2]=sc.nextInt();
    System.out.println("Enter A data");
    a[3]=sc.nextInt();
    
    
    System.out.print(a[0]+" ");
    System.out.print(a[1]+" ");
    System.out.print(a[2]+" ");
    System.out.println(a[3]+" ");
 }
}
