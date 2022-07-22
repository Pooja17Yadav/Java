package Arraylist;

import java.util.ArrayList;

public class ArrayListCheck {

	public static void main(String[] args) {
		
		ArrayList<String> firstList = new ArrayList<String>();
		
		ArrayList<String> secondList = new ArrayList<String>();
		
		secondList.add("Afsha");
		secondList.add("Kiran");
		secondList.add("Pooja");
		secondList.add("Neha");
		secondList.add("Humaira");
		
		System.out.println("second array List");
		System.out.println(secondList);
		
		firstList.addAll(secondList);
		if(firstList.containsAll(secondList))
		{
			System.out.println("Available");
		}
		else
		{
			System.out.println("Not Available");
		}

	}

}
