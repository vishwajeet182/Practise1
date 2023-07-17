package Encapsulation;

public class CarDriver 
{
	 public static void main(String[] args)
	 {
		  Car c1=new Car("Honda-city" ,"Black");
		  Car c2=new Car("Harrier" ,"White");
		  System.out.println("This Is Honda-City");
		  c1.e1.displayEngine();
		  System.out.println("This Is The Tata-Harriear");
		  c2.e2.displayEngine();
	  }
}
