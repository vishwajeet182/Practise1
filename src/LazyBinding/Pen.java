package LazyBinding;

public class Pen 
{
	String Brand;
	
	String type;
	
	public Pen()
	{
		//Default Constructer
	}
	
	public Pen(String Brand,String type)
	{
		this.Brand=Brand;
		this.type=type;
		
		System.out.println("Pen Is Set To Enter A bag");
	}
	public void displayPen(String Brand,String type)
	{
		System.out.println("The Brand Is "+Brand);
		System.out.println("The Type Of Pen Is "+type);
	}
}
