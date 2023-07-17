package Arrays_ProGram;
import java.util.Scanner;
public class Consonent//Count of an Vowels
{
public static void main(String[] args)
 {
Scanner sc=new Scanner(System.in);
System.out.println("Enter A size of Array");
 char []a=new char[sc.nextInt()];
 
 for(int i=0;i<a.length;i++)
 {
	 a[i]=sc.next().charAt(0);
 }
 int ct=0;
 for(int i=0;i<a.length;i++)
 {
	 if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||
				a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
	 {
		 ct++;
	 }
 }
 System.out.println("The count of an vowels is : "+ct);
}
}
