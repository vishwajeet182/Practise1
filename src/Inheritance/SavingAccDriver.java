package Inheritance;

public class SavingAccDriver 
{
	public static void main(String[] args)
	{
		SavingAcc s1=new SavingAcc("SBI","SBIN1103","Saving-Account","Deccan","Mukesh-Ambani",7565879.00,1234567890l);
		System.out.println("This Is The Extended Saving Account");
		s1.displaySavingAcc();
		System.out.println("This is The main account");
		s1.displayAccount();
	}

}
