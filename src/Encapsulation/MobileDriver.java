package Encapsulation;

public class MobileDriver
{
	 public static void main(String[] args) 
	  {
		 Mobile m1=new Mobile("SamSung" , 13000.00 , 256 , 6 ,"Sky-Blue");
		 
		 
		 System.out.println("===***===");
		 
		 m1.b1.displayBattery();
		 System.out.println("This Is Mobile BluePrint");
		 m1.displayMobile();
		 
		 
		 
		 
		 
	   }
}
