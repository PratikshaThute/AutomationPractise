package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_1 {

	public static void main(String[] args) {
		ArrayList<Integer>num = new ArrayList<Integer>();
		num.add(9);
		num.add(8);
		num.add(9);
		num.add(7);
		num.add(6);
		num.add(5);
		num.add(4);
		num.add(3);
		num.add(7,2);
		num.add(8,1);
//		System.out.println(num);
		
		Iterator<Integer> i = num.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
