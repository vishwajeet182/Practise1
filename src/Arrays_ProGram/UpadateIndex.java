package Arrays_ProGram;
import java.util.Scanner;
public class UpadateIndex {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a size of an array :");
	int size=sc.nextInt();
	
	int []a=new int [size];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	
	System.out.println("Enter a index");
	
	int index=sc.nextInt();
	
	if(index>=0&&index<a.length)
	{
		System.out.println("Enter a data into an array");
		a[index]=sc.nextInt();
		System.out.println("DATA UPDATED!");
	}
	else
	{
		System.out.println("DATa IS NOT UPDATED!");
	}
	System.out.println(a[index]+"  ");
}
}
