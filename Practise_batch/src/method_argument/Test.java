package method_argument;

public class Test {

	int a;
	String b;
	
	public int division(int d,int e) {
		return d/e;
	}
	
	public void abc(int x) {
		a=x;
		System.out.println(x);
	}
	public static void main(String[] args) {
		Test v = new Test();
		v.abc(5);
		System.out.println(v.a);
		System.out.println(v.division(25, 5));
	}

}
