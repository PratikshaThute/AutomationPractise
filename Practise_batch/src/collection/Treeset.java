package collection;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet<Character> Vowels = new TreeSet<Character>();	
		Vowels.add('a');
		Vowels.add('e');
		Vowels.add('i');
		Vowels.add('o');
		System.out.println(Vowels);
		System.out.println(Vowels.add('u'));
		System.out.println(Vowels);
		System.out.println(Vowels.pollFirst());
		System.out.println(Vowels.pollLast());
		System.out.println(Vowels.ceiling('a'));
		System.out.println(Vowels.floor('o'));
	}
}
