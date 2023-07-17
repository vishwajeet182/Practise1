package Inheritance;

public class District extends State
{
	 String Dname;
	 String DSecretery;
	 String HOD;
	 String Palika;
	 int Dcode;
	 
	 public District()
	 {
		 //Default Constructer
	 }
	 
	 public District(String Sname,String Secretery,String Assembly,String HOS,int Scode,
			 String Dname,String DSecretery,String HOD, String Palika,int Dcode)
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
			
	 }
	 
	 public void displayDistrict()
	 {
		 displayState();
		 System.out.println("The name Of The District : "+Dname);
		 System.out.println("The DSecretery : "+DSecretery);
		 System.out.println("The HEad Of The District : "+HOD);
		 System.out.println("The Palika Of the Distict : "+Palika);
		 System.out.println("The Disrtict Code Is : "+Dcode);
		 System.out.println("===District -End===");
	 }
	 
}
