package Method_Overriding;

public class GameV2 extends GameV1 
{
	 public void goLeft(int steps)
	 {
		 System.out.println("Go left to the "+steps+" Steps");   //bug Clear
	 }
	 public void reloadGun(int bullet)
	 {
		 bullet=+100;
		 System.out.println("The cuurentally bullets is is the gun are "+bullet);
	 }
	 public void fire(int bullet)
	 {
		 if(bullet>10)
		 {
			 bullet--;
			 System.out.println("You need To reload the gun!");
			 System.out.println("The Count Of Bullet Afte round Of Fire "+bullet);
		 }
		 else
		 {
			 reloadGun(12);
		 }
	 }
}
