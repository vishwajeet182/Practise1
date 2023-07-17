package TypeCasting;

public class DocterDriver 
{
	public static void main(String[] args) 
	{
		Docter d1=new Dentist("Heart","theet","Neuro","Theeth");
		d1.displayDocter();
		Docter d2=new Cardiologist("Heart","theet","Neuro","Heart");
		d2.displayDocter();
	}
}
