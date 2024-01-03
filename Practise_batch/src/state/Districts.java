package state;

import country.State;

public class Districts extends State{

	public static void main(String[] args) {
		Districts ds = new Districts();
		
		System.out.println("method from parent class");
		ds.name();
		ds.No_State();
		
		System.out.println("------------------------------");
		
		System.out.println("variables from parent class");
		System.out.println(ds.No_state);
		System.out.println(ds.state1);
		
//		protected from package country
//		as there is inheritance so using child class variable we can access protected access specifier here
		ds.quote();
		System.out.println(ds.name);
	}

}
