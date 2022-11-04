package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test2 {

	public static void main(String[] args) {

		
//		List<Integer> list = new ArrayList<>();
//		list.add(8);
//		list.add(7);
//		list.add(6);
//		list.add(10);
//		list.add(9);
//		list.add(4);
//		
//		int max = list.get(0);
//		int min = list.get(0);
//		int hap = 0;
//		double avg = 0;
//		for(int i = 0 ; i < list.size(); i++) {
//			if(max <= list.get(i)) {
//				max = list.get(i);
//			}
//			else if(min >= list.get(i)) {
//				min = list.get(i);
//			}
//			list.remove(max);
//			list.remove(min);
//			System.out.println(list);
//		}
//		
//		for(int i = 0; i < list.size(); i++) {
//			hap += list.get(i);
//		}
//		
//		avg = (double)hap/list.size();
//		System.out.println(avg);
		
		
		
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
		
		
		
		
		
		
		
		

		
		
		

		
		
		

		
		
		

		
		
		
		
		
		
		
		
	}

}
