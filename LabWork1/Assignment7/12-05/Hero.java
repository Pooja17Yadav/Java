package Bikes;

public class Hero extends Bike
{
	@Override
	void start()
	{
		System.out.println("Hero Starts");
	}@Override
	void move()
	{
		System.out.println("Hero Moves");
	}@Override
	void stop()
	{
		System.out.println("Hero Stops");
	}
}
