package collection;

import java.util.LinkedHashMap;

public class Linkedhashmap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Float> num = new LinkedHashMap<Integer, Float>();
		num.put(1, 9.02f);
		num.put(2, 8.02f);
		num.put(3, 7.02f);
		num.put(4, 6.02f);
		num.put(5, 5.02f);
		num.put(6, 4.02f);
		num.put(7, 3.02f);
		num.put(8, 2.02f);
		num.put(9, 1.02f);
		System.out.println(num);
		System.out.println(num.clone());
		System.out.println(num.isEmpty());
		System.out.println(num.remove(8,8.4f));
		System.out.println(num.size());
		System.out.println(num.remove(7, 3.02f));
		
		
		LinkedHashMap<Double ,Character> ab =  new LinkedHashMap<Double ,Character>();
		ab.put(1.1, 'a');
		System.out.println(ab);
		
		LinkedHashMap<Integer, Integer> sum = new LinkedHashMap<Integer, Integer>();
		sum.put(1, 9);
		sum.put(2, 8);
		sum.put(3, 7);
		sum.put(4, 6);
		sum.put(5, 5);
		sum.put(6, 4);
		sum.put(7, 3);
		sum.put(8, 2);
		sum.put(9, 1);
		System.out.println(sum);

		LinkedHashMap<String, String> fn = new LinkedHashMap<String, String>();
		fn.put("Pratiksha", "Thute");
		fn.put("Nancy", "Choudhari");
		fn.put("Avni", "Galande");
		fn.put("Kiran", "zile");
		fn.put("Vishakha", "Chakole");
		System.out.println(fn);
		
	}
}
