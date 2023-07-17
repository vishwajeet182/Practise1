package Encapsulation;

public class PhonePay 
{
	private String bankName;
	private String phpayId;
	private long accNo;
	private String accname;
	private int pass;
	private long mono;
	private double balence;
	
	public PhonePay()
	{
		//Default Constructer
	}
	
	public PhonePay(String bankname, String phpayId, long Accno,String Accname,long mono,int pass,double balence)
	{
		this.bankName=bankname;
		this.phpayId=phpayId;
		this.accNo=Accno;
		this.accname=Accname;
		this.mono=mono;
		this.pass=pass;
		this.balence=balence;
		
	System.out.println("Phone Pay Account Has Been Created!");	
	}
	
	public long gateaccNo()
	{
		return accNo;
	
	}
	
	public long gatemono()
	{
		return mono;
	
	}
	public double gateBalence(String PhonePayId, int Pass, double balence)
	{
		if(this.phpayId==PhonePayId && this.pass==Pass)
		{
			System.out.println("Wel-Come!");
			System.out.println("Ypur Account balence is :"+this.balence);
			return this.balence;
		}
		else
		{
			System.out.println("The Details Enter By You Is Somthing Wrong");
			return 0.00;
		}
	}
	
	public void setWithdraw(String PhonePayId, int pass, double balence)
	{
		if(this.phpayId==PhonePayId && this.pass==pass)
		{
			if(this.balence>balence)
			{
				System.out.println("Withdrawl Succesfull!");
				this.balence-=balence;
				System.out.println("Your Balence Is :"+this.balence);
			}
			else
			{
				System.out.println("You Don't Have Sufficiant Amount Of balenec!");
			}
		}
		else
		{
			System.out.println("Incorrect Input You Have Enterd!");
		}
	}
	
	public void setDeposit(String PhonePayId, int pass, double balence)
	{
		if(this.phpayId==PhonePayId && this.pass==pass)
		{
			this.balence+=balence;
			System.out.println("The Amount Get Deposited!");
			System.out.println("Ypur Current Balence Is :"+this.balence);
		}
		else
		{
			System.out.println("You enter Some Wrong Informatin");
		}
	}
	

}
