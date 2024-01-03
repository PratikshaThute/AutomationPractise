package method_argument;

public class Arguments {
	
	String a;
	int d;
	static float h;
	
//	instance method
	public void days(String b) {
		a=b;
		System.out.println(a);
	}
	
	public void month(int m) {
		d=m;
		System.out.println(d);
	}
	
//	instance method and local variable
	public void calender(int n) {
		int o = n;
		System.out.println("the calender year has " + o + " months");
	}
	
//	static method and local variable
	public static void year (boolean k){
		boolean u = k;
		System.out.println("the current year is 2023 : "+ u);
	}
	
	public static void yz(double ij) {
		double kl = ij;
		System.out.println("method yz : " + kl);
	}
	
//	static method and instance variable
	public static void abd(float g) {
		h=g;
		System.out.println("the static method result is: " + h);
	}
	public static void main(String[] args) {
		Arguments c = new Arguments();
		c.days("monday");
		System.out.println("the first working day in a week is :" + c.a);
		
		c.month(12);
		System.out.println("the last month december is numbered as" +c.d);
		year(true);
		abd(88.18f);
		yz(65.66);
		c.calender(12);
		
	}

}
