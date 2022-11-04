package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Quiz03 {

	public static void main(String[] args) {
		// 1. 체조 경기 평균 점수
		List<Integer> scores = new ArrayList<>(Arrays.asList(8, 7, 6, 10, 9, 4));

		// 오름차순으로 정렬 후
		scores.sort(Comparator.naturalOrder());

		// 첫번째와 맨 마지막 값을 제거한다.
		scores.remove(0);
		scores.remove(scores.size() - 1); // 맨 마지막 index

		int sum = 0;
		for (int i = 0; i < scores.size(); i++) {
			sum += scores.get(i);
		}
		System.out.println("최고점과 최저점을 제외한 평균 점수는 " + sum / (double) scores.size());

		// 2. 회원 추가하기(1)
		List<String> names = new ArrayList<>(Arrays.asList("우솝", "루피", "상디", "나미", "로빈")); // 기존 이름
		List<String> newNames = new ArrayList<>(Arrays.asList("보람", "루피", "쵸파", "로빈", "루피")); // 새로 입력할 이름
		List<String> resultList = new ArrayList<>();
		resultList.addAll(names);

		// newNames 리스트에 set 메소드로 숫자를 다 붙여놓은 후 addAll
		for (int i = 0; i < names.size(); i++) {
			int cnt = 0;

			for (int j = 0; j < newNames.size(); j++) {
				if (names.get(i).equals(newNames.get(j))) {
					cnt++;
					newNames.set(j, newNames.get(j) + cnt);
				}
			}
		}

		resultList.addAll(newNames);
		System.out.println(resultList);

//		// (2)
//		List<String> names = new ArrayList<>();
//		names.add("우솝");
//		names.add("루피");
//		names.add("상디");
//		names.add("나미");
//		names.add("로빈");
//		
//		// 새로 입력할 이름
//		List<String> newNames = new ArrayList<>();
//		newNames.add("보람");
//		newNames.add("루피");
//		newNames.add("쵸파");
//		newNames.add("로빈");
//		newNames.add("루피");
//		
//		int count = 1;
//		for (int i = 0; i < newNames.size(); i++) {
//			if (names.contains(newNames.get(i))) { // 동명이인이 있는 경우
//				String name = newNames.get(i) + count; // 동명이인인 경우 숫자를 붙인다.
//				// 숫자를 붙인 이름도 이미 있는지 확인
//				if (names.contains(name)) {
//					count++;
//					i--; // 이름+번호로 다시 검사하기 위해 같은 이름으로 반복문을 다시 돌린다.
//					continue;
//				}
//				
//				names.add(name);
//				count = 1; // 저장 후 count를 1로 초기화
//			} else {
//				// 동명이인이 없는 경우 바로 저장
//				names.add(newNames.get(i));
//			}
//		}
//
//		System.out.println(names);
//
//
//		// (3)
//		List<String> members = new ArrayList<String>();
//		members.add("우솝");
//		members.add("루피");
//		members.add("상디");
//		members.add("나미");
//		members.add("로빈");
//		
//		List<String> newMembers = new ArrayList<String>();
//		newMembers.add("프랑키");
//		newMembers.add("루피");
//		newMembers.add("쵸파");
//		newMembers.add("로빈");
//		newMembers.add("루피");
//		
//		// 새로운 이름을 기준으로 돌고 기존 리스트에 있는지 contains로 확인. 숫자를 붙인 이름도 있는지 확인
//		for(int i = 0; i < newMembers.size(); i++) {
//			String newMember = newMembers.get(i);
//			Integer count = 1;
//			while(members.contains(newMember)) {
//				newMember = newMembers.get(i) + count;
//				count++;
//			}
//			members.add(newMember);
//		}
//		
//		System.out.println(members);
	}

}
