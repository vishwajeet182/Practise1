package ArraysPractice;
import java.util.Scanner;
public class ReverseArray {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("entere asize of an elment :");
	int size=sc.nextInt();
	
	int []a=new int [size];
	
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	
	for (int i = a.length-1; i>=a[0]; i--) 
	{

		System.out.println(a[i]);
		
	}
	System.out.println(a[0]);
	
}
}
