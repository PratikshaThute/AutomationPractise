package java_basic;

public class DefaultValue {
// instance variable
	String a = "ab";
	
	byte b;
	short c;
	int d;
	long e;
	float f;
	double g;
	String h;
	char i;
	public static void main(String[] args) {
		DefaultValue b = new DefaultValue();
		System.out.println(b.a);
		
		System.out.println("byte data type-"+ b.b);
		System.out.println("short data type-"+ b.c);
		System.out.println(" int data type-" +b.d);
		System.out.println(" longdata type-"+ b.e);
		System.out.println("float data type-"+b.f);
		System.out.println("double data type-" +b.g);
		System.out.println("String data type-" +b.h);
		System.out.println("char data type-"+ b.i);
		System.out.println(" ");
	}

}
