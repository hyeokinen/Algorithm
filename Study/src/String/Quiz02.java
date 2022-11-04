package String;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 문자열 검색
		// 파일이름이 저장된 문자열 배열에서 jpg 파일이 몇개인지 출력하세요.
		// 1. 파일 개수
		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
		int count = 0;
		for (int i = 0; i < files.length; i++) {
			String fileName = files[i];
			boolean isJpg = fileName.endsWith("jpg");
			if (isJpg) {
				count++;
			}
		}
		System.out.println("jpg의 파일 개수:"  + count);
		
		// 2. 
//		1. 승리을 영어로 입력하세요 :victory
//		2. 사랑을 영어로 입력 하세요 :lobe
//		3. 컴퓨터를 영어로 입력 하세요 :computer
//		4. 노트북을 영어로 입력하세요 :notebook
		
		// 2-1
		
		int score = 0;
		
		System.out.print("승리을 영어로 입력하세요 :");
		String answer = scan.next();
		if (answer.equals("victory")) {
			score += 100 / 4;
		}
		
		System.out.print("사랑을 영어로 입력 하세요 :");
		answer = scan.next();
		if (answer.equals("love")) {
			score += 100 / 4;
		}
		
		System.out.print("컴퓨터를 영어로 입력 하세요 :");
		answer = scan.next();
		if (answer.equals("computer")) {
			score += 100 / 4;
		}
		
		System.out.print("노트북을 영어로 입력 하세요 :");
		answer = scan.next();
		if (answer.equals("notebook")) {
			score += 100 / 4;
		}
		
		System.out.println("점수: " + score);


		// 2-2. 배열 사용
//		String[] quizWord = {"승리", "사랑", "컴퓨터", "노트북"};
//		String[] answerWord = {"victory", "love", "computer", "notebook"};
//		int score = 0;
//		for (int i = 0; i < quizWord.length; i++) {
//			System.out.print(quizWord[i] + "를 영어로 입력하세요:");
//			String answer = scan.next();
//			if (answer.equals(answerWord[i])) {
//				score += 25;
//			}
//		}
//		System.out.println("점수:" + score);
//		
		// 3. 동명이인 종류 수

		// 3-1. 마킹하기
		String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";
		String[] names = memberStr.split(":");
		int resultCount = 0;
		
		for (int i = 0; i < names.length - 1; i++) {
			String name = names[i];   // 검사할 기준 이름
			boolean isSame = false;
			
			if (name.equals("")) { // 동명이인으로 체크되서 빈칸인 경우 skip
				continue;
			}
			
			for (int j = i + 1; j < names.length; j++) {
				if (name.equals(names[j])) {
					isSame = true;
					names[j] = "";
				}
			}
			
			if (isSame) {
				resultCount++;
			}
		}
		
		System.out.println("동명이인 종류 수 :" + resultCount);


		// 3-2. 심플하게
//		String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";
//		String[] memberArr = memberStr.split(":");
//		int resultCount = 0;
//		
//		for (int i = 0; i < memberArr.length - 1 ; i++) {
//			int sameCount = 0;
//			for (int j = i + 1; j < memberArr.length; j++) {
//				if (memberArr[i].equals(memberArr[j])) {
//					sameCount++;
//				}
//			}
//			if (sameCount == 1) { 
//				resultCount++;
//			}
//		}
//		System.out.println(resultCount);
		scan.close();
	}

}
