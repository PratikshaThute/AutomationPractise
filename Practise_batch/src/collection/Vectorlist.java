package collection;

import java.util.Iterator;
import java.util.Vector;

public class Vectorlist {

	public static void main(String[] args) {
		Vector<Float> count = new Vector<Float>();
		
		for(float h = 100.00f; h<=110.00f; h++) {
			if(h % 2 ==0) {
			count.add(h);
		}
		}
		Iterator<Float> p = count.iterator();
		while(p.hasNext()) {
			System.out.println(p.next());
		}
		
		System.out.println(count.clone());
		System.out.println(count.isEmpty());
		count.remove(104.0f);
		System.out.println(count);
		System.out.println(count.lastIndexOf(110.0f));
		System.out.println(count.size());
	}
}
