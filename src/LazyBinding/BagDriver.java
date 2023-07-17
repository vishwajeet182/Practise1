package LazyBinding;

public class BagDriver
{
	public static void main(String[] args)
	{
		Bag B=new Bag("American-Tourister","Lap-Top Bag","Blue",980.00);
		B.displayBag();
		B.addBook();
	   B.b.displayBook();
	   B.b1.displayBook();
	  B.insertPen("Celloe", "BallPen");
	  B.displayPen("Celloe","BallPen");
	}
}
 