package ArraysPractice;
//import java.util.Scanner;
public class Occurance
{
	public static void main(String[] args)
	{
		int []a= {1,2,3,4,5,2,1,3,3,2,1,3,23,4,2,1,2,3};
		
		int freq[]=new int[a.length];
		
		for (int i = 0; i < freq.length; i++) {
			int ct=1;
			for (int j = i+1; j < freq.length; j++) {
				if (a[i]==a[j])
				{
				ct++;
				freq[j]=-1;
				}
			}
			if (freq[i]!=-1)
			{
			freq[i]=ct;	
			}
		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[i]!=-1)
			{
				System.out.println("The occurance of "+a[i]+" is "+freq[i]);
			}
		}
	}
}

