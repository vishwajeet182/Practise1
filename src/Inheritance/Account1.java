package Inheritance;

public class Account1
{
	String HName;
	String BankName;
	long AccNo;
	String Branch;
	String IFSC;
	
	public Account1()
	{
	//Default Constructer	
	}
	
	public Account1(String Hname,String BankName,long AccNo,String Branch,String IFSC)
	{
		this.HName=Hname;
		this.BankName=BankName;
		this.AccNo=AccNo;
		this.Branch=Branch;
		this.IFSC=IFSC;
		
	}
	public void displayAccount1()
	{
		System.out.println("The Acc Holder name is : "+HName);
		System.out.println("The Acc Holder Bankname is : "+BankName);
		System.out.println("The Acc Holder ACCNo is : "+AccNo);
		System.out.println("The Acc Holder Branch is : "+Branch);
		System.out.println("The Acc Holder IFSC Code : "+IFSC);
		System.out.println("===ACCOUNT1===");

		

	}
	

}
