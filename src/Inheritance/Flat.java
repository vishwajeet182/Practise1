package Inheritance;

public class Flat extends Apartment
{
	String fName;
	int faltNo;
	int ffloor;
	double cost;
	
	Flat()
	{
		//default Constructer
	}
	
	Flat(String name, int flat,int floor, double cost,String fname,int flatNo,int ffloor,double Cost)
	{
		this.name=name;
		this.noofflat=flat;
		this.floor=floor;
		this.TotalCost=cost;
		this.fName=fname;
		this.faltNo=flatNo;
		this.ffloor=ffloor;
		this.cost=Cost;
	}
	public void displayFlat()
	{
		System.out.println("The Name Of Apratment :"+name);
		System.out.println("The no of The flat : "+noofflat);
		System.out.println("The Floor Of Apartment : "+floor);
		System.out.println("The total Cost of Apartment :"+TotalCost);
		System.out.println(" The Falt Name : "+fName);
		System.out.println("The falt No Of flat : "+faltNo);
		System.out.println("the Floor Number of flat : "+ffloor);
		System.out.println("The cost Of Single falt : "+cost);
	}

}
