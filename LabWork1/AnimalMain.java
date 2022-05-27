package ArrayCode;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal[] arr=new Animal[4];
		
		arr[0]=new Dog();
		arr[1]=new Tiger();
		arr[2]=new Tiger();
		arr[3]=new Dog();
		
		for(Animal a: arr)
		{
			a.makeSound();
		}

	}

}
