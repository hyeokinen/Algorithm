package ClassQuiz;

public class Person {
	
	// field
	String name;
	String birth;
	String sex;
	
	// method
	public static String sayHi() {
		String hello = "How are you?";
		return hello;
	}
	
	public static void walk() {
		String walking = "I'm walking hard!";
		 System.out.println(walking);
	}
	
	public static String introduce(String name, String sex) {
		String selfPr = ("My name is "+ name + "and sex is " + sex );
		return selfPr;
	}
	
	public static String age(String age) {
		String agePr = ("My age is" + age);
		return agePr;
	}
	
	
	
	// get, set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirth() {
		return Integer.parseInt(birth.substring(0,4));
	}
	

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	
	
	
	
}
