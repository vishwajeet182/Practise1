package Encapsulation;

public class PenDriver
{
	public static void main(String[] args)
	{
		Pen p1=new Pen("Celloe" , "Red" ,"Single");
		Pen p2=new Pen("paras"," black-blue", "two");
		  
		System.out.println("This is First Pen of Celloe");
		p1.r1.displayrefill();
		System.out.println("This Is Second Pen of Paras");
		p2.r2.displayrefill();
	}

}
