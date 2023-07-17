package ObjectClass;
import java.lang.*;
public class Student 
{
	String name;
	String Branch;
	int id;
	String College;
	
	public Student()
	{
		//Default Constrcter
	}
	
	public Student (String name,String Branch,int id,String College)
	{
		super();
		this.name=name;
		this.Branch=Branch;
		this.id=id;
		this.College=College;
	}
	
	public boolean equles(Object i)
	{
		Student s=(Student)i;
		if(this.name==s.name && this.Branch==s.Branch &&this.id==s.id&&this.College==s.College)
		{
			return true;
		}
		return false;
	}
	public int hashcode()
	{
		int hc=0;
		hc=hc+id;
		hc=hc+name.hashCode()+Branch.hashCode()+College.hashCode();
		return hc;
	}
}
