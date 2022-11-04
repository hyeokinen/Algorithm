package Inheritance;

public class Person {
	protected String name;
	
	public Person() {
		System.out.println("응애~~");
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void introduce() {
		// 내 이름은 OO 입니다.
		System.out.println("내 이름은 " + this.name + "입니다.");
	}
}
