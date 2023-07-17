package ArraysPractice;
import java.util.Scanner;
public class StudentMain 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	StudentDatabase sd=new StudentDatabase();
	for (; ;)
	{
		System.out.println("1.Add Student 2.remove Student 3.Searching Student 4.Display Student 5.exit");
        int choice=sc.nextInt();
        switch(choice)
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
        	sd.searching();
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
        	return;
        }
        }
	}
}
}
