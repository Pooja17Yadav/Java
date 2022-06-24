package Ques_2;

public class RectangularArea 
{
	private int length;
	private int breadth;
	
	public int getL()
	{
		return length;
	}
	public void setL(int length)
	{
		if(length<10 || length>50)
		{
			System.out.println("Enter the length between 10 & 50");
		}
		this.length=length;
	}
	
	public int getB()
	{
		return breadth;
	}
	public void setB(int breadth)
	{
		if(breadth<5 || breadth>20)
		{
			System.out.println("Enter the breadth between 5 & 20");
		}
		this.breadth=breadth;
	}
	
	public RectangularArea(int length,int breadth)
	{
		setL(length);
		setB(breadth);
	}
	
	@Override
	public String toString() {
		return "RectangularArea[Length =" + getL() + " , Breadth = " + getB()+ "]" + "[Area = " + getL()*getB() +"]";
	}
}
