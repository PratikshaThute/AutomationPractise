package collection;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<Double> Percent = new LinkedList<Double>();
		Percent.add(77.38);
		Percent.add(88.18);
		Percent.add(86.50);
		Percent.add(88.65);
		Percent.add(null);
		Percent.add(null);
// accepts null value , duplicate values and maintain insertion order
		System.out.println("The percentage list is as follows : " + Percent);

//		to get duplicate collection - clone method
		System.out.println(Percent.clone());

//		to check the collection is empty or not
		System.out.println(Percent.isEmpty());

//		size -length of collection
		System.out.println(Percent.size());

//		first value of collection
		System.out.println(Percent.getFirst());

//		last value of collection
		System.out.println(Percent.getLast());

//		to check collection contains the particular value
		System.out.println(Percent.contains(86.50));

//		to remove particular value
		Percent.remove(86.50);
		System.out.println(Percent);

//		to remove first value
		Percent.removeFirst();
		System.out.println(Percent);

//		to remove last value
		Percent.removeLast();
		System.out.println(Percent);

//		to clear collection
		Percent.clear();
		System.out.println(Percent);

	}
}
