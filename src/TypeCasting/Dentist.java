package TypeCasting;

public class Dentist extends Docter
{
	String dk1;
	
	public Dentist()
	{
		//Default Constructer
	}
	
	public Dentist(String ck1,String ck2,String ck3,String dk1)
	{
		super(ck1,ck2,ck3);
		this.dk1=dk1;
		System.out.println("Dentist Clinic Open!");
	}
	
	public void displayDenstist()
	{
		displayDocter();
		System.out.println("Accept the Skill : "+dk1);
	}

}
