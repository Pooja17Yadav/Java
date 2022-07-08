package BeanProperties;

public class Main {

	public static void main(String[] args) 
	{
		BeanPerson p1 = new BeanPerson("1","Teena","Maharashtra","109987");
		BeanPerson p2 = new BeanPerson("2","Reena","Maharashtra","109956");
		BeanPerson p3 = new BeanPerson("3","Meena","Dehli","1092342");
		BeanPerson p4 = new BeanPerson("4","Geena","varansi","1099067");
		
		System.out.println("p1 and p2 object are equal as their hashcodes and value of one its property(address) are equal");
		System.out.println();
		
		System.out.println("p1 object : "+p1.hashCode( ) + "Address : " +p1.getAddress());
		System.out.println("p2 object : "+p2.hashCode() + "Address : " + p2.getAddress());
		System.out.println();
		
		System.out.println("p3 and p4 object are not equal as their hashcodes and value of one its property(address) are ont equal");
		System.out.println();
		
		System.out.println("p3 object : " + p3.hashCode() + "Address : " +p3.getAddress());
		System.out.println("p4 object : " + p4.hashCode() + "Address : " +p4.getAddress());
		
		System.out.println(p1.equals(p2));
	}

}
