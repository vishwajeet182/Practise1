package Arrays_ProGram;
import java.util.Scanner;
public class ArreyFloat 
{
public static void main(String[] args) 
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter a size");
 int size=sc.nextInt();
 
 float []a=new float[size];
 
 
 for(int i=0;i<=a.length-1;i++)
 {
	  System.out.println("Enter a data");
      a[i]=sc.nextFloat();
 }
 
 
 for(int i=0;i<=a.length-1;i++)
 {
	 System.out.println((int)a[i]);
 }
}
}
