package earlyBinding;

public class Mobile
{
	String Brand;
	int ram;
	int Rom;
	String color;
	 Battery b1=new Battery(5000,"Li-Ion","Sam-Sung",2500.00);

	 Mobile()
	  {
		 //default Constructer
	   }
	  Mobile(String brand,int ram,int rom,String color)
	  {
		  this.Brand=brand;
		  this.color=color;
		  this.ram=ram;
		  this.Rom=rom;
		  System.out.println("Mobile has been Creted!");
	  }
	  
	  public void displayMobile()
	  {
		  System.out.println("The Brand Of Mobile Is :"+Brand);
		  System.out.println("The Color :"+color);
		  System.out.println("The ram of Device :"+ram+" GB");
		  System.out.println("The Rom is :"+Rom+" GB");
	  }
}
