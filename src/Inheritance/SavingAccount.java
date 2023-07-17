package Inheritance;

public class SavingAccount extends Account1
{
	double Amt;
	double Int;
	
	public SavingAccount()
	{
		//Default Constructer
	}
	
	public SavingAccount(String Hname,String BankName,long AccNo,String Branch,String IFSC,
			double Amt,double Int)
	{
		this.HName=Hname;
		this.BankName=BankName;
		this.AccNo=AccNo;
		this.Branch=Branch;
		this.IFSC=IFSC;
		this.Amt=Amt;
		this.Int=Int;
	}
	
	public void displaySavingAccount()
	{
		displayAccount1();
		System.out.println("The Amount Is In Saving Acc Is : "+Amt);
		System.out.println("The Intrest rate :"+Int);
        System.out.println("====SAVING ACC===");
	}
}
