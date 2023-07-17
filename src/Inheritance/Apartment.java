package Inheritance;

public class Apartment
{
	String name;
	int noofflat;
	int floor;
	double TotalCost;
	
	
	Apartment()
	{
		
	}
	
	Apartment(String name, int flat,int floor, double cost)
	{
		this.name=name;
		this.noofflat=flat;
		this.floor=floor;
		this.TotalCost=cost;
		
	}
	
	public void displayApartment()
	{
		System.out.println("The Name Of Apratment :"+name);
		System.out.println("The no of The flat : "+noofflat);
		System.out.println("The Floor Of Apartment : "+floor);
		System.out.println("The total Cost of Apartment :"+TotalCost);
	}
	
}
