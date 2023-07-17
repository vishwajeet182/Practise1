package Inheritance;

public class SavingAcc extends Account
{
	String AccName;
	double bal;
	long AccNo;
	
	SavingAcc()
	{
		//Default Constructer
	}
	
	SavingAcc(String BankName,String IFSC,String AccType,String Branch,String AccName,double bal,long AccNo)
	{
		 this.BankName=BankName;
		 this.IFSC=IFSC;
		 this.AccType=AccType;
		 this.Branch=Branch;
		 this.AccName=AccName;
		 this.bal=bal;
		 this.AccNo=AccNo;
		 System.out.println("This Is Saving Account !");
	}
	
	public void displaySavingAcc()
	{
		System.out.println("The Bank Name Is : "+BankName);
		System.out.println("The Branch Is : "+Branch);

		System.out.println("The Account Number is :"+AccNo);
		System.out.println("The Account Holder name is : "+AccName);

		System.out.println("The IFSC code Of Curren account : "+IFSC);
		System.out.println("The Acc type of Account No is :"+AccType );
		System.out.println("The balence Is : "+bal);
		
	}
	

}
