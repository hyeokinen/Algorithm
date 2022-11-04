package ClassStructure;

public class Person {
	// 필드
	// private으로 설정하는 것: 은닉화(hiding)
	private String name;
	private String birth; // yyyymmdd
	private String gender;

	// 메소드
	// getter, setter   캡슐화(encapsulation):외부에서는 캡슐화를 통해 필드에 접근한다.
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBirth() {
		return this.birth;
	}
	
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	// 생성자 오버로딩(Overloading): 파라미터의 타입이 다르거나, 개수가 다르거나 일치하는 메소드가 선택된다.
	// 생성자(Constructor) : 객체가 생성될 때 불려지는 특수한 메소드
	//   리턴타입이 아예 존재하지 않는다. 클래스명과 동일하다.
	public Person() {
		System.out.println("응애~~~");
	}
	
	// 생성자
	public Person(String name, String birth, String gender) {
		this.name = name;
		this.birth = birth;
		this.gender = gender;
	}
	
	public void greet() {
		System.out.println("안녕하세요~");
	}

	public void walk() {
		System.out.println("걷는다");
	}

	public void introduce() {
		System.out.println("내 이름은 " + this.name + "이고 성별은 " + this.gender + "이다.");
	}

	public void printAge() {
		String yearStr = this.birth.substring(0, 4); // yyyymmdd substring(0, 4) => yyyy
		int year = Integer.parseInt(yearStr);
		int age = 2021 - year + 1;
		System.out.println("나이는 " + age + "이다.");
	}
}
