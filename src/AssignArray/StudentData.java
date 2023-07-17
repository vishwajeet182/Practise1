package AssignArray;
import java.util.Scanner;
public class StudentData 
{
	Student [] s1=new Student[4];
	
	Scanner sc=new Scanner(System.in);
	
	public void addStudent()
	{
		for (int i = 0; i < s1.length; i++)
		{
			Student s2=s1[i];
			if(s1[i]==null)
			{
				System.out.println("Enter Name :");
				String name=sc.next();
				System.out.println("Enter id");
				int id=sc.nextInt();
				System.out.println("Enter age");
				int age=sc.nextInt();
				System.out.println("Enter contact number");
				long phno=sc.nextLong();
				System.out.println("enter gender");
				char gender=sc.next().charAt(0);
				
				
				System.out.println("Student Info Added !");
				Student s=new Student(name,id,age,gender,phno);
				s1[i]=s;
				return;
				
			}
		}
		System.out.println("Database If Full!");
	}
	
	public void removeStudent()
	{
		System.out.println("enter id of Student");
		int id=sc.nextInt();
		for (int i = 0; i < s1.length; i++)
		{
			Student s2=s1[i];
			if (s2.id==id) 
			{
				s1[i]=null;
				System.out.println("Student Data Removed!");
				return;
			}
		}
		System.out.println("You Entered Wrong Id!");
	}
	
	public void serarchStudent()
	{
		System.out.println("Enter a Id :");
		int id=sc.nextInt();
		for (int i = 0; i < s1.length; i++) {
			Student s2=s1[i];
			if (s2.id==id)
			{
				System.out.println(s2.name);
				System.out.println(s2.id);
				System.out.println(s2.age);
				System.out.println(s2.gender);
				System.out.println(s2.phno);
				System.out.println("This Is The Information Of "+i+" Student");
				return;
			}
		}
		System.out.println("You Have Entered Wrong Id!");
	}
	
	public void displayStudent()
	{
		for (int i = 0; i <s1.length; i++)
		{
			Student s2=s1[i];
			if(s1[i]!=null)
			{
				System.out.println(s2.name);
				System.out.println(s2.id);
				System.out.println(s2.gender);
				System.out.println(s2.age);
				System.out.println(s2.phno);
			}
		}
	}
	
	public void exitApp()
	{
		System.out.println("You have Closed App!");
		System.exit(0);
	}
}
