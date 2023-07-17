package Encapsulation;

public class Battery
{
 private int mah;
 private String Type;
 private String Company;
 private double price;
// Mobile m1=new Mobile("I-Phone", 10000.00 ,256 ,8,"black");


public Battery()
{
	//default 
}



public Battery(String Company,String type, int mah, double price)
{
	this.Company=Company;
	this.mah=mah;
	this.price=price;
	this.Type=type;
System.out.println("Battery created!");
}

public void displayBattery()
{
	System.out.println("MAH :"+mah );
	System.out.println("Type :"+Type);
	System.out.println("Company :"+Company);
	System.out.println("Price :"+price);
}
}
