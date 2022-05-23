package covidvaccination;

@SuppressWarnings("serial")
public class EligibilityCheck extends Exception {

	public EligibilityCheck(int age,String gen)
	{
System.out.println("Not Eligible For The Doze.! For Male 60 Female 50 needed !");
		
		if(gen.equalsIgnoreCase("female"))
		{
			System.out.println("Need more "+ (50-age) +" yrs to eligible");
		}
		
		if(gen.equalsIgnoreCase("male"))
		{
			System.out.println("Need more "+ (60-age) +" yrs to eligible");
		}
	}

}
