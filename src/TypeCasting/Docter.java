package TypeCasting;

public class Docter 
{
	String ck1;
	String ck2;
	String ck3;
	
	public Docter()
	{
		//default Constructer
	}
	
	public Docter(String ck1,String ck2,String ck3)
	{
		this.ck1=ck1;
		this.ck2=ck2;
		this.ck3=ck3;
		System.out.println("Docter Clinic Open!");
	}
	public void displayDocter()
	{
		System.out.println("The first Skill is : "+ck1);
		System.out.println("the 2nd Skill is : "+ck2);
		System.out.println("The 3rd skill is : "+ck3);
		System.out.println("===***===");
	}

}
