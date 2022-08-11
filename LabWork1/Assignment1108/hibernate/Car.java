package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int car_no;
	private String cname;

//	@OneToOne
//	private Person person;

	public Car(int car_no, String cname, String brand) {
		super();
		this.car_no = car_no;
		this.cname = cname;
	}
	public Car()
	{
		super();
	}
	public int getCar_no() {
		return car_no;
	}
	public void setCar_no(int car_no) {
		this.car_no = car_no;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
//	public Person getPerson() {
//		return person;
//	}
//	public void setPerson(Person person) {
//		this.person = person;
//	}
}

