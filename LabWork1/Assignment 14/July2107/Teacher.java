import java.util.Objects;

public class Teacher {

	private String name;
	private String sub;
	
	public Teacher(String name, String sub)
	{
		this.setName(name);
		this.setSub(sub);
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getSub()
	{
		return sub;
	}
	public void setSub(String sub)
	{
		this.sub = sub;
	}
	@Override
	public int hashCode() 
	{
		return Objects.hash(name,sub);
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (this == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Teacher other = (Teacher) obj;
		return Objects.equals(name,other.name)&& Objects.equals(sub, other.sub);
	}
}
