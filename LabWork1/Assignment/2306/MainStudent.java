package Ques_1;

import java.util.Arrays;
import java.util.Scanner;

public class MainStudent 
{
	void sortingByTakingUserInput()
	{
		Scanner sc1 =new Scanner(System.in);
		Scanner sc2 =new Scanner(System.in);
		
		System.out.println("Enter the number of Students =");
		int m =sc1.nextInt();
		Student[] student =new Student[m];
		System.out.println("Enter Students Details =");
		
		for(int i=0;i<m;i++)
		{
			System.out.print("Rollno=");
			int rollno= sc1.nextInt();
			System.out.print("Name =");
			String name = sc2.nextLine();
			System.out.print("Subject =");
			String subject= sc1.nextLine();
			System.out.print("Total Marks =");
			int totalmarks= sc1.nextInt();
			student[i]=new Student(rollno,name,subject,totalmarks);
		}
		sc1.close();
		sc2.close();
		
		System.out.println();
		System.out.println("Student details.");
		System.out.println();
		
		for(int i=0;i<m;i++)
		
		{
			System.out.println("Rollno="+student[i].rollno+" " +" Name="+student[i].name+" "+"Subject="+student[i].subject+" "+"Totalmarks="+student[i].total_marks);
		}
			System.out.println();
			System.out.println("Sorting of student by Alphabetical order of name .");
			System.out.println();
			
			Arrays.sort(student, new NameComparator());
			for(Student s1 : student)
			{
				System.out.println(s1 +" ");
			}
			
			System.out.println();
			System.out.println("Sorting of student by Total Marks.");
			System.out.println();
			
			Arrays.sort(student, new NameComparator());
			for(Student s1 : student)
			{
				System.out.println(s1 +" ");
			}
	}
	public static void main(String[]args)
	{
		MainStudent s1 =new MainStudent();
		s1.sortingByTakingUserInput();
	}
	
}
