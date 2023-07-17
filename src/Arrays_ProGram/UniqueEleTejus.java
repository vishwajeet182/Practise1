package Arrays_ProGram;

//import javax.swing.plaf.FontUIResource;

public class UniqueEleTejus
{
		public static void main(String[] args) {
					      int a[]={1,2,3,4,5,6,7,8,8,9,0,2,3,1,5,0,-1,-1};
			      int freq[]=new int[a.length];
			      for (int i = 0; i < freq.length; i++) {
					int ct=0;
					for (int j = i+1; j < freq.length; j++) {
						if(a[i]==a[j])
						{
							ct++;
							freq[j]=-1;
						}
						
					}
					if(freq[i]!=-1)
					{
						freq[i]=ct;	
					}
				}
//			      System.out.println("The Unique Elements  Are :");
//			      fr (int i = 0; i < freq.length; i++) {
//					if (freq[i]==0)
//					{
//						System.out.println(a[i]);
//					}
//				}
			      
			      int negcount=0;
			      for (int i = 0; i < freq.length; i++) {
					if (freq[i]==-1)
					{
					negcount++;	
					}
				}
			      int []unique=new int[freq.length-negcount];
			      
			      for (int i = 0,j=0; i < unique.length; i++) 
			      {
					if (freq[i]!=-1)
					{
						unique[j]=a[i];
						j++;
					}
			      }
			      System.out.println("The Unique Elemrnt are :");
			      for (int i = 0; i < unique.length; i++) {
					System.out.print(unique[i]+",");
				}
			       
     }
}
