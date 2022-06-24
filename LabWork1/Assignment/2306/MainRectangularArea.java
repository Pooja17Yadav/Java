package Ques_2;

import java.util.Scanner;

public class MainRectangularArea {

	public static void main(String[] args) {
		
		callRectangularArea();

	}

	private static void callRectangularArea() 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length = ");
		int length = sc.nextInt();
		
		System.out.println("Enter Breadth = ");
		int breadth = sc.nextInt();
		
		RectangularArea r1 = new RectangularArea(length, breadth);
		
		System.out.println(r1);
	}

}
