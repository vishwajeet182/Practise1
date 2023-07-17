package Arrays_ProGram;
import java.util.Scanner;
public class FloatToIntArrey
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);	
	 System.out.println("Enter a size of an Arrey");
	  
	 int size=sc.nextInt();
	 
	 float []a=new float[size];
	 
	 for(int i=0;i<=a.length-1;i++)
	 {
		 System.out.println("Enter a element in according to order");
		 a[i]=sc.nextFloat();
	 }
	 for(int i=0;i<=a.length-1;i++)
	 {
		 System.out.println((int)a[i]+" ");
	 }
	}
}
