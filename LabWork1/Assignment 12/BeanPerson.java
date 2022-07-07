package BeanProperties;
import java.util.Objects;

public class BeanPerson 
{
	private String id;
	private String name;
	private String address;
	private String pincode;
	
	public BeanPerson(String id,String name,String address,String pincode)
	{
		this.id = id;
		this.name = name;
		this.address = address;
		this.pincode = pincode;
	}
	
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getPincode()
	{
		return id;
	}
	public void setPincode(String pincode)
	{
		this.pincode = pincode;
	}
	@Override
	public boolean equals (Object p)
	{
		if(this == p)
			return true;
		if(!(p instanceof BeanPerson))
			return false;
		BeanPerson other = (BeanPerson) p;
		return Objects.equals(address,other.address);	
	}
	@Override
	public int hashCode() {
		return Objects.hash(address);
	}
}
