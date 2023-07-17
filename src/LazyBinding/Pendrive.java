package LazyBinding;

public class Pendrive 
{
	String brand;
	int Strg;
	double price;
	String type;
	
	Pendrive()
	{
		//Default Constructer
	}
	
	Pendrive(String brand, int storage,double kimmat,String type)
	{
		this.brand=brand;
		this.Strg=storage;
		this.price=kimmat;
		this.type=type;
		
		System.out.println("PenDrive Has Been created!");
	}
	
	public void dispalyPendrive()
	{
		System.out.println("The Brand Is :"+brand);
		System.out.println("The Storage Of Pnedrive :"+Strg);
		System.out.println("The Kimmat Of Pendrive Is :"+price);
		System.out.println("the type of pendrive is :"+type);
	}

}
