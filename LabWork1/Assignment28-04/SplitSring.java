package Assignment5question3;

import java.util.Scanner;

public class SplitSring {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a String :");
		String s1=s.nextLine();
		String[] arr=s1.split(" ");
		
		for(int i=2;i<=arr.length;i--)
		{
			System.out.println(arr[i]); 
		}
	}

}
