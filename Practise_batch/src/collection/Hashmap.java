package collection;

import java.util.HashMap;

public class Hashmap {
	public static void main(String[] args) {
		
		HashMap<Integer, String> flower = new HashMap<Integer, String>();
		flower.put(1,"Lotus");
		flower.put(2, "Rose");
		flower.put(3, "Marigold");
		flower.put(4, "Hibiscus");
		flower.put(5, "Lily");
		flower.put(6, "Tulip");
		flower.put(7, "Jasmine");
		flower.put(8, "Daisy");
		flower.put(9, "Periwinkle");
		flower.put(0, "Orchid");
		
		System.out.println(flower);
		
		flower.put(3, "Lavender");
		
		System.out.println(flower);
		
		System.out.println(flower.isEmpty());
		
		System.out.println(flower.size());
		
		System.out.println(flower.values());
		
		System.out.println(flower.replace(7, "Crape Jasmine"));
		System.out.println(flower);

		
		System.out.println(flower.replace(0, "Orchid","Creeper"));
		System.out.println(flower);
		
		System.out.println(flower.clone());
		
		flower.remove(4);
		System.out.println(flower);
		
		flower.remove(1,"Lotus");
		System.out.println(flower);
		
		flower.clear();
		System.out.println(flower);

	}
}
