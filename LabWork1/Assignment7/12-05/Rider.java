package Bikes;

public class Rider 
{
	String Name;
	String Age;
	String Licenseno;
	
	void ride(Bike b,String Name,String Age,String License)
	{
		this.Name=Name;
		this.Age=Age;
		this.Licenseno=License;
		System.out.println("Rider's Name:"+Name);
		System.out.println("Rider's Age:"+Age);
		System.out.println("Rider's License Number :"+Licenseno);
		System.out.println("Rider is going to ridr the bike..");
		b.start();
		b.move();
		b.stop();
		
	}
}
