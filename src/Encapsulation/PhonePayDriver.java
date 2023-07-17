package Encapsulation;

	 public class PhonePayDriver
	  {
		  public static void main(String[] args)
		  {
			PhonePay p=new PhonePay("SBI","7057878286@ybl",1234567890l,"Rishi",7057878286l,1234,100000.00);
			p.gateBalence("7057878286@ybl", 1234, 20000.00);
			p.setWithdraw("7057878286@ybl", 1234, 1000001.00);
			p.setDeposit("7057878286@ybl", 2341, 50000.00);
			p.setWithdraw("7057878286@yb", 1234,23456.00);
			
		   }
	   }
