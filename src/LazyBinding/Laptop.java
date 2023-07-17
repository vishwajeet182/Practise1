package LazyBinding;

public class Laptop
{
	String Company;
	int Ram;
	int Hd;
	String Color;
	double Amt;
	Pendrive p;
	Pendrive p1;
	
	Laptop()
	{
		//Default Constructer
	}
	
	Laptop(String company,int ram, int hd, String color, double amt)
	{
		this.Company=company;
		this.Ram=ram;
		this.Hd=hd;
		this.Color=color;
		this.Amt=amt;
		
		System.out.println("Lap-Top Has been Created!");
	}
	
	public void insertPendrive(String brand,int storage,double kimmat,String type)
	{
		p = new Pendrive(brand,storage,kimmat,type);
		p1=new Pendrive(brand,storage,kimmat,type);
		System.out.println("Pendrive Inserted Into a LapTop!");
	}
	public void displayLaptop()
	{
		System.out.println("The Cmopnay :"+Company);
		System.out.println("The ram Is :"+Ram);
		System.out.println("The Color Is :"+Color);
		System.out.println("The Kimmat Is :"+Amt);
	}
	

}
