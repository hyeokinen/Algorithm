package Array;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		int[] numbers = {3, 5, 2, 10, 39};
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("두 개의 index를 입력하세요:");
		int index1 = scan.nextInt();
		int index2 = scan.nextInt();
		
		int temp = numbers[index1];
		numbers[index1] = numbers[index2];
		numbers[index2] = temp;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}
}


