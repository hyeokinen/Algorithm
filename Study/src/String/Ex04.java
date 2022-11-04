package String;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			String word = scan.next(); // 단어
			System.out.println(word);
			
			scan.nextLine(); // 불필요한 엔터를 날려버린다.
			
			String text = scan.nextLine(); // 문장(스페이스바 포함)
			System.out.println(text);
			
			System.out.println("끝");
			scan.close();
	}

}
