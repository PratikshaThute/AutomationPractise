package country;

//public access modifier for class , method and variable
public class India {

	public String state1 = "MP";
	private String UT = "Diu & Daman";
	protected String name = "Bharat";
	
//	default variable
	String state2 = "Punjab";
	
//	default method
	void No_union_Territory(){
		System.out.println("8");
	}
	
	public void No_State() {
		System.out.println("In India there are 28 states from India as a parent class");
	}
	
	private void President() {
		System.out.println("President of India is Smt.Draupadi Murmu");
	}
	
	protected void quote() {
		System.out.println("Satyamev jayate");
	}
	
	public static void main(String[] args) {
		India in = new India();
		
//		public
		System.out.println(in.state1);
		in.No_State();
		
//		default
		System.out.println(in.state2);
		in.No_union_Territory();
		
//		Private access specifier
		in.President();
		System.out.println(in.UT);
		
//		protected
		in.quote();
		System.out.println(in.name);
	}

}
