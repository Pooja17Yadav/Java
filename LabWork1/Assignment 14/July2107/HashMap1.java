import java.util.HashMap;
import java.util.Map;
public class HashMap1 {

	public static void main(String[] args)
	{
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		
		hm.put(11,"Pooja");
		hm.put(12, "Kiran");
		hm.put(13, "Afsha");
		hm.put(14, "Neha");
		hm.put(15, "Humaira");
		
		System.out.println("Initial Mapping are :"+hm);
		
		System.out.println("The value is :"+hm.get(17));
		
		System.out.println("The value is :"+hm.get(15));
	}
}
