package Abstraction;
public class Hp_Driver 
{
	public static void main(String[] args) 
	{
		HpComputer h1=new Windowsop();
		h1.Welcome("Rishi");
		h1.calculator();
		HpComputer h2=new IosSystem();
		h2.calculator();
	}
}
