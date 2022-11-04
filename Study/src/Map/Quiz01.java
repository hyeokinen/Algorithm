package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Quiz01 {

	public static void main(String[] args) {
		
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("Korean", 90);
		map1.put("Math", 85);
		map1.put("English", 90);
		map1.put("Society", 80);
		map1.put("Science", 100);
		
		System.out.println(map1);
		
		map1.put("Society", 85);
		System.out.println(map1);
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("조회할 과목명을 입력하세요: ");
//		String subject = scan.nextLine();
//		
//		if(map1.containsKey(subject)) {
//			System.out.println(map1.get(subject));
//		}
		
		Iterator<String> iter = map1.keySet().iterator();
		while (iter.hasNext()) {
			String subj = iter.next();
			if(map1.get(subj) >= 90) {
				System.out.println(subj + " ");
				
				
			}
		}
		

		if (map1.containsValue(100)) {
			System.out.println("수상 가능");
		} else {
			System.out.println("해당 없음");
		}
		
		
		
	}

}
