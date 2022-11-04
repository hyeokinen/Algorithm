package ClassPratice;

public class Function {
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = addNum(num1, num2);
		System.out.println(sum);
		
		
	}
	// 메소드를 구현해봤다.
	public static int addNum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
}
