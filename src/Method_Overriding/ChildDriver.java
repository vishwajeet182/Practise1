package Method_Overriding;

public class ChildDriver 
{
public static void main(String[] args) 
{
	Parent c1=new Child(); //UpCasting
	c1.a(); //Method OverRiding
	c1.b();//Method OverRiding
	System.out.println(c1.d);
	System.out.println(c1.i);
}
}
 