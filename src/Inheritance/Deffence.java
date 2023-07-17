package Inheritance;

public class Deffence 
{
	 String HeadCommand="Precident-Of-India";
	 String CDSGenral="Bipin-Rawat";
	 double Budget=20000000000.00;
	 
	 public Deffence()
	 {
		 //Default Constructer
	 }
	 
	 public Deffence(String HeadCommand,String CDSGenral,double Budget)
	 {
		this.HeadCommand=HeadCommand;
		this.CDSGenral=CDSGenral;
		this.Budget=Budget;
	 }
	 
	 public void displayDeffence()
	 {
		 System.out.println("The Head Command Of All defence : "+HeadCommand);
		 System.out.println("The CDS Genral Of all The deffence is : "+CDSGenral);
		 System.out.println("The Total budget For Deffence Sector : "+Budget);
		 System.out.println("**===Deffence===**");
	 }
}
