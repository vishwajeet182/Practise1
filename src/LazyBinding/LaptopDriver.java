package LazyBinding;

public class LaptopDriver 
{
	public static void main(String[] args)
	{
		Laptop l = new Laptop("HP",8,1,"black",55000.00);
		Laptop l1=new Laptop("Lenovo",12,2,"Silver",62250.00);
		l.displayLaptop();
		l.insertPendrive("Sandisk", 32, 528.00, "C-type");
	   
		l.p.dispalyPendrive();
		l1.displayLaptop();
		l1.insertPendrive("HP", 64, 760.00, "JJj");
		  l1.p1.dispalyPendrive();
	    
	}

}
