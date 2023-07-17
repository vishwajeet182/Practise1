package ObjectClass;
import java.lang.*;
public class Watch
{
	String name;
	String type;
	double price;
	int modelno;
	
	
	public Watch()
	{
		//Default Constructer
	}
	
	public Watch(String Name,String Type,double Price,int Modelno)
	{
		super();
		name=Name;
		type=Type;
		price=Price;
		modelno=Modelno;
		
		System.out.println("Watch Crreated ! ");
	}
	
	public String toString()
	{
		return "["+ " Name : "+name+"Type : "+type+" Price : "+price+" Model No: "+modelno+" ]";
	}

}
