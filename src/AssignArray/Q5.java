package AssignArray;
import java.util.Scanner;
public class Q5 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);	
	     System.out.println("Enter a size of an Array :");
	     int size=sc.nextInt();
	     
	     
	     int a[]=new int[size];
	     
	     for(int i=0;i<a.length;i++)
	     {
	    	 a[i]=sc.nextInt(); 
	     }
	     
	     for(int i=0;i<a.length;i++)
	     {
	    	 int count=1;
	    	 for(int j=i+1;j<a.length;j++)
	    	 {
	    		if(a[i]==a[j])
	    		{
	    			count++;
	    			a[j]=0;
	    		}
	    	 }
	    	 if(count>0)
	    	 {
	    		 if(a[i]!=0)
	    		 {
	    			 System.out.println("The count "+a[i]+"= "+count); 
	    		 }
	    		
	    	 }
	     }
	}
}
