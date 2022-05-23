package covidvaccination;

import java.util.Scanner;

public class BoosterDoze {

	private static String Nationality;
	private static String Gender;
	private static int Age;
	
	public static String getNationality() {
		return Nationality;
	}


	public static void setNationality(String nationality) {
		Nationality = nationality;
	}


	public static String getGender() {
		return Gender;
	}


	public static void setGender(String gender) {
		Gender = gender;
	}


	public static int getAge() {
		return Age;
	}


	public static void setAge(int age) {
		
		
		Age = age;
		
	}
	


	static void nationalityCheck(String nationality)throws NationalityCheck,EligibilityCheck
	{
		
		
		if(nationality.equalsIgnoreCase("indian") || nationality.equalsIgnoreCase("india") )
		{
			genderCheck(getAge(), getGender());
		}
		else
		{
			throw new NationalityCheck();
		}
	}
	
	
	static void genderCheck(int age,String gen)throws EligibilityCheck
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter gender : ");
		gen=sc.nextLine();
		
		System.out.println("Enter age : ");
		age=sc.nextInt();
		
		sc.close();
		
		setAge(age);
		
		setGender(gen);
		
		if((Gender.equalsIgnoreCase("Male") && Age>=60) || (Gender.equalsIgnoreCase("Female") && Age>=50))
			{
				System.out.println("You Are Eligible For Doze..");
			}
			else
			{
				throw new EligibilityCheck(Age,Gender);
			}
	}
}
		


