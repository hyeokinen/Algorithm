package String;

public class EX02 {

	public static void main(String[] args) {
				// 자료형 변환
		
				// 1. 숫자 -> 문자열
				int number1 = 3;  // => "3"
				// 별로 안좋은 방법
				String str1 = number1 + "";  // 숫자 + 문자 = 문자
				System.out.println(str1);
				// 정석 방법
				String str2 = String.valueOf(number1);
				System.out.println(str2);
				
				// 2. 문자열 -> 숫자
				String str3 = "5";
				int number2 = Integer.parseInt(str3);
				number2 = Integer.valueOf(str3);
				System.out.println(number2);
				
				/*
				 * 문자열을 변환할 경우 지본 자료형(Primitive type)으로 받아 오고 싶을때는
				 * ParseInt를 사용하고 new Integer()형으로 반환하고 싶으면 valueOf를 사용하면 된다.
				 */
	}

}
