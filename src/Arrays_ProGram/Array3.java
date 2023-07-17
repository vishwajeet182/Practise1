package Arrays_ProGram;
import java.util.Scanner;
public class Array3 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Size :");
    int size=sc.nextInt();
    
    int [] a=new int [size];
    
    for(int i=0;i<=a.length-1;i++)
    {
    	System.out.println("Enter a "+(i+1)+" data");
    	a[i]=sc.nextInt();
    }
    for(int i=0;i<=a.length-1;i++)
    {
    	
    	System.out.print(a[i]+" ");
    }
}
}
