package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		num.add(3);
		num.add(8);
		num.add(9);
		num.add(4);
		num.add(2);
		num.add(1);
		num.add(7);
		num.add(5);

		System.out.println(num);

		num.set(3, 6);
		System.out.println(num);

		num.remove(1);
		num.remove(5);

		System.out.println(num);

		int num2 = num.get(0);
		System.out.println(num2);

		int min = num.get(0);
		for (int i = 0; i < num.size(); i++) {

			if (min > num.get(i)) {
				min = num.get(i);
			}
		}
		System.out.println(min);

		
		int sum = 0;
		Iterator<Integer> iter = num.iterator();
		while(iter.hasNext()) {
			sum += iter.next();
		}
		System.out.println(sum);
		
		
		
		
	}

}
