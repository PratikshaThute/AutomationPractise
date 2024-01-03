package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> num = new LinkedHashSet<Integer>(); 
		
//		to print values from 10 to 30
		for(int i = 10; i<=30; i++) {
			num.add(i);
		}
//		Iterator<Integer> i = num.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
//		System.out.println(num);
		Iterator<Integer> p = num.iterator();
		while(p.hasNext()) {
			System.out.println(p.next());
		}
		
		System.out.println(num.contains(31));
		System.out.println(num.isEmpty());
		System.out.println(num.size());
		
	}
	

}
