package Inheritance;

public class Account1Driver 
{
	public static void main(String[] args)
	{
		SavingAccount s1=new SavingAccount("Rishi","SBI",123456789l,"Chandur-rly","SBI1105",
				50000.00,4.00);
		//s1.displayAccount1();
		s1.displaySavingAccount();
		SalaryAccount s2=new SalaryAccount("Nikhil","Axis Bank",987654321l,"Deccan","AX0001",
				200000.00,0.00,2000.00);
		//s2.displayAccount1();
		s2.displaySalaryAccount();
		LoanAccount l1=new LoanAccount("Viaj-Malya","Lena-Dena",786786786786l,"Mumbai","L101D101",
				500000.00,1,"buisness loan",12);
		//l1.displayAccount1();
		l1.displayLoanAccount();
	}
}
