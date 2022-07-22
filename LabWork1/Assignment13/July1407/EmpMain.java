import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class EmpMain {

	public static void main(String[] args) {
		
		Emp e1 = new Emp(111,"Ram","abc");
		Emp e2 = new Emp(112,"Sita","xyz");
		Emp e3 = new Emp(113,"Raja","lmn");
		Emp e4 = new Emp(114,"Rani","ero");
		Emp e5 = new Emp(111,"Ram","abc");
		
		ArrayList<Emp>list = new ArrayList<Emp>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		System.out.println("Original list :");
		
		Iterator<Emp>itr = list.iterator();
		while(itr.hasNext())
		{
			Emp E1 = (Emp)itr.next();
			System.out.println(E1.getEmp_id()+" "+E1.getName()+" "+E1.getDept());
		}
		System.out.println(" ");
		
		Set<Emp> s = new LinkedHashSet<Emp>(list);
		
		System.out.println("After removing duplicate element :");
		
		Iterator<Emp>itr1 = s.iterator();
		while(itr1.hasNext())
		{
			Emp E2 = (Emp)itr1.next();
			System.out.println(E2.getEmp_id()+" "+E2.getName()+" "+E2.getDept());
		}

	}

}
