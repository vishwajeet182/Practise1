package Inheritance;

public class LoanAccount extends Account1
{
	double loanAmt;
	int CivilScore;
	String type;
	double intrest;
	
	public LoanAccount()
	{
		//Default Constructer
	}
	
	public LoanAccount(String Hname,String BankName,long AccNo,String Branch,String IFSC,
			double loanAmt,int CivilScore,String type,double intrest)
	{
		this.HName=Hname;
		this.BankName=BankName;
		this.AccNo=AccNo;
		this.Branch=Branch;
		this.IFSC=IFSC;
		this.loanAmt=loanAmt;
		this.CivilScore=CivilScore;
		this.type=type;
		this.intrest=intrest;
		
	}
	
	public void displayLoanAccount()
	{
		displayAccount1();
		System.out.println("The Loan Amt : "+loanAmt);
		System.out.println("The Civil Score : "+CivilScore);
		System.out.println("The type Of Loan Is : "+type);
		System.out.println("The intrest of Loan : "+intrest);
		System.out.println("===LaonAccont===");
	}
	
}
