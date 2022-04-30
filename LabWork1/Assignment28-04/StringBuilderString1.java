package Assignment5Question5;

public class StringBuilderString1 {

	public static void main(String[] args) 
	{
		String s1="Mahendr";
		StringBuilder sb1=new StringBuilder("Suresh");
		s1.concat("Singh");
		sb1.append(" Raina");
		System.out.println(s1);
		System.out.println(sb1);
		System.out.println("String is Immutable and String Builder is not Immutable");
	}
}


