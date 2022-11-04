package Array;

public class Quiz01 {

	public static void main(String[] args) {
		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
		
		// 1. 배열 값 접근
		// 배열의 4번째 값을 6으로 바꾸세요.
		
		numbers[3] = 6;
		System.out.println(numbers[3]);
		
		// 2. 배열 출력
		// 배열의 값을 순서대로 출력하세요.
		
		for(int i = 0; i <=7; i++) {
			
			System.out.print(numbers[i]+" ");
		}	System.out.println();
		
		// 3. 배열 역순 출력
		// 배열의 값의 반대 순서(역순)로 출력하세요.
		for(int i = 7; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}	System.out.println();
		
		// 4. 배열 출력
		// 배열의 짝수번째 위치에 있는 값들을 출력하세요.
		for(int i = 1; i <= 8; i++) {
			if(i%2 != 0) {
				System.out.print(numbers[i]+" ");
			}	
				
		}		System.out.println();
		
		// 5. index
		// 배열의 값 중 2가 들어있는 index출력, 반복문을 통해 2가 있는 값을 찾으시오.
		// 출력: 2가 들어 있는 index는 4
		int num = 0;
		for(int i = 0; i <= 7; i++) {
			if(numbers[i] == 2) {
				num += i;
				System.out.println("2가 들어 있는 index는 " + num);
			}
		}
		
		// 6. 최대값
		// 배열의 값 중 가장 큰 값을 출력하세요.
		int max = 0;
		for(int i = 0; i <=7; i++) {
			if(max <= numbers[i]) {
				max = numbers[i];
			}
		}	System.out.println("가장 큰 값은 " + max);
			System.out.println();
			
		// 7. 평균
		int hap = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			hap += numbers[i];

		}
		double avg = hap / (double)numbers.length;
		System.out.println("평균은 " + avg);

	}	

}
