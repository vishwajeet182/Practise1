package ObjectClass;

public class StudentDriver
{
	public static void main(String[] args) 
	{
		Student s1=new Student("Rishi","Mech",23,"PRMITR");
		Student s2=new Student("Rishi","Mech",23,"PRMITR");
		System.out.println(s1);
		System.out.println(s2);
	
		System.out.println(s1.equles(s2));
		System.out.println(s1.hashcode());
		System.out.println(s2.hashcode());
		System.out.println(s1.equles(s2));
	}
}
