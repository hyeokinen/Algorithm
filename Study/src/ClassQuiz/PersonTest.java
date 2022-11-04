package ClassQuiz;

public class PersonTest {

	public static void main(String[] args) {
		Person per = new Person();

//		per.setName("KIM");
//		per.setSex("Male");
		per.setBirth("19970922");
		
//		String bir = per.birth.substring(0,4);
		
//		int age1 = Integer.parseInt(bir);
		int age2 = ((2022-per.getBirth()+1));
		System.out.println(age2);
		
		
		
		System.out.println(per.introduce("hyeok", "male"));
		per.walk();
		System.out.println(per.sayHi());
	}

}
