package Number_Program;
import java.util.Scanner;

public class CalCulator
{ 
 static Scanner sc=new Scanner(System.in);
	  
	 
	 static double res;
	public static void main(String[] args) 
	{
		 
		System.out.println("Enter a Number :");
		res=sc.nextDouble();
		for(int i=0; ;i++)
		{
		
			if(true)
			{
				System.out.println("Calculator Operation : \n 1.Add \n 2.Sub \n 3.multiplication \n 4.Division \n 5.Total");
				int ope=sc.nextInt();
		 		if(ope<=4)
				{
				switch(ope)
				{
				case 1:
				{
					displayAdd(sc.nextDouble());
					break;
				}
				case 2:
				{
					displaySub(sc.nextDouble());
					break;
				}
				case 3:
				{
					displayMul(sc.nextDouble());
					break;
				}
				case 4:
				{
					displayDiv(sc.nextDouble());
					break;
				}
				}
				}
				else
				{
					System.out.println("Toatal = "+res);
					System.out.println("===Stop==");
					break;
				}
			}

		}	
		
	}
	public static void displayAdd(double d)
	{
		res+=d;
		System.out.println("The Addition is :"+res);
		for(int i=0; ; i++)
		{
		 System.out.println("Do You Want to add one more time ");
		 boolean a=sc.nextBoolean();
		 if(a)
		 {
			 System.out.println("Enter A New Number :");
			 double d3=sc.nextDouble();
			 res+=d3;
			 System.out.println("The Addition is :"+res);
			 continue;
		 }
		 else
		 {
			 System.out.println("The Final Ans is : "+res);
//			System.out.println("*==Stop==*");
			 break;
		 }
		}
	}
	public static void displaySub(double d)
	{
		res-=d;
		System.out.println("The Substraction is :"+res);
		for(int i=0; ; i++)
		{
		 System.out.println("Do You Want to Substract one more time ");
		 boolean a=sc.nextBoolean();
		 if(a)
		 {
			 System.out.println("Enter A New Number :");
			 double d3=sc.nextDouble();
			 res-=d3;
			 System.out.println("The Substraction is :"+res);
			 continue;
		 }
		 else
		 {
			 System.out.println("The Final Ans is : "+res);
			 System.out.println("===End===");
			 break;
		 }
		}
	}
	public static void displayMul(double d)
	{
		
		res*=d;
		System.out.println("The Multiplication is :"+res);
		for(int i=0; ; i++)
		{
		 System.out.println("Do You Want to Multiply one more time ");
		 boolean a=sc.nextBoolean();
		 if(a)
		 {
			 System.out.println("Enter A New Number :");
			 double d3=sc.nextDouble();
			 res*=d3;
			 System.out.println("The Multiplication is :"+res);
			 continue;
		 }
		 else
		 {
			 System.out.println("The Final Ans is : "+res);
			
			 break;
		 }
		}
	}
	public static void displayDiv(double d)
	{
		
		res/=d;
		System.out.println("The Division is :"+res);
		for(int i=0; ; i++)
		{
		 System.out.println("Do You Want to Divide one more time ");
		 boolean a=sc.nextBoolean();
		 if(a)
		 {
			 System.out.println("Enter A New Number :");
			 double d3=sc.nextDouble();
			 res/=d3;
			 System.out.println("The Division is :"+res);
			 continue;
		 }
		 else
		 {
			 System.out.println("The Final Ans is : "+res);
			 break;
		 }
		}
	}
}
