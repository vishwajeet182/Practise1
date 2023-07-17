package Encapsulation;

public class refill
{
  private String Color;
  private int knif;
  private int straw;
  private String Company;
  
  public refill()
  {
	  //default Constructer
  }
  
  public refill(int straw,String Color,int knif,String Company)
  {
	  this.Color=Color;
	  this.knif=knif;
	  this.straw=straw;
	  this.Company=Company;
	  System.out.println("Refill Created!");
  }
  
  public void displayrefill() 
   {
	System.out.println("Color :"+Color);
	System.out.println("Straw :"+straw);
	System.out.println("Knif :"+knif);
	System.out.println("Company :"+Company);
   }
}
