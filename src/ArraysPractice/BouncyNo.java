package ArraysPractice;
import java.util.Scanner;
public class BouncyNo {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	int ip=sc.nextInt();
    boolean flag=false;
boolean increse=flag;
boolean decrese=flag;
while(ip>9)
{
	int last=ip%10;
	ip/=10;
	int sec=ip%10;
	
	if(last>sec)
	{
		decrese=true;
            
                    
	}
	else if(last<sec )
	{
	increse=true;	
                     
	}

     if(increse==true&&decrese==true)
	{      
		break;
	}
        
}
if(increse==true&&decrese==true)
{
	System.out.println("It is a bouncy no");
}
else
{
System.out.println("It is not an Bouncy number");	
}
}
		
	
	
}
