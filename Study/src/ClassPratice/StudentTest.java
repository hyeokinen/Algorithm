package ClassPratice;



public class StudentTest {

	public static void main(String[] args) {
		
		Student stu = new Student();

		stu.studentName = "김건";
		System.out.println(stu.studentName);
		
		
		stu.setStudentName("바곤유" );
		stu.setAddress("seoul");
		stu.setGrade(3);
		stu.setStudentID(20122165);
		
		System.out.println(stu.getStudentName());
		System.out.println(stu.toString());
		
	}

}
