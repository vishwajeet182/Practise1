package earlyBinding;

public class MarkerDriver 
{
	public static void main(String[] args)
	{
		System.out.println("This Is The Information About Marker");
		Marker M1=new Marker(35.00,"Camline");
		M1.dispalyMarker();
		System.out.println("This Is The Information Of INK");
		
		M1.i1.displayInk();
		
	}

}
