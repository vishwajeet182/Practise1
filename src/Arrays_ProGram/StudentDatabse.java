package Arrays_ProGram;
import java.util.Scanner;
public class StudentDatabse 
{
	static Scanner sc=new Scanner(System.in);
//	System.out.print("Enter a Size");
	Student[] s1=new Student[4];
	
	
	public void addStudent()
	{
		for (int i = 0; i < s1.length; i++) 
		{
			if(s1[i]==null)
			{
				System.out.println("Enter a name: ");
				String name=sc.next();
				System.out.println("Enter age :");
				int age=sc.nextInt();
				System.out.println("Enter Id :");
				int id=sc.nextInt();
				System.out.println("Enter A contact Number :");
				long cno=sc.nextLong();
			    System.out.println("Enter a gender :");
			    char gender=sc.next().charAt(0);
			    
			    Student s=new Student(name,age,id,cno,gender);
			    s1[i]=s;
			    
			    System.out.println("Student Is Added ");
			    return;
			}
		}
		System.out.println("Database is Full: ");
	}
	public void removeStudent()
	{
		System.out.println("Enter a id");
		int id=sc.nextInt();
		for (int i = 0; i < s1.length; i++)
		{
			Student s2=s1[i];
			if(s2.id==id)
			{
				s1[i]=null;
				System.out.println("Student Removed !");
				return;
			}
			
		}
		System.out.println("Id Is Not Found !");
		
	}
	public void display()
	{
		for (int i = 0; i < s1.length; i++)
		{
			if(s1[i]!=null)
			{
				Student s2=s1[i];
				System.out.println(s2.name);
				System.out.println(s2.age);
				System.out.println(s2.id);
				System.out.println(s2.cno);
				System.out.println(s2.gender);
			}
			
		}
	}
	public void search()
	{
		System.out.println("Enter Id OF the Student:");
		int id=sc.nextInt();
		
		
		for (int i = 0; i < s1.length; i++)
		{
			Student s2=s1[i];
			if(s2.id==id)
			{
			System.out.println("Founded Student Details Below!");
				System.out.println(s2.name);
				System.out.println(s2.age);
				System.out.println(s2.cno);
				System.out.println(s2.id);
				System.out.println(s2.gender);
//				System.out.println("Student Found!");
				return;
			
		}
		}
		System.out.println("Student Not Found!");
		 
	}
	public void exitApp()
	{
		System.out.println("You Closed The Program!");
		System.exit(0);
	}
	
}

