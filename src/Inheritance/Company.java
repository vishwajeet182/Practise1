package Inheritance;

public class Company 
{
	 String name;
	 String ceo;
	 String type;
	 double turnover;
	 String Loc;
	 
	 Company()
	 {
		 //Default Constructer
	 }
	 
	 Company(String name,String ceo,String type, double turnover,String loc)
	 {
		 this.name=name;
		 this.ceo=ceo;
		 this.type=type;
		 this.turnover=turnover;
		 this.Loc=loc;
		 
	 }
	 public void displayCompany()
	 {
		 System.out.println("Name of Company : "+name);
		 System.out.println("The Ceo Of Company : "+ceo);
		 System.out.println("The Type Of Company : "+type);
		 System.out.println("The Turnover Of Company : "+turnover);
		 System.out.println("The Location Of Company : "+Loc);
	 }

}
