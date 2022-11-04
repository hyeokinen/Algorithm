package ClassPratice;

/*
 * get은 데이터를 출력하는것 set은 데이터를 입력하는것 이라고 생각하면 된다.
 * 빈 엑셀 이름 파일에 set으로 홍길동 이름을 넣고 그 엑셀에 입력된 값을 출력하기위해 get을 사용한다.
 * 생성자는 초기값을 선언해
 */




public class Student {

	int studentID;
	String studentName;
	int grade;
	String address;
	
	// 메소드를 사용하는 방법은 이 클래스를 사용하는 쪽 입장에서 이름을 쓰면된다.
	// 메소드를 가져가야 함으로 get을 써야한다.
	public String getStudentName() {
		
		return studentName;
	}
	
	// 학생의 이름을 바꾸고 싶으면 set을 사용한다. 외부에서 이름을 바꾸는것이다.
	// 바꿀이름이 매개변수로 들어와야 한다.
	public void setStudentName(String name) {
		studentName = name;
	
	}
	

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", grade=" + grade + ", address="
				+ address + "]";
	}
	
	
}


