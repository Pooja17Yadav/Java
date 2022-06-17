
public class RooftopPoolCafeMain extends CafePooja
{

	public static void main(String[] args) 
	{
		ChooseCafe();
	}
	private static void ChooseCafe()
	{
		RooftopPoolCafeMain r1=new RooftopPoolCafeFactory().getRooftopPoolCafe();
		if(r1!=null)
		{
			r1.WelcomeDrink();
			r1.starter();
			((SwimmingPool)r1).Chill();
			((Rooftop)r1).ambiance();
			r1.manchuriyan();
			r1.noodles();
			((MughalResturant)r1).chickenBiryani();
			((MughalResturant)r1).chickenTikkaKabab();
		}
	}
	private void noodles() {
		// TODO Auto-generated method stub
		
	}
	private void manchuriyan() {
		// TODO Auto-generated method stub
		
	}
}
