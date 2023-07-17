package earlyBinding;

public class Marker 
{
	double price;
	String Company;
	Ink i1=new Ink("Liquid","Blue");
	
	Marker()
	{
		//default Construcetr
	}
	
	Marker(double price,String Company)
	{
		this.Company=Company;
		this.price=price;
	}
	
	public void dispalyMarker()
	{
		System.out.println("Company of Marker is :"+Company);
		System.out.println("The Price Of marker Is :"+price);
	}

}
