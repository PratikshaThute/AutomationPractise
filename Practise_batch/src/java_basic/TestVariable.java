package java_basic;

public class TestVariable {

	String a = "Pratiksha";
	
	public void name() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		TestVariable s = new TestVariable();
		s.name();
		System.out.println(s.a);
	}

}
