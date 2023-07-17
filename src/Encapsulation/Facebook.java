package Encapsulation;

public class Facebook
{
private String Name;
private long Mono;
private String Email;
private String UserId;
private String Pass;
private int otp;
 public  Facebook()
   {
	   //Default Constructer
   }
 public  Facebook(String Name,long Mono,String Email,String UserId,String pass,int otp)
 {
	this.Name=Name;
	this.Mono=Mono;
	this.Email=Email;
	this.UserId=UserId;
	this.Pass=pass;
	this.otp=otp;
	System.out.println("Account Created!");
 }
 public void Forgrtpass(String userid, String oldpass, String newPass, long Mono,int otp)
 {
	 if(this.UserId==userid && this.Pass==oldpass)
	 {
		 System.out.println("login /Enter MoOn to Sent Otp");
		 if(this.Mono==Mono)
		 {
			 System.out.println("Enter a OTP");
			 if(this.otp==otp)
			 {
				 System.out.println("Forget Password SuccesFully!");
				 this.otp=otp;
				 this.Pass=newPass;
			 }
		 }
	 }
	 else
	 {
		 System.out.println("Your User Id & Password Does Not Match!");
	 }
 }
 
 public void login_Signup(String userid,String pass)
 {
	 if(this.UserId==userid && this.Pass==pass)
	 {
		 System.out.println("Login/Sign Succesfull!");
	 }
	 else
	 {
		 System.out.println("Your UserId Or Password DoesNot Match!");
	 }
 }
 
}
