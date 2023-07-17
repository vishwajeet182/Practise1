package Encapsulation;
import java.util.*;

public class MobileRecharge 
{
Scanner sc=new Scanner(System.in);
	String bankName="State Bank Of India";
	long accno=111122223333l;
	double bal=29999.00;
	long mono=9876543210l;
	String sim="jio";
    int rechType;
    
    public MobileRecharge()
    {
    	//Default Constructer
    }
    
    
    public MobileRecharge(String bankName,long accno,double bal,long mono,String sim,int recharType)
    {
    	this.bankName=bankName;
    	this.accno=accno;
    	this.bal=bal;
    	this.mono=mono;
    	this.sim=sim;
    	this.rechType=rechType;
    	
    	System.out.println("Now You can Reachargr Your Sim ");
    	
    }
    
    public String getbankname()
    {
    return bankName;	
    }
    public long getmono()
    {
    	return mono;
    	
    }
    public double getbal()
    {
    	return bal;
    	
    }
    public String getsim()
    {
    	return sim;
    }
    public void setRecharge(long mono,String sim,int rechType)
    {
    	
    	if(this.mono==mono)
    	{
    		
    		if(sim==sim)
    		{
    			System.out.println("Enter a Recharge Type :");
    			System.out.println("1. TalkTime   2.DataAddOn   3. 3 Months-Pack");
    			int type=sc.nextInt();
    			switch(type)
    			{
    			case 1:
    			{
    			System.out.println("The rechar Ammount 199 for a 1 month!");
    			setbal(111122223333l,199.00);
    			
    			System.out.println("Your reav=char done !");
    			System.out.println("Thanks ForConnecting With Us "+sim);
    			break;
    			}
    			
    			case 2:
    			{
    			System.out.println("The Rechar Ammount Is 25 for Data AddOn");
    			setbal(111122223333l,25.00);
    			System.out.println("Your rechargr Done!");
    			System.out.println("Thanks For Connecting With Us "+sim);
    			break;
    			}
    			case 3:
    			{
    				System.out.println("The Recharge Conta 3 months pack contain 599");
    				setbal(111122223333l,599.00);
    				System.out.println("Your recharge done succesfull!");
    				System.out.println("Thanks For Connecting With us :"+sim);
    				break;
    			}
    			}
    		}
    		else
        	{
        		System.out.println("You Choose A Wrong Sim-Card Type");
        	}
    		
    	}
    	else
    	{
    		System.out.println("You not Enter a Correct Mobile Number");
    	}
    }
     
   


	private void getbal(long l, double d) {
		// TODO Auto-generated method stub
		
	}


	public void setbal(long accno,double bal)
    {
    	
    
    	if(this.accno==accno)
    	{
    		
    		bal=this.bal-bal;
    		System.out.println("Current Balence Of After Recharge is "+bal);
    	}
    	else
    	{
    		System.out.println(" You Hav Entered A Wrong Details Regarding Acccount Number ");
    		
    	}
    }
//    public void getBal(long accno,double bal)
//    {
//    	if(this.accno==accno)
//    	{
//    		bal-=bal;
//    	}
//    	else 
//    	{
//    		System.out.println("You enter Invalid account no");
//    	}
//   
//    }
}
