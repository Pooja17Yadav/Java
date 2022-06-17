import java.util.Scanner;

public class RooftopPoolCafeFactory 
{
	Scanner sc = new Scanner(System.in);
	RooftopPoolCafeMain getRooftopPoolCafe()
	{
		System.out.println("Which cafe you want to visit :");
		String cafe=sc.nextLine();
		
		if(cafe.equalsIgnoreCase("Pooja"))
		{
			System.out.println("Welcome to Pooja cafe");
			return RooftopPoolcafeFactory();
		}
		else
		{
			System.out.println("Welcome to Tara cafe");
			return RooftopPoolcafeFactory();
		}
	}
	private RooftopPoolCafeMain RooftopPoolcafeFactory()
	{
		return null;
	}
	
}
