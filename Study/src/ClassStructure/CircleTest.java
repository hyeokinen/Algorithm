package ClassStructure;

import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Circle cir1 = new Circle();
		cir1.setRadius(8);
		System.out.println("area: "+ cir1.area());
		System.out.println("round: "+ cir1.round());
		System.out.print("숫자를 입력하세요: ");
		int number = scan.nextInt();
		cir1.setCount(number);
		System.out.println("count area: " + cir1.num());
		
		scan.close();
	}

}
