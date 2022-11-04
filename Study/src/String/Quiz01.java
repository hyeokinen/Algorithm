package String;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 1. 문자열 정수 변환
		// 아래와 같이 생년이 저장된 String 이 있을때 올해 나이를 출력하세요.(한국나이)
		// String birthday = "1995";
		// 출력: 28세
		Scanner scan = new Scanner(System.in);
		
		String birthday = "1997";
		int num = Integer.parseInt(birthday);
		int age = 2022-num;
		System.out.println("만 "+(age+1) + "세 ");
		
		
		// 2. 문자열 변환
		// 아래 문자열에서 A를 B로 바꿔서 출력 하세요.
		String gradeStr = "My grade is A";
		gradeStr = gradeStr.replace("A", "B");
		System.out.println(gradeStr);
		
		// 3. 문자열 정수 변환
		String birth = "19970922";
		int num2 = Integer.parseInt(birth.substring(0,4));
		System.out.println((2022-num2+1)+"살");
		
		// 4. 문자열 검색
		// 아래 문자열의 단어 개수를 출력 하세요.
		String sentence = "To be, or Not to Be. That Is The Question";
		String[] words = sentence.split(" ");
		System.out.println("단어 개수:" + words.length);
		
		// 5. 문자열 입력
		System.out.print("ID를 입력 하세요 : ");
		String id = scan.nextLine();
		System.out.println("Welcome " + id);
		
		
		// 6. 문자열 검색 
		// 영어 단어를 입력받고 'e' 가 몇개 들어 있는지 출력 하세요.
		System.out.print("Enter the word: ");
		String word = scan.nextLine();
		int count = 0;
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i)=='e') {
				count++;
			}
		}System.out.println(count + "개 ");
		
		
		scan.close();
		
		
	}

}
