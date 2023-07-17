package Encapsulation;
import java.util.Scanner;

public class MobileRechargeDriver
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a mobile Number");
		long mono=sc.nextLong();
		System.out.println("Enter a sime type :");
		String sim=sc.next();
		System.out.println("Rechar type");
		int type=sc.nextInt();
		MobileRecharge m1=new MobileRecharge();
		
	   m1.setRecharge(mono, sim, type);
//	System.out.println(m1.accno);
//	System.out.println(m1.getbal());
//	System.out.println(m1.bal);
//	System.out.println(m1.bankName);
//	System.out.println(m1.rechType);
//	System.out.println(m1.getbankname());
//	System.out.println(m1.sim);
//	System.out.println(m1.getmono());
//	


		
		
	}
}
