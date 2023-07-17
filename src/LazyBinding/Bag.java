package LazyBinding;

public class Bag extends Pen
{
	String Company;
	String Type;
	String Color;
	double Price;
	Book b;
	Book b1;
	
	Bag()
	{
		//Default Constucter
	}
	
	Bag(String company,String type,String color,double price)
	{
		this.Company=company;
		this.Type=type;
		this.Color=color;
		this.Price=price;
		System.out.println("The Bag Is ready !");
	}
	
	public void addBook()
	{
		b=new Book("Navneet","Plain",200,60.00,200.00);
		b1=new Book("Classmate","Writing",400,60.87,87.08 );
		System.out.println("The Book Added Into The Bag");
	}
	
	public void insertPen(String Brand,String type)
	{
		Pen p1=new Pen(Brand,type);
		System.out.println("Pen Inserted Into The Bag");
	}
	
	public void displayBag()
	{
		System.out.println("Company: "+Company);
		System.out.println("The Type of bag Is :"+Type);
		System.out.println("The Color Of bag Is :"+Color);
		System.out.println("The Price that Bag IS :"+Price);
		
	}
}
