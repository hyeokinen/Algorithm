package Abstract_Class;

public class AnimalTest {

	public static void main(String[] args) {
		//Animal animal = new Animal(); // error! 추상 클래스는 객체화 할 수 없다.

		Animal animal = new Dog(); // dog -> animal : up casting
		animal.eat();
		animal.cry();
		
		Animal animal2 = new Tiger();
		animal2.cry();
		
		Dog animal3 = (Dog)animal;
		animal3.cry();
	}

}