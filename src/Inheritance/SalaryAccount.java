package Inheritance;

public class SalaryAccount extends Account1
{
	double balence;
	double Int;
	double minbal;
	
	public SalaryAccount()
	{
		//Defaoult Constructer
	}
	
	public SalaryAccount(String Hname,String BankName,long AccNo,String Branch,String IFSC,
			double balence, double Int, double minbal)
	{
		this.HName=Hname;
		this.BankName=BankName;
		this.AccNo=AccNo;
		this.Branch=Branch;
		this.IFSC=IFSC;
		this.balence=balence;
		this.Int=Int;
		this.minbal=minbal;
		
	}
	
	public void displaySalaryAccount()
	{
		displayAccount1();
		System.out.println("The Amount of Salery acc :"+balence);
		System.out.println("The Interst amount is :"+Int);
		System.out.println("The min Balence is :"+minbal);
		System.out.println("===SalaryAccount=== ");
		
	}
}
