package Arrays_ProGram;
import java.util.Scanner;
public class SortingArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Size of ann array :");
	int size=sc.nextInt();
	
	int []a=new int[size];
	
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++)
		{
			if(a[i]<a[j])
			{
				int swap=a[i];
				a[i]=a[j];
				a[j]=swap;
			}
		}
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]+ " " );
	}
}
}
