package Encapsulation;
public class Engine 
 {
	private String Company;
	private int stroke;
	private int piston;
	private int cc;
	private String type;
	private int power;
	private String Injection;
	 private int torque;
	  
	 public Engine()
	 {
		 //default Constructer
	 }
	 
	 public Engine(String company, int stroke, int piston , int cc, String type , int power, String Injection, int torque)
	 {
		 this.Company=company;
		 this.stroke=stroke;
		 this.piston=piston;
		 this.cc=cc;
		 this.type=type;
		 this.power=power;
		 this.Injection=Injection;
		 this.torque=torque;
		 System.out.println("Engine Created!");
	 }
	 
	 public void displayEngine()
	 {
		 System.out.println("Comapany :" +Company);
		 System.out.println("Strocke :"+stroke);
		 System.out.println("Piston :"+piston);
		 System.out.println("cc :"+cc);
		 System.out.println("type :"+type);
		 System.out.println("power :"+power);
		 System.out.println("Torque: "+torque);
	 }
	 
	 
 }
