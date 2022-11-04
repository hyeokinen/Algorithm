package Demensional_Array;

public class Quiz01 {

	public static void main(String[] args) {
		int[][] scores = {
			    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
			    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
			    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
			    {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
			    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
			};
		
		// 1. 학생별 평균 구하기
		for(int i = 0; i < scores.length; i++) {
			int sum = 0;
			for(int j =0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}double avg = (double)sum/scores[i].length;
			System.out.println(i+1 +"번째 학생의 평균은 " + avg );
		}	
		
		// 2. 학생별 최고점 구하기
		for(int i = 0; i < scores.length; i++) {
			int max = 0;
			for(int j = 0; j < scores[i].length; j++) {
				if(scores[i][j] >= max) {
					max = scores[i][j];
				}
			}System.out.println(i+1 + "번째 학생의 최고점은 " + max);
		}
		
		// 3. 평균 최고점 구하기
		
		int index = 0;
		double bestAverage = 0;
		
		for(int i = 0; i < scores.length; i++) {
			int total = 0;
			for(int j = 0; j < scores[i].length; j++) {
				total += scores[i][j];
			}
			double average = (double)total/scores[i].length;
			if(bestAverage <= average) {
				bestAverage = average;
				index = i;
			}
		}
		System.out.println(index+1 + "번째학생이 최고 평균이고 평균은 " + bestAverage+ "점 입니다.");
		
		
		// 4. 특정 과목 최고점
		// 4번째 과목의 최고 성적의 학생이 몇 번째 학생인지와 점수를 출력하세요.
		int num = 0;
		int best = 0;
		for(int i = 0; i < scores.length; i++) {
			int score = 0;
			for(int j = 0; j < scores[i].length; j++) {
				score = scores[i][3];
			}
			if(score >= best) {
				best = score;
				num = i+1;
			}
		}System.out.println("4번째 과목의 최고 성적은 " + best + "점이고 " + num + "번째 학생입니다. ");
		
		
		// 5. 일부 평균 최고점
		// 시험과목 index 3~7의 평균이 가장 높은 학생의 index를 구하여 출력하세요.
		// 출력: 3~7 과목 평균이 가장 높은 학생은 3번째 학생이고, 평균은 93.8입니다.
		double maxAverage = 0;
		int num2 = 0;
		for(int i = 0; i < scores.length; i++) {
			int hap = 0;
			for(int j = 3; j <= 7; j++) {
				hap += scores[i][j];
			}
			double avg1 = (double)hap/5;
			if(avg1 >= maxAverage) {
				maxAverage = avg1;
				num2 = i+1;
			}
		}
		System.out.println("3~7 과목 평균이 가장 높은 학생은 " + num2 + "이고 평균은 " + maxAverage);
		
		// 2차원 배열에서 중요한점은 반복문 안에서의 순서이다.
		
		
		
		
		
		
	}

}
