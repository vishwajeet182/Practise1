package Arrays_ProGram;

public class SqlLDataBase 
{
	String name;
	int id;
	String Company;
	double sal;
	String Mgr;
	String loc;
	public SqlLDataBase() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SqlLDataBase(String name, int id, String company, double sal, String mgr, String loc) {
		super();
		this.name = name;
		this.id = id;
		Company = company;
		this.sal = sal;
		Mgr = mgr;
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "SqlLDataBase [name=" + name + ", id=" + id + ", Company=" + Company + ", sal=" + sal + ", Mgr=" + Mgr
				+ ", loc=" + loc + "]";
	}
	
	
}
