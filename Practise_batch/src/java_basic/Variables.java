package java_basic;

public class Variables {

//	instance variable
	int a = 12;
//	static variable
	static double d = 25.3654;
	
//	instance method
	public void variable() {
		System.out.println(a);
		System.out.println(d);
		System.out.println(Variables.d);
	}
	
//	local variable
	public void function() {
		float f = 23.256f;
		System.out.println(f);
	}
	
	public static void func1() {
		byte s = 32;
		System.out.println(s);
	}
	
//	static method
	public static void main(String[] args) {
		Variables v = new Variables();
		System.out.println(v.a);
		v.variable();
		v.function();
		func1();
		
	}

}
