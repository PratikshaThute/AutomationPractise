package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
	public static void main(String[] args) {
		HashSet<String> State = new HashSet<String>();
		State.add("MH");
		State.add("TN");
		State.add("UP");
		State.add("MP");
		State.add("AP");
		State.add("Telangana");
		State.add("Gujarat");
		State.add("Rajasthan");
		State.add("Punjab");
		State.add(null);
		State.add("MH");
		System.out.println(State);
//		System.out.println(State.size());
//		System.out.println(State.contains("UP"));
//		System.out.println(State.isEmpty());
//		System.out.println(State.clone());
//		State.remove("Rajasthan");
//		System.out.println(State);
//		State.clear();
//		System.out.println(State);
		
		 Iterator<String> n = State.iterator();
		 while(n.hasNext()) {
			 System.out.println(n.next());
		 }
	}
}
