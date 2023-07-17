package Inheritance;

public class Taluka extends District
{
	String Tname;
	String TSecretery;
	String HOT;
	String TPalika;
	int Tcode;
	
	public Taluka()
	{
		//Default Constucetr
	}
	
	public Taluka(String Sname,String Secretery,String Assembly,String HOS,int Scode,
			 String Dname,String DSecretery,String HOD, String Palika,int Dcode,
			String Tname,String TSecretery,String HOT,String TPalika,int Tcode)
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
	}
	
	
	public void displayTaluka()
	{
		displayDistrict();
		System.out.println("The taluKa Name : "+Tname);
		System.out.println("The Secretery OF the taluka : "+TSecretery);
		System.out.println("The Head Of the taluka Is : "+HOT);
		System.out.println("The Palika of taluka is : "+TPalika );
		System.out.println("The Code of The Taluka : "+Tcode);
		System.out.println("===Taluka-End===");
	}
}
