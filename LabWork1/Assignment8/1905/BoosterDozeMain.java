package covidvaccination;
import java.util.Scanner;
public class BoosterDozeMain {
public static void main(String[] args)throws NationalityCheck,EligibilityCheck{
		
		try {
		
			Scanner sc=new Scanner(System.in);
			
		//	BoosterDoze b1= new BoosterDoze();
			
			System.out.println("Enter nationality : ");
			String n=sc.nextLine();
			
			BoosterDoze.setNationality(n);
			
			BoosterDoze.nationalityCheck(BoosterDoze.getNationality());
			
//			System.out.println("Enter gender : ");
//			String g=sc.nextLine();
//			
//			System.out.println("Enter age : ");
//			int a=sc.nextInt();
//			
//			b1.setAge(a);
//			
//			b1.setGender(g);
//			
			sc.close();
	
		}
		
		catch (EligibilityCheck| NationalityCheck e) {
			System.out.println("Exception handled in catch block " + e);
		}
	

	}


}
