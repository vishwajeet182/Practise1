package Number_Program;
import java.util.Scanner;
public class SeriesofAlphabet
{
	public static void main(String[] args) 
	{
		int num  = 1;
		
		for(char i = 'A';i<='Z';i++)
		{
			System.out.println(i+"="+num);
			num++;
		}
		for(char i = 'A';i<='Z';i++)
		{
			for(char j = 'A';j<='Z';j++)
			{
				System.out.println(i+""+j+"="+num);
				num++;
			}
		}
	}
}


