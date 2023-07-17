package TypeCasting;

public class Cardiologist extends Docter 
{
	String hk1;
	
   public Cardiologist()
   {
	   //Default Constructer
   }
   
   public Cardiologist(String ck1,String ck2,String ck3,String hk1)
   {
	   super(ck1,ck2,ck3);
	this.hk1=hk1;
	System.out.println("Cardiologist open Hospital");
   }
   
   public void displayCardiologist()
   
   {
	   displayDocter();
	   System.out.println("The skill is :"+hk1) ;
   }
   
}
