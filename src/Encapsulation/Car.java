package Encapsulation;

public class Car 
{
	private String Company;
	private String Color;
	Engine e1=new Engine("Honda" , 4 , 8 , 1800 , "Diesel" , 250 , "Injection" , 20 );
	Engine e2=new Engine("Bajaj", 2 ,4 ,150 ,"Petrol" ,25 , "Spark-Plug" ,15);
	
	public Car()
	{
		//Default Constructe
	}
	
	public Car(String Company , String Color)
	{
		this.Color=Color;
		this.Company=Company;
		System.out.println("Car Created!");
	}
	 
	public void displayCar()
	{
		System.out.println("Comapny :"+Company);
		System.out.println("Color :"+Color);
	}

}
