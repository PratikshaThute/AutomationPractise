package debug;

public class DebugCode {

	String a;
	int d;
	static float h;

	//METHOD SIGNATURE : it is method name followed by the parameter type and is always present inside parenthesis
	// method signature is String i.e parameter type and parameter is b

		public void days(String b) {
			a=b;
			System.out.println(b);
		}
		
		// method signature is int i.e parameter type and parameter is m
		public void month(int m) {
			d=m;
			System.out.println(m);
		}
		
//		instance method and local variable
		public void calender(int n) {
			int o = n;
			System.out.println("the calender year has " + o + " months");
		}
		
//		static method and local variable
		// method signature is boolean i.e parameter type and parameter is k
		public static void year (boolean k){
			boolean u = k;
			System.out.println("the current year is 2023 : "+ u);
		}
		
		// method signature is double i.e parameter type and parameter is ij
		public static void yz(double ij) {
			double kl = ij;
			System.out.println("method yz : " + kl);
		}
		
//		static method and instance variable
//		 method signature is float i.e parameter type and parameter is g
		public static void abd(float g) {
			h=g;
			System.out.println("the static method result is: " + h);
		}
		public static void main(String[] args) {
			DebugCode c = new DebugCode();
			c.days("monday");
			System.out.println("the first working day in a week is :" + c.a);
			
			c.month(12);
			System.out.println("the last month december is numbered as" +c.d);
			year(true);
			abd(88.18f);
			yz(65.66);
			c.calender(12);
			
		}

//	right click toggle breakpoint
//		right click disable breakpoint
//		step into to enter inside method
//		step over to go through each line
//		click on resume to go from one breakpoint to another
//		click on red box to terminate
//		right click and debug as java application

	}


