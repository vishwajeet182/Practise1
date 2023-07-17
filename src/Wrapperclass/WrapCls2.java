package Wrapperclass;

public class WrapCls2 
{
	public static void main(String [] args)
	{
		String s1="10";
		int i=Integer.parseInt(s1);//parsing
		
	 	System.out.println(i+10);
		
		String s2="true";
		boolean b=Boolean.parseBoolean(s2);
		System.out.println(b);
		
		String s3="a";
		char ch=s3.charAt(0);
		
		System.out.println(ch);
	}

}
