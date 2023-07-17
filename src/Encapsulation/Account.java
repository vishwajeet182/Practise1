 package Encapsulation;

	public class Account {
	private String name;
	private String bankname;
	private int pin;
	private double amount;
	private long accno;
	
	
	public Account()
	{
		
	}
	
	public Account(String name,String bankname,int pin,double amount,long accno,double stat)
	{
		this.name=name;
		this.bankname=bankname;
		this.pin=pin;
		this.amount=amount;
		this.accno=accno;
		//this.stat=stat;
		System.out.println("Account Created!");
	}
	
	public String getName()
	{
		return name;
	
	}
	public long getAccno() 
	{
		return accno;
	}
	public double getAmount(long accno,int pin)
	{
		if(this.accno==accno && this.pin==pin)
		{
			return amount;
		}
		else
		{
			System.out.println("Incorrect Credintial !");
			return 0;
		}
	}
	public void withdraw(long accno,int pin,double amount)
	{
		if(this.accno==accno && this.pin==pin)
		{
			System.out.println("Login Succes !");
			if(this.amount-amount>=2000)
			{
				this.amount-=amount;
				System.out.println("Ammount Debited!");
				System.out.println(this.amount);
			}
			else
			{
				System.out.println("You Do Not have Sufficient Ammount!");
			}
			
		}
		else
		{
			System.out.println("Enter Account No Or Pin Was Incorrect");
		}
	}
	
	public void deposit(long accno,int pin,double amount)
	{
		if(this.accno==accno && this.pin==pin)
		{
			System.out.println("You Can Deposite Ammount!");
			this.amount+=amount;
			System.out.println("Ammount Deposited");
			System.out.println(this.amount);
		}
		else
		{
			System.out.println("Your Account no Or PassWord Was Incorrect! ");
		}
	}
	public void setpin(long accno, int oldpin,int newpin)
	{
		if(this.accno==accno)
		{
			if(this.pin==oldpin)
			{
				pin=newpin;
				System.out.println("Pin Updated!");
				
			}
			else
			{
				System.out.println("old pin Invalidate!");
			}
		}
		else
		{
			System.out.println("Invalide Credintial!");
		}
	}
	
}
	
	
