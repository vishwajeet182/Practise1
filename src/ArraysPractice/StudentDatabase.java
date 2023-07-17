package ArraysPractice;
import java.util.Scanner;
public class StudentDatabase
{
	Student []s1=new Student[4];
	Scanner sc=new Scanner(System.in);
	public void addStudent()
	{
		
		for (int i = 0; i < s1.length; i++) {
        Student s2=s1[i];
		   if(s1[i]==null)
		   {
			   System.out.println("Enter A name :");
			   String name=sc.next();
			   System.out.println("Enter id of student");
			   int id=sc.nextInt();
			   System.out.println("Enter a age");
			   int age=sc.nextInt();
			   System.out.println("Enter a gender ");
			   char gender=sc.next().charAt(0);
			   System.out.println("Enter a Contact no");
			   long cno=sc.nextLong();
			   System.out.println("information Loaded!");
			   
			   Student s=new Student(name,age,id,gender,cno);
			   s1[i]=s;
			   return;
			   
		   }
		}
		System.out.println("Database is Currentally Full!");
	}
	
	public void removeStudent()
	{
		System.out.println("Enter id Of Student");
		int id=sc.nextInt();
		for (int i = 0; i < s1.length; i++) 
		{
			Student s2=s1[i];
			if(s2.id==id)
			{
				s1[i]=null;
				System.out.println("Student Data Removed From the Database!");
				return;
			}
		}
	System.out.println("Student id is Is MissMathed With Data!");
		
	}
	
	public void displayStudent()
	{  
		System.out.println("This is Data Of All Studemts!");
		 for (int i = 0; i < s1.length; i++)
		 {
			 
			 
			 if(s1[i]!=null)
			 {
				 Student s2=s1[i];
			System.out.println(s2.name);
			System.out.println(s2.id);
			System.out.println(s2.age);
			System.out.println(s2.cno);
			System.out.println(s2.gender);
			return;
			 }
			
		 } 
		 
	}
	public void searching()
	{
		System.out.println("Enter id of Student!");
		
		for (int i = 0; i < s1.length; i++) 
		{
			int id=sc.nextInt();
			Student s2=s1[i];
//			System.out.println(s2.id);
			if(s2.id==id)
			{
				System.out.println(s2.name);
				System.out.println(s2.id);
				System.out.println(s2.age);
				System.out.println(s2.cno);
				System.out.println(s2.gender);
				System.out.println("This Is Complet information About The Student!");
				return;
			}
		}
		System.out.println("Entered Id is Not Match!");
	}
	
	public void exitApp()
	{
		System.out.println("You Have Closed The Program!");
		System.exit(0);
	}
	
	
}
