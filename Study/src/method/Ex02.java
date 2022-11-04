package method;

public class Ex02 {

	public static void main(String[] args) {
		// 메소드 만들기
				// 1. 어떤 함수를 만들지 메소드명을 짓는다.(동사)
				// 2. input을 무엇을 받을지 생각한다.
				// 3. output을 무엇으로 돌려줄지 생각한다.
				// 4. 구현
				
				// 메소드를 사용하는 곳
				int x = 30;
				int y = 50;
				int result = sum(x, y);  // 전달 인자 (argument)
				System.out.println(result);
				System.out.println(sum(x, y));
				
				printHelloWorld();
	}
				
				public static int sum(int a, int b) {  // 매개변수(parameter)
					return a + b;
				}
				
				public static void printHelloWorld() {
					System.out.println("Hello world");
					System.out.println("Hello world");
					return; // 생략 가능 . return을 만나면 메소드가 종료된다.
				
	}

}
