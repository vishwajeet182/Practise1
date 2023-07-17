package Inheritance;

public class Dept extends College
{
	String Dname;
	String HOD;
	int Faculty;
	int seats;
	int DID;
	
	public Dept()
	{
		//Default Constucter
	}
	public Dept(String Uname,String vc,int ucode,String loc,String Cname, 
			int Ccode, String cloc,String pnpl,int staff,String Dname,String HOD,int Faculty,int Seats,int DID)
	{
		
		this.Uname=Uname;
		this.vc=vc;
		this.ucode=ucode;
		this.loc=loc;
		this.Cname=Cname;
		this.Ccode=Ccode;
		this.Cloc=cloc;
		this.Pcpl=pnpl;
		this.Staff=staff;
		this.Dname=Dname;
		this.HOD=HOD;
		this.Faculty=Faculty;
		this.seats=Seats;
		this.DID=DID;
		
	}
	
	public void displayDept()
	{
		displayCollege();
		System.out.println("The Dept Name : "+Dname);
		System.out.println("The HOD of This Dept Is : "+HOD);
		System.out.println("The Total Number Of Faculty Is In Dept : "+Faculty);
		System.out.println("The Seats Availible In Dept : "+seats);
		System.out.println("The Dept Id is : "+DID);
		System.out.println("===DEPT-END===");
	}
	
}
