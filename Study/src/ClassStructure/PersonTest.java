package ClassStructure;

public class PersonTest {

	public static void main(String[] args) {
		Person per = new Person();
	// private 필드이므로 직접 접근 불가
//		boram.name = "신보람";
//		boram.yyyymmdd = "1990101";
//		boram.gender = "여자";

//		boram.setName("신바다");
//		boram.setGender("남자");
//		boram.setYyyymmdd("20200101");
//		
//		boram.greet();
//		boram.walk();
//		boram.introduce();
//		boram.printAge();
//		
//		String name = boram.getName();
//		System.out.println(name);	
		per.greet();
		per.setName("kim");
		per.setGender("male");
		System.out.println(per.getName());
		per.introduce();
	}
}
