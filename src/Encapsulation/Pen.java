package Encapsulation;

public class Pen
{
 private String Company;
 private String Color;
 private String Type;
 
 refill r1=new refill(1,"blue",1,"Paras");
 refill r2=new refill(2,"red-black",2,"Celloe");
  
 public Pen()
 {
	 //default Constructer
 }
 public Pen(String Company, String Color, String Type)
 {
	this.Company=Company;
	this.Color=Color;
	this.Type=Type;
	System.out.println("Pen created!");
 }
 
 public void Pen() 
 {
	System.out.println("Company :"+Company);
	System.out.println("Color :"+Color);
	System.out.println("Type :"+Type);
 }
}
