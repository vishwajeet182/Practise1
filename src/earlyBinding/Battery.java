package earlyBinding;

	 public class Battery
	  {
		  int mah;
		  String type;
		  String Company;
		  double price;
		  
		  Battery()
		  {
			  //Default Constructer
		  }
		  
		  Battery(int mah, String type, String Company , double price)
		  {
			  this.mah=mah;
			  this.type=type;
			  this.Company=Company;
			  this.price=price;
			  
			  System.out.println("Batery Created!");
		  }
		  
		  public void displayBatery()
		  {
			  System.out.println("Comapny : "+Company);
			  System.out.println("MAH :"+mah);
			  System.out.println("Type of Production :"+type);
			  System.out.println("The Price OF :"+price);
		  }
	   }
