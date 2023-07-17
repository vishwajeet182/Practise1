package Inheritance;

public class Villege  extends Taluka
{
	String Vname;
	String VSecretery;
	String HOV;
	String Panchayt;
	int Vcode;
	
	
	
	public Villege()
	{
		//Default Constructer
	}
	
	public Villege(String Sname,String Secretery,String Assembly,String HOS,int Scode,
			 String Dname,String DSecretery,String HOD, String Palika,int Dcode,
			String Tname,String TSecretery,String HOT,String TPalika,int Tcode,
			String Vname,String VSecretery,String HOV,String Panchayt,int Vcode)
	{
		this.Sname=Sname;
		this.Secretery=Secretery;
		this.Assembly=Assembly;
		this.HOS=HOS;
		this.Scode=Scode;
		this.Dname=Dname;
		this.DSecretery=DSecretery;
		this.HOD=HOD;
		this.Palika=Palika;
		this.Dcode=Dcode;
		this.Tname=Tname;
		this.TSecretery=TSecretery;
		this.HOT=HOT;
		this.TPalika=TPalika;
		this.Tcode=Tcode;
		this.Vname=Vname;
		this.VSecretery=VSecretery;
		this.HOV=HOV;
		this.Panchayt=Panchayt;
		this.Vcode=Vcode;
		
		
		
	}
	
	public void displayVillege()
	{
		displayTaluka();
		System.out.println("The name OF Villege Is : "+Vname);
		System.out.println("The Secretery of Villege is :"+VSecretery);
		System.out.println("The Head OF Leader Of Villege : "+HOV);
		System.out.println("The Panchayt Of Villege : "+Panchayt);
		System.out.println("The Villege Code Is : "+Vcode);
		System.out.println("===Villege-End===");
	}

}
