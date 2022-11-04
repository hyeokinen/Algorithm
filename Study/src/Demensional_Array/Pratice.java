package Demensional_Array;

public class Pratice {

	public static void main(String[] args) {
		/*
		 * 배열 안에 배열이 자리 잡은 형태를 2차원 배열이라 한다.
		 * 2차원 배열은 여러개의 1차원 배열을 가진 배열이다.
		 * 배열의 크기는 모두 동일해야 한다.
		 */
		
		// 2차원 배열 초기화 방법
		int[][] scores = {
				{1,2,3,4},
				{5,6,7,8,},
				{9,10,11,12}
		};
		
		// 반복문을 통한 2차원 배열 접근
		for (int i = 0; i < scores.length; i++) { // 배열의 개수 만큼 반복(행)
			for (int j = 0; j < scores[i].length; j++) { // 1차원 배열 내의 개수 만큼 반복(열)
				System.out.print(scores[i][j]+" ");
			}	System.out.println();
		}
	}

}
