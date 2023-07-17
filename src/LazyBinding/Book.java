package LazyBinding;

public class Book 
{
	int Pages;
	double Size;
	double price;
	String Company;
	String type;
	
	Book()
	{
		//default Constucter
	}
	
	Book(String Company,String type,int page,double prize,double size)
	{
		this.Company=Company;
		this.Pages=page;
		this.price=price;
		this.Size=size;
		this.type=type;
		
		System.out.println("The book Has Been Raedy IInsert Into Bag!");
		
	}
	
	public void displayBook()
	{
		System.out.println("The Boook Mnf. Comapny :"+Company);
		System.out.println("The Tyep of Bool Is :"+type);
		System.out.println("The Size Of The Book is :"+Size);
		System.out.println("The Pages In a book Is :"+Pages+" pages");
		System.out.println("The price Of Book is  : "+price);
	}
	

}
