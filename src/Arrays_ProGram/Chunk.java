package Arrays_ProGram;

public class Chunk
{
	public static void main(String[] args)
	{
		int []a= {17,13,16,9,10,12,25,23};
		
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++)
		{
			if (a[i]>max)
			{
			max=a[i]	;
			}
		}
//		System.out.println(max);
		
		for (int i = 0; i < a.length; i++)
		{
			int count=0;
			int ch []=new int[a.length-(a.length-i-1)];
			if (a[i]>a[i+1])
			{
				count++;
				ch[i]=a[i];
			}
			else if(a[i]==max)
			{
				count++;
				ch[i]=a[i];
			}
			else if(a[i]<a[i+1])
			{
				ch[i]=a[i];
				count++;
				continue;
				
				
			}
			else
			{
				count++;
				ch[i]=a[i];
			}
			System.out.println(count);
			
			for (int j = 0; j < ch.length; j++)
			{
				System.out.println(ch[i]);	
			}
				
		}
		
		
		
	}

}
