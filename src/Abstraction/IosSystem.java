package Abstraction;
import java.util.Scanner;

public class IosSystem extends HpComputer
{
	static Scanner sc=new Scanner(System.in);
	@Override
    public void calculator()
  {
	 double res;
	 System.out.println("Choose A Option A Operation you Want to Perform");
	 System.out.println("1. Addition"+ " /n  "+"2.SubStraction "+ " /n  "+  "3.Multiplication"+ " /n  "+  "4.Division   "+ " /n  "+"5.Percentage");
	 int ope=sc.nextInt();
	 switch(ope)
	 {
	 case 1:
	 {
		 System.out.println("Enter a first number");
		 double i1=sc.nextDouble();
		 System.out.println("Enter a Second Number");
		 double i2=sc.nextDouble();
		res=i1+i2; 
		System.out.println("The Addition of numebr is : "+res);
		break;
		

	 }
	 
	 case 2:
	 {
		 System.out.println("Enter a first number");
		 double i1=sc.nextDouble();
		 System.out.println("Enter a Second Number");
		 double i2=sc.nextDouble();
		res=i1-i2; 
		System.out.println("The Substraction of number is : "+res);
		break;
		
	 }
	 case 3:
	 {
		 System.out.println("Enter a first number");
		 double i1=sc.nextDouble();
		 System.out.println("Enter a Second Number");
		 double i2=sc.nextDouble();
		res=i1*i2; 
		
		System.out.println("The multiplictaion of number is :"+res);
		break;
		
	 }
	 case 4:
	 {
		 System.out.println("Enter a first number");
		 double i1=sc.nextDouble();
		 System.out.println("Enter a Second Number");
		 double i2=sc.nextDouble();
		res=i1/i2; 
	   System.out.println("the Division of number is  : "+res);
	   break;
	 }
	 case 5:
	 {
		 System.out.println("Enter a first number");
		 double i1=sc.nextDouble();
		 System.out.println("Enter a Second Number");
		 double i2=sc.nextDouble();
		res=i1%i2; 
		System.out.println("The Percentage of number is  : "+res);
		break;
	 }
	 }
	 
  }
}
