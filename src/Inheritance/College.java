package Inheritance;

public class College extends Univercity
{
String Cname;
int Ccode;
String Cloc;
String Pcpl;
int Staff;

public College()
{
	//Default Constucter 
}

public College(String Uname,String vc,int ucode,String loc,String Cname, 
		int Ccode, String cloc,String pnpl,int staff)
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
}

public void displayCollege()
{
	displayUnivercity();
	System.out.println("The Name Of College : "+Cname);
	System.out.println("The College code is : "+Ccode);
	System.out.println("The location of college is :"+Cloc);
	System.out.println("The Princiole of College Is  : "+Pcpl);
	System.out.println("The Total No Of Staff is in The College : "+Staff);
	System.out.println("===CLG-END===");
}
}
