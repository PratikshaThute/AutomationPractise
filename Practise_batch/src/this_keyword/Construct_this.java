package this_keyword;

public class Construct_this {
	public Construct_this() {
		this(4);
		System.out.println("User define");
	}
	
	public Construct_this(int a) {
		
		System.out.println("Parameterized constructor");
	}
	
	
	public static void main(String[] args) {
		Construct_this h = new Construct_this();

	}

}
