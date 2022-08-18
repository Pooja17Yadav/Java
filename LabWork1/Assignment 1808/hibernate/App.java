package entity;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.Config;

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setPname("Pooja");
		p1.setCity("Mumbai");
		
		Person p2 = new Person();
		p2.setPname("Kiran");
		p2.setCity("New Mumbai");
		
		Person p3 = new Person();
		p3.setPname("Afsha");
		p3.setCity("Thana");
		
		Car c1 = new Car();
		c1.setCname("BMW");
		
		Car c2 = new Car();
		c2.setCname("Suzuki");
		
		Car c3 = new Car();
		c3.setCname("Audi");
		
		p1.setCar(c1);
//		c1.setPerson(p1);
		p2.setCar(c2);
//		c2.setPerson(p2);
		p3.setCar(c3);
//		c3.setPerson(p3);
		
		
		Session session = Config.configuration();
		Transaction t = session.beginTransaction();
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		
		session.save(c1);
		session.save(c2);
		session.save(c3);
		
		t.commit();
		session.close();
	}
		
}
