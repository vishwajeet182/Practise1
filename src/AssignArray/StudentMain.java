package AssignArray;
import java.util.Scanner;
public class StudentMain 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		StudentData sd=new StudentData();
		for(;;)
		{
		System.out.println("1.Add Student  2.Remove Student   3.Search Student"+
		"4.Display Student Information   5.Exit App");
		
			int choise=sc.nextInt();
			switch (choise)
			{
			case 1: 
			{
				
				sd.addStudent();
				break;
			}
			case 2: 
			{
				
				sd.removeStudent();
				break;
			}
			case 3: 
			{
				
				sd.serarchStudent();
				break;
			}
			case 4: 
			{
				
				sd.displayStudent();
				break;
			}
			case 5: 
			{
				
				sd.exitApp();
				break;
			}
			
			
		}
	}
	}
}
