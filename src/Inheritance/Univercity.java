package Inheritance;

public class Univercity 
{
	String Uname;
	String vc;
	int ucode;
	String loc;
	

	public Univercity()
	{
		//Default Constructr
	}
	
	public Univercity(String Uname,String vc,int ucode,String loc)
	{
		this.Uname=Uname;
		this.vc=vc;
		this.ucode=ucode;
		this.loc=loc;
		
	}
	
	public void displayUnivercity()
	{
		System.out.println("The Name Of Univercity : "+Uname );
		System.out.println("The Vice Chairman Of Univercity : "+vc);
		System.out.println("The Code Of Univrtcity : "+ucode);
		System.out.println("The Loc of Univercity : "+loc);
		System.out.println("===UNI-END===");
	}
}
