package Method_Overriding;

public class GameV1V2Driver 
{
	public static void main(String[] args)
	{
		GameV1 v1=new GameV2();
		v1.goLeft(24);
		v1.fire(22);
		v1.fire(38);
		v1.reloadGun(1);
		v1.fire(10);
	}
}
