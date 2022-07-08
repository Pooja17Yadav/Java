package BeanProperties;

public class Main {

	public static void main(String[] args) 
	{
		BeanPerson p1 = new BeanPerson("1","Teena","Maharashtra","109987");
		BeanPerson p2 = new BeanPerson("2","Reena","Maharashtra","109956");
		BeanPerson p3 = new BeanPerson("3","Meena","Delhi","1092342");
		BeanPerson p4 = new BeanPerson("4","Geena","varanasi","1099067");
		
		if(p1.equals(p2))
				{
					System.out.println("Object are equal..");
				}
		else
				{
					System.out.println("Object are not equal..");
				}
	}

}
