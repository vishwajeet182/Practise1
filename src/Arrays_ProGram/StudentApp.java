package Arrays_ProGram;
import java.util.Scanner;
public class StudentApp 
 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		StudentDatabse sb=new StudentDatabse();
		
		for(;;)
		{
			System.out.println("1.ADD Student 2.Remove Student 3.Search Student"
					+"4.Display Student 5.EXIT");
			int choise=sc.nextInt();
			
			switch (choise)
			{
			case 1:
			{
				sb.addStudent();
				break;
			}
			case 2:
			{
				sb.removeStudent();
				break;
			}
			case 3:
			{
				sb.search();
				break;
			}
			case 4:
			{
				sb.display();
				break;
			}
			case 5:
			{
				sb.exitApp();
				
			}
			}
		}
	}
}
