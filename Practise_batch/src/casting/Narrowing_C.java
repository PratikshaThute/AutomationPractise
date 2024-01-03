package casting;

public class Narrowing_C {

	public static void main(String[] args) {
		
		double a = 88.123;
		float b = (float) a;
		System.out.println("double - float " + b);
		System.out.println("------------------------------");
		
		long c = 45;
		short d =(short) c;
		System.out.println("long - short "+ d);
		System.out.println("------------------------------");
		
		int e = 250;
		byte f = (byte) e;
		System.out.println("int - byte "+ f);
		
		System.out.println("------------------------------");
		
		int g = 256;
		byte h = (byte) g;
		System.out.println("int - byte "+ h);
		System.out.println("------------------------------");
		
		int i = 257;
		byte j = (byte) i;
		System.out.println("int - byte "+ j);
		System.out.println("------------------------------");
		
		int k = 250;
		byte l = (byte) k;
		System.out.println("int - byte "+ k);
		System.out.println("------------------------------");

	}

}
