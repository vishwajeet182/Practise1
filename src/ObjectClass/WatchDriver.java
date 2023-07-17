package ObjectClass;

public class WatchDriver 
{
	public static void main(String[] args)
	{
		Object o1=new Watch();
		System.out.println(o1.toString());
		Object o2=new Watch("Casio","Digital", 5000.00 ,101);
		System.out.println(o1.toString());
		System.out.println(o1.equals(o2));
		System.out.println(o1.equals(o1));
		System.out.println(o1.hashCode());
		//System.out.print(o1.wait());
		
		



 



	}
}
