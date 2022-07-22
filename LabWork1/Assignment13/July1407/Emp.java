import java.util.Objects;

public class Emp {

	private int emp_id;
	private String name;
	private String dept;
	
	public Emp(int emp_id,String name,String dept)
	{
		this.emp_id=emp_id;
		this.name= name;
		this.dept= dept;
	}
	public int getEmp_id()
	{
		return emp_id;
	}
	public void setId(int emp_id)
	{
		this.emp_id=emp_id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getDept()
	{
		return dept;
	}
	public void setDept(String dept)
	{
		this.dept=dept;
	}
	@Override
	public boolean equals(Object e)
	{
		if(e instanceof Emp)
		{
			return(((Emp)e).emp_id==emp_id &&((Emp)e).dept==dept);
		}
		return false;
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(emp_id,dept);
	}
}
