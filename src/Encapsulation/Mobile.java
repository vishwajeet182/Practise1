package Encapsulation;

public class Mobile 
{
	private String Brand;
	private double price;
	private int ram;
	private int rom;
	private String color;
	 
	Battery b1=new Battery("Samsung" , "Li-Ion" ,5000 ,2700.00);

	public Mobile()
	{
		//Default Constructer
	}
	
	public Mobile(String brand , double price , int ram , int rom , String Color)
	{
		this.Brand=brand;
		this.color=Color;
		this.price=price;
		this.ram=ram;
		this.rom=rom;
		
		System.out.println("Mobile Created!");
	}
	
	public void displayMobile()
	{
		System.out.println("Brand :"+Brand);
		System.out.println("Price :"+price);
		System.out.println("Ram :"+ram);
		System.out.println("Rom :"+rom);
		System.out.println("Color :"+color);
	}
}
