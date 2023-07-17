package ArraysPractice;
import java.util.Scanner;
public class Student 
{
	String name;
	int id;
	int age;
	char gender;
	long cno;
	public Student(String name, int id, int age, char gender, long cno) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.cno = cno;
		System.out.println("Student All The Non Static Member Are loaded into the Object!");
	}
	
	
}
