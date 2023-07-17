package Encapsulation;

public class HospitalDriver {
	public static void main(String[] args)
	{
		Hospital h1=new Hospital("Dayasagar","Anil bhonde","Heart-Sergen",2,"Raju","Cardiac Areest","P@123",5,20000.00,13);
		h1.pataintRegistration("Irvine", "Gopal", "Heart-Sergen", "ravi", "Cardiac-Attach", "P1@123",2);
		//h1.BillPayment(20000.00, 20000.00, "Irvin", "Gopal", "Heart-Sergen", "ravi", "Cardiac-Attach", "P@123", 2);
	}

}
