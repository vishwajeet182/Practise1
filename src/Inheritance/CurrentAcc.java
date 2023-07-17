package Inheritance;

public class CurrentAcc extends Account1
{
	double bal;
	 int TraLim;
	 double intrest=0;
	 double Minbal=5000;
	 
	 public CurrentAcc()
	 {
		 //default Constructer
	 }
	 
	 public CurrentAcc(String Hname,String BankName,long AccNo,String Branch,String IFSC,
		double bal,int tanslim, double intrest,double Minbal )
		{
			this.HName=Hname;
			this.BankName=BankName;
			this.AccNo=AccNo;
			this.Branch=Branch;
			this.IFSC=IFSC;
			this.bal=bal;
			TraLim=tanslim;
			this.intrest=intrest;
			this.Minbal=Minbal;
			
		}
	 
	 public void displayCurrentAcc()
	 {
		 displayAccount1();
		 System.out.println("The balence Of Account is : "+bal);
		 System.out.println("The Min transition Limit For current account is :" +TraLim);
		 System.out.println("The Total intrest is on current Acc :"+intrest);
		 System.out.println("The Min balence Of is :"+Minbal);
		 System.out.println("===Current-Account===");
	 }
}
