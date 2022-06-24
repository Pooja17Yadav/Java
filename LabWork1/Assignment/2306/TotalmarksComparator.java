package Ques_1;

import java.util.Comparator;

public class TotalmarksComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1 ,Student o2)
	{
		return(int)(o1.total_marks-o2.total_marks);
	}

}
