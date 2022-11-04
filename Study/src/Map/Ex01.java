package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {

		// 주민번호 - 이름 이라고 생각하면 편하다.
		// key - value

		Map<String, Integer> map1 = new HashMap<>();
		map1.put("a", 1);
		map1.put("b", 2);
		map1.put("c", 3);
		map1.put("d", 4);
		System.out.println(map1);

		System.out.println(map1.get("a"));
		System.out.println(map1.get("b"));
		System.out.println(map1.get("c"));
		System.out.println(map1.get("d"));

		// 수정 : 기존에 있는 키에 put을 하면 수정이 된다.
		map1.put("b", 20);
		System.out.println(map1);

		// "c"라는 키가 존재하는가?
		System.out.println(map1.containsKey("c"));
		// value에 5가 있는가?
		System.out.println(map1.containsValue(5));
		// value에 4가 있는가?
		System.out.println(map1.containsValue(4));

		// map의 크기
		System.out.println(map1.size());

		// key만 가져오기
		Set<String> keys = map1.keySet();
		System.out.println("keys:" + keys);

		// value만 가져오기
		Collection<Integer> values = map1.values();
		System.out.println("values:" + values);

		// 키로 값 요소 삭제하기
		map1.remove("c");
		System.out.println("remove c map1:" + map1);
		// 키와 밸류로 요소 삭제하기
		map1.remove("d", 4);
		System.out.println("remove d map1:" + map1);

		// map에 map 전체 추가하기
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("z", 100);
		map2.putAll(map1);
		System.out.println("map2:" + map2);

	}

}
