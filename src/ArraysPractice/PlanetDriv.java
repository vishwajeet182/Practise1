package ArraysPractice;

public class PlanetDriv
{
	public static void main(String[] args) {
		Planet p1[]=new Planet[6];
		
		p1[0]=new Planet("Maercury",null,0,false);
		
		p1[1]=new Planet("Venus", new String [] {"Co2","N2"}, 0, false);
		
		p1[2]=new Planet("Earth", new String [] {"O2","N2"}, 1, false);
		
		p1[3]=new Planet("Jupiter",new String [] {"H2","He"},79,true);
		
		p1[4]=new Planet("Saturn",new String [] {"H2","He"}, 83 ,true );
		
		p1[5]=new Planet("Uranus",new String [] {"H2","He","CH4"}, 27 ,true);
			
		countMoon(p1);
		dominateGas(p1);
		
	}
	
	public static void countMoon( Planet []a)
	{
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]!=null)
			{
			 if (a[i].ring==true)
			 {
			sum+=a[i].moon;	
			}
			}
		}
		System.out.print("The Moon Of Palnet Which Has A ring : "+sum);
		System.out.println("");
	}
	
	public static void dominateGas( Planet []a)
	{
		int size=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i].atm!=null) 
			{
			size+=a[i].atm.length;	
			}
		}
//		System.out.println(size);
		
		String gas[]=new String[size];
		
		for (int i = 0,k=0; i < a.length; i++)
		{
			if (a[i].atm!=null)
			{
			for (int j = 0; j < a[i].atm.length; j++)
			{
//				if (a[i].atm!=null)
//				{
				gas[k]=a[i].atm[j];
				k++;
//				}
			}	
			}
		}
		
//		for (int i = 0; i < gas.length; i++) {
//		System.out.print(gas[i]+" ");
//		}
		int ct[]=new int[gas.length];
		
		for (int i = 0; i < gas.length; i++)
		{
			int count=1;
			for (int j = i+1; j < ct.length; j++) 
			{
			if (gas[i]==gas[j]) 
			{
				count++;
				ct[j]=-1;
			}	
			}
			if (ct[i]!=-1)
			{
			ct[i]=count;	
			}
		}
		
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < ct.length; i++) {
			if (ct[i]>max)
			{
			max=ct[i];	
			}
		}
		System.out.println("The Dominating Gas Is :");
		for (int i = 0; i < ct.length; i++) {
			if (ct[i]==max)
			{
				System.out.println(gas[i]);
			}
		}
	}
}
