package Inheritance;

public class Employee extends Company
{

	String ename;
	int eid;
	String job;
	double sal;
	
	Employee()
	{
		//Default Constucter
	}
	
	Employee(String name,String ceo,String type,double turnover,String Loc, String ename,int eid,String job,double sal)
	{
		 this.name=name;
		 this.ceo=ceo;
		 this.type=type;
		 this.turnover=turnover;
		 this.Loc=Loc;
		 this.ename=ename;
		 this.eid=eid;
		 this.job=job;
		 this.sal=sal;
	}
	
	public void displayEmployee()
	{
		 System.out.println("Name of Company : "+name);
		 System.out.println("The Ceo Of Company : "+ceo);
		 System.out.println("The Type Of Company : "+type);
		 System.out.println("The Turnover Of Company : "+turnover);
		 System.out.println("The Location Of Company : "+Loc);
		 System.out.println("The name Of an Emp : "+ename);
		 System.out.println("The Emp Id Of Emp : "+eid);
		 System.out.println("The job of Emp : "+job);
		 System.out.println("the Sal Of Emp : "+sal);

	}
}
