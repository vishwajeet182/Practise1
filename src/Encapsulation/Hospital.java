package Encapsulation;

public class Hospital
{
	private String Name ;
	private String NameSurgen ;
	private String Speciality ;
	private int bed ;
	private String NameofPatiant ;
	private String TypeOfDec ;
	private String patiantId ;
	private int BedNo;
	private double Amt=20000.00;
	private int NoofPatiant;
	
	
	
	public Hospital()
	{
		//Default Constructer
	}
	public Hospital(String Name,String NameSurgen,String Speciality,int bed,String NameofPatiant,String TypeOfDec,String patiantId,int BedNo,double Amt,int NoofPatiant)
	{
		this.Name=Name;
		this.NameSurgen=NameSurgen;
		this.Speciality=Speciality;
		this.bed=bed;
		this.NameofPatiant=NameofPatiant;
		this.TypeOfDec=TypeOfDec;
		
		this.patiantId=patiantId;
		this.BedNo=BedNo;
		this.Amt=Amt;
		this.NoofPatiant=NoofPatiant;
		System.out.println("Hospital Resgistraion Done!");
		
	}
	public String gateName()
	{
		return Name;
	}
	
	public String gateNameSurgen()
	{
		return NameSurgen;
	}
	
	public String gateSpecility()
	{
		return Speciality;
	}
	 
	public int getbed()
	{
		return bed;
	}
	
	public int gateNoofPatiant()
	{
		return NoofPatiant;
	}
	
	public String gateTypeofDec()
	{
		return TypeOfDec;
		
	}
	 
	public String gatePatiantId()
	{
		return patiantId;
		
	}
	
	public int gateBedNo()
	{
		return BedNo;
	}
	
	public double gateAmt()
	{
		return Amt;
		
	}
	
	public boolean pataintRegistration(String name, String Surgen, String Speciality, String NamePatiant, String TpOfDec, String PId,int bedno)
	{
		if(this.Name==name && this.NameSurgen==Surgen && this.Speciality==Speciality && this.NameofPatiant==NamePatiant && this.patiantId==PId && this.BedNo==bedno)
		{
			System.out.println("Registartion Proccess Of Patiant Done!");
			return true;
		}
		else
		{
			System.out.println("Some Details not Fill!");
			return false;
		}
	}
	 
	public void BillPayment(double Amt,double Bill,String name, String Surgen, String Speciality, String NamePatiant, String TpOfDec, String PId,int bedno)
	{
		if(pataintRegistration(name,Surgen,Speciality,NamePatiant,TpOfDec,PId,bedno))
		{
			if((this.Amt-Bill)==0)
			{
				System.out.println("Payment Done ");
			}
			else
			{
				
				System.out.println("Payment Not Yet Done!");
				this.Amt-=Bill;
				System.out.println("Reamaning Payment is :");
				System.out.println(this.Amt);
			}
		}
		else
		{
			System.out.println("The given Details Is Not Matchd With paitaint!");
		}
	}
	 
}
