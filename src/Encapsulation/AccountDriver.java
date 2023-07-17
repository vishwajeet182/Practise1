package Encapsulation;

public class AccountDriver 
{
	public static void main(String[] args) 
	{
		Account a1=new Account("Rishi","SBI",5453,10000.00,9876543210l,00.00);
	
		
//		a1.setpin(9876543210l, 5453, 1234);
		a1.deposit(9876543210l, 5453, 54321.00);
//		a1.withdraw(9876543210l, 1234, 64000.00);
//		
	}
	

}
