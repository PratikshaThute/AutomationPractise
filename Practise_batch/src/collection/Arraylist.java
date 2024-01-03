package collection;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		// accepts null value , duplicate values and maintain insertion order

		name.add("Prati");
		name.add("Pratik");
		name.add("Pratiksha");
		name.add("Pratigya");
		name.add("Prati");
		name.add("Preksha");
		name.add("Prashik");
		name.add("pradnya");
		name.add("Pradyumna");
		name.add(null);
		
		System.out.println("your arraylist contains :"+ name);
		
		System.out.println(name.get(3));
		
//		to get duplicate collection - clone method
		System.out.println(name.clone());
		
//		to check collection contain particular value or not - it is case sensitive
		System.out.println(name.contains("Preksha"));
		System.out.println(name.contains("preksha"));

		System.out.println(name.isEmpty());

		System.out.println(name.indexOf("pradnya"));

		System.out.println(name.size());
		name.remove(4);
		System.out.println("your arraylist contains :"+ name);

	}

}
