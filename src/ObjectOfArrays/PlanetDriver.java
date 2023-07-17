package ObjectOfArrays;

import Arrays_ProGram.SqlLDataBase;

public class PlanetDriver
{
	public static void main(String[] args) {
	 	Planet []p1=new Planet[6];
		
		p1[0]=new Planet("Mercury", null, 0, false);
		
		p1[1]=new Planet("Venus",new String []{"Co2","N2"}, 0, false);
		
		p1[2]=new Planet("Earth",new String [] {"O2","N2"},1,false);
		
		p1[3]=new Planet("Jupiter",new String [] {"H2","He"},79, true);
		
		p1[4]=new Planet("Saturn",new String [] {"H2","He"},83,true);
		
		p1[5]=new Planet("Uranus", new String [] {"H2","He"}, 27, true);
		
		// Print The reffareance of an Array
//		for (int i = 0; i < p1.length; i++) {
//			System.out.println(p1[i]);
//		}
//		
		System.out.println("The Count OF Moon of palnet Has A Ring :"+countMoon(p1));
		dominentGas(p1);
	}
	
	public static int countMoon( Planet p1 [])
	{
		int sum=0;
		for (int i = 0; i < p1.length; i++) {
			if (p1[i].ring==true)
			{
				sum+=p1[i].moon;	
			}
		}
		return sum;
	}
	
	public static void dominentGas(Planet []a)
	{
		int size=0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i].atm!=null)
			{
				size+=a[i].atm.length;    //Extract The Size Of New Array
			}
		}
		
		String gas[]=new String[size];  //Created The Array Gas Which Stored With Default Value
		
		for (int i = 0,k=0; i < a.length; i++)
		{
			if (a[i].atm!=null)
			{
				for (int j = 0; j < a[i].atm.length; j++) 
				{
					gas[k]=a[i].atm[j]; // Assigning Gases From Object Array Of All The planets into Single Array Called K
					k++;
				}	
			}
			
		}
		int ct []=new int[gas.length];
		
		for (int i = 0; i < gas.length; i++) {
			int count=1;
			for (int j = i+1; j < gas.length; j++)
			{
				if (gas[i].equals(gas[j]))  //We Used Here Equals Method From Object class To Compair Attributes 
				{
					count++;
					
					ct[j]=-1;
				}
			}
			if(ct[i]!=-1)
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
		System.out.println("The Dominent Gasses Are");
	       for (int i = 0; i < ct.length; i++) {
		if (ct[i]==max)
		{
			System.out.println(gas[i]);
		}
	}
	}
	
}
  