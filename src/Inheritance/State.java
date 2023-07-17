package Inheritance;

public class State 
{
	String Sname;
	String Secretery;
	String Assembly;
	String HOS;
	int Scode;
	
	
	public State()
	{
		//Default Constrcter
	}
	
	public State(String Sname,String Secretery,String Assembly,String HOS,int Scode)
	{
		this.Sname=Sname;
		this.Secretery=Secretery;
		this.Assembly=Assembly;
		this.HOS=HOS;
		this.Scode=Scode;
		
	}
	
	public void displayState()
	{
		System.out.println("The State Name is  : "+Sname);
		System.out.println("The Secretery Of State : "+Secretery);
		System.out.println("The Assembly of The State : "+Assembly);
		System.out.println("The Head Of State Is : "+HOS);
		System.out.println("The Code Od state Is :" +Scode); 
		System.out.println("===State-End===");
	}

}
