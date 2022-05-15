package Bikes;
import java.util.Scanner;
public class BikeManufacturer 
{
	Bike getBike()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Bike Nane:");
		String b=s.nextLine();
		if(b.equalsIgnoreCase("Hero"))
		{
			return new Hero();
		}
		else if(b.equalsIgnoreCase("Honda"))
		{
			return new Honda();
		}
		else
		{
			return null;
		}
	}
}
