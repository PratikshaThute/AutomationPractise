package casting;

public class Widening_C {

	public static void main(String[] args) {
		
		byte i = 12;
		short j = i;
		System.out.println("byte-short " + j);
		System.out.println("---------------------");

		int a = 55;
		long b = a;
		System.out.println("int - long " +b);
		
		System.out.println("---------------------");
		
		long c = 98;
		float d = c;
		System.out.println("long - float " + d);
		System.out.println("---------------------");
		
		short e = 25;
		double f=e;
		System.out.println("short - double " + f);
		System.out.println("---------------------");
		
		float g = 45.20f;
		double h = g;
		System.out.println("float - double " + h);
		
		System.out.println("---------------------");
		
		 
		
	}

}
