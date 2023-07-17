package Arrays_ProGram;
import java.util.Iterator;
import java.util.Scanner;
public class OccuranceOfArray 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
          int []a= {2,0,2,9,7,4,2,7,8,6,5,4,7,9,8,3,2,4,5,1,0,1,2,6,8,0,1,2};
//		int []a=new int[sc.nextInt()];
          
          int [] freq=new int [a.length];
          
          for(int i=0;i<freq.length;i++)
          {
        	  int ct=1;
        	 for (int j = i+1; j < freq.length; j++)
        	 {
				if (a[i]==a[j])
				{
					ct++;
//					a[j]=0;
					freq[j]=-1;
				}
			}
        	 if (freq[i]!=-1) 
        	 {
        		 freq[i]=ct;
			 }
          }
          for (int i = 0; i < freq.length; i++)
          {
        	  if(freq[i]!=-1)
        	  {
        		  System.out.println("The Occurance Of An Number "+a[i]+" is "+freq[i]);
        	  }
	   	  }
          
	}
}
