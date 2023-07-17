package Inheritance;

public class StudentDriver 
{
	public static void main(String[] args)
	{
		Student s1 = new Student("SGBUA" , "VashaZombale" , 1234 , "Amravti" ,
				"PRMIT&R" , 5678 , "Badnera" , "Bodkhe" , 728 ,
				"Mechanical" , "Ingle" , 52 , 240 , 01 ,
				"Rishi" , "SI0087" , 1234567890l , 4 , 'M');
		s1.displayUnivercity();
		s1.displayCollege();
		s1.displayDept();
		s1.displayStudent();
	}

}
//String Uname,String vc,int ucode,String loc,String Cname, 
//int Ccode, String cloc,String pnpl,int staff,String Dname,String HOD,
//int Faculty,int Seats,int DID,String Sname,String Sid,long mono,int Class, char Gender