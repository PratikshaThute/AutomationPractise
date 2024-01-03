package this_keyword;

public class Const_this {
	
	public Const_this() {
		System.out.println("User define");
	}
	
	public Const_this(int a) {
		this();
		System.out.println("Parameterized constructor");
	}
	
	public static void main(String[] args) {
		Const_this d= new Const_this(21);
		

	}

}
