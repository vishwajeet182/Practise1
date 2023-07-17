package Inheritance;

public class Student extends Dept
{

	String Sname;
	String Sid;
	long Mono;
	int Class;
	char Gender;
	
	public Student()
	{
		//Default Constucter
	}
	 
	public Student(String Uname,String vc,int ucode,String loc,String Cname, 
			int Ccode, String cloc,String pnpl,int staff,String Dname,String HOD,
			int Faculty,int Seats,int DID,String Sname, String Sid ,long Mono,int Class, char Gender)
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
		this.Sname=Sname;
		this.Sid=Sid;
		this.Mono=Mono;
		this.Class=Class;
		this.Gender=Gender;
		
	}
	
	public void displayStudent()
	{
		displayDept();
		System.out.println("The Name Of Student Is : "+Sname);
		System.out.println("The College Id OF Student is  : "+Sid);
		System.out.println("The Contact Number : "+Mono);
		System.out.println("The Class In which Student Studing : "+Class+ " Year");
		System.out.println("The Gender Of Student is : "+Gender);
		System.out.println("====Student-Info-End===");
	}
}
