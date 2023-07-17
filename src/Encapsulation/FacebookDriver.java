 package Encapsulation;

public class FacebookDriver 
{
	public static void main(String[] args) 
	{
		Facebook f1=new Facebook("Rishi",9876543210l,"Rishi@gmail.com","ABC987","R@1234",1234);
		f1.Forgrtpass("ABC987", "R@1234", "Rishi", 9876543210l, 1234);
		f1.login_Signup("ABC987","R@1234");
	}

}
