package Bikes;

public class Honda extends Bike
{
	@Override
	void start()
	{
		System.out.println("Honda Starts");
	}
	@Override
	void move()
	{
		System.out.println("Honda Moves");
	}
	@Override
	void stop()
	{
		System.out.println("Honda Stops");
	}
}
