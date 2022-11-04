package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz01 {

	public static void main(String[] args) {
		// 1. List 만들기
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(8);
		list.add(9);
		list.add(4);
		list.add(2);
		list.add(1);
		list.add(7);
		list.add(5);

		System.out.println(list);

		// 또는
		// Arrays.asList로 만들면 값을 수정하거나 삭제할 수 없다.(고정 리스트로 만들어진다.)
		List<Integer> list1 = Arrays.asList(3, 8, 9, 4, 2, 1, 7, 5);
		System.out.println(list1);

		// 새로운 ArrayList의 생성자에 넣으면 변경이 가능해진다.
		List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 8, 9, 4, 2, 1, 7, 5));
		list2.add(10);
		System.out.println(list2);

		// 2. 값 수정하기
		list.set(3, 6);
		System.out.println(list);

		// 3. 값 삭제하기
		list.remove(1); // 삭제 후 인덱스가 바뀐다.
		list.remove(5); // [3, 9, 6, 2, 1, 7, 5]
		System.out.println(list);

		// 또는
		Integer value = 8;
		list.remove(value); // 값으로 삭제
		System.out.println(list);

		list.remove(5); // index로 삭제
		System.out.println(list);
	}

}