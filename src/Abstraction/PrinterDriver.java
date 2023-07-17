package Abstraction;

public class PrinterDriver 
{
	public static void main(String[] args) 
	{
		Printer p1=new Hp_Printer();
		p1.welcome("Rishi");
		p1.print();
		Printer p2=new Canon_Printer();
		p2.print();
	}

}
