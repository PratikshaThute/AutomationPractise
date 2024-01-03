package country;

public class State extends India {

	public int No_state = 28;
	int MH_Dist = 36;
	
	public void name() {
		System.out.println("Maharashtra state from state as a child class");
	}
	
	public static void main(String[] args) {
		State Map = new State();
		
		// public from current class
		System.out.println(Map.No_state);
		Map.name();
		
		// Public access specifiers from parent class
		System.out.println(Map.state1);
		Map.No_State();
		
//		Default access specifier
		Map.No_union_Territory();
		System.out.println(Map.state2);
		System.out.println(Map.MH_Dist);
		
//		protected
		Map.quote();
		System.out.println(Map.name);
	}

}
