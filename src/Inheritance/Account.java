package Inheritance;

public class Account
{
	String BankName;
	
	String IFSC;
	String AccType;
	String Branch;
	
	Account()
	{
		//Default Constructer
	}
	
	Account(String BankName,String IFSC,String AccType,String Branch)
	{
		this.BankName=BankName;
		
		this.IFSC=IFSC;
		this.AccType=AccType;
		this.Branch=Branch;
		System.out.println("this Is Main Account");
	}
	
	public void displayAccount()
	{
		System.out.println("The Bank Name Is : "+BankName);
		
		System.out.println("The IFSC code Of Curren account : "+IFSC);
		System.out.println("The Acc type of Account No is :"+AccType );
		System.out.println("The Branch Is : "+Branch);
	}

}
