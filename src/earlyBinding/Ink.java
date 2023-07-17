package earlyBinding;

public class Ink 
{
	String State;
	String Color;
	
	Ink()
	{
		//default Constucter
	}
	
	Ink(String State,String Color)
	{
		this.State=State;
		this.Color=Color;
		System.out.println("The Ink Is Ready To Insert Into A Maeker!");
	}
	public void displayInk()
	{
		System.out.println("State Of Ink :"+State);
		System.out.println("The Color of Ink Is :"+Color);
	}
}
