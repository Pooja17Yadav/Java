package Assignment5Ques1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		String Back="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		Back=sc.nextLine();
		int enteredword=Back.length();
		String reverse="";
		int i;
		for(i=(Back.length()-1);i>=0;--i)
		{
			reverse=reverse+Back.charAt(i);
}
		if(Back.equals(reverse))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}

}
