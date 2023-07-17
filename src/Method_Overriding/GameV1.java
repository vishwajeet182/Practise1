package Method_Overriding;

public class GameV1
{
	int bullet;
	int steps;
	
	public void goLeft(int steps)
	{
		System.out.println("Go Right to the "+steps+" Steps");//Bug find
	}
	public void gorRight(int steps)
	{
		System.out.println("Go Right to the "+steps+" Steps");
	}
	public void moveFront(int steps)
	{
		System.out.println("Go Forward to the "+steps+" Steps");
	}
	public void moveBack(int steps)
	{
		System.out.println("Go Backward to the "+steps+" Steps");
	}
	public void fire(int bullet)
	{
		if(bullet>0)
		{
			bullet--;
			//bullet=-1;
			System.out.println("The total Count of Bullets is "+bullet);
		}
		else
		{
			reloadGun(10);
		}
	}
	public void reloadGun(int bullet)
	{
		bullet=+30;
		System.out.println("Gun Reloaded!");
	    System.out.println("Cuuerntally presentet bullet is "+bullet);
	}

}
