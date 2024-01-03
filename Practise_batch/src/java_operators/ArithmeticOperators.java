package java_operators;

public class ArithmeticOperators {

	public static void main(String[] args) {

//		Arithmetic operators
		
//		addition
		System.out.println("addition");
		int a = 25;
		int b = 30;
		System.out.println(a+b);
		
		short i = 70;
		long j = 50;
		System.out.println(i+j);
		System.out.println("---------------------------------------------------------");
		
//		multiplication
		System.out.println("multiplication");
		int c = 12;
		int d = 12;
		System.out.println(c*d);
		
		float k = 10f;
		int l = 15;
		System.out.println(k*l);
		System.out.println("-----------------------------------------------------");
		
//		Subtraction
		System.out.println("subtraction");
		double e = 99.12;
		double f = 88.10;
		System.out.println(e-f);
		
		float g = 45.23f;
		double h = 10.23;
		System.out.println(g-h);
		System.out.println("--------------------------------------------------------");
		
//		division
		System.out.println("division");
		int m = 50;
		int n = 15;
//		the % sign gives the reminder of division
		System.out.println(m%n);
		
		float q = 625f;
		float r = 25f;
		System.out.println(q%r);
		
		
//		single forward slash is use to get the quotient of division
		float o = 625f;
		float p = 25f;
		System.out.println(o/p);
		
		System.out.println("---------------------------------------------------------------");
		
//		increment ++variable
		System.out.println("increment");
		int v= ++m;
		System.out.println(v);
		
		float s = ++q;
		System.out.println(s);
		
		double t = ++h;
		System.out.println(t);
		
		System.out.println("---------------------------------------------------------------");

//		decrement --variable
		System.out.println("decrement");
		int gh= --l;
		System.out.println(gh);
		
		float st = --k;
		System.out.println(st);
		
		double wz = --e;
		System.out.println(wz);
	}

}
