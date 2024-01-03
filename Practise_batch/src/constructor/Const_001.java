package constructor;

public class Const_001 {

	public Const_001() {
		System.out.println("This is User define Constructor");
	}
	
	public Const_001(String x, int y) {
		
		System.out.println("My name is "+ x);
		System.out.println("I am "+ y + " years old");
	}
	public static void main(String[] args) {
		Const_001 c1 = new Const_001();
		Const_001 c2 = new Const_001("Pratiksha", 25);
	}

}
