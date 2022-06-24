package Ques_1;

public class Student 
{
	int rollno;
	String name;
	String subject;
	int total_marks;
	
	public Student(int rollno,String name,String subject,int total_marks)
	{
		super();
		this.rollno=rollno;
		this.name=name;
		this.subject=subject;
		this.total_marks=total_marks;
	}
	public Student()
	{
		
	}
	public int getrollno()
	{
		return rollno;
	}
	public void setrollno(int rollno)
	{
		this.rollno=rollno;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getsubject()
	{
		return subject;
	}
	public void setsubject(String subject)
	{
		this.subject=subject;
	}
	public int gettotal_marks()
	{
		return total_marks;
	}
	public void settotal_marks(int total_marks)
	{
		this.total_marks=total_marks;
	}
	
	
	@Override
	public String toString()
	{
		return"Student[name : "+ getname() +" ,rollno : "+ getrollno() +" , subject : "+ getsubject() +",total_marks : "+ gettotal_marks() +" ]";	
	}
}
