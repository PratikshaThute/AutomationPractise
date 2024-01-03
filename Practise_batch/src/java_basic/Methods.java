package java_basic;

public class Methods {

//	instance method/ non static method/global method
//	 access modifier return type method name
	public void name() {
		System.out.println("pratiksha thute");
	}
	
//	static method
	public static void college() {
		System.out.println("COA,Nagpur");
	
	}
	
	public static void main(String[] args) {
		Methods c = new Methods();
		c.name();
		Methods p = new Methods();
		p.name();
//		 to access static method
		college();
		Methods.college();
	}

}
