package Assignment4Quest3;

public class Main extends ATM 
{

	public static void main(String[] args) 
	{
		Main bank1=new Main();
		Main bank=new Main();
		Main bank2=new Main();
		bank1.Bank("BOB","Khairane Road,Sakinaka");
		bank.Bank("BOB",1234567892,"Khairane Road,Sakinaka");
		bank2.Bank("SBI","Khairane Road,Sakinaka,Andheri");
	}

}
