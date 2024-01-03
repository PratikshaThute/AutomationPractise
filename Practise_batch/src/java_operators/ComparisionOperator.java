package java_operators;

public class ComparisionOperator {

	public static void main(String[] args) {
		
//		greater than (>)
//		less than (<)
		
		int z = 100;
		int y = 96;
		boolean x = y>z;
		
//		print the variable in parenthesis
		System.out.println(x);
		
//		directly by comparison
		System.out.println(y<z);
		
	System.out.println("---------------------------------------------------------------------------------------------------------"); 
	
//		equal to ==
		int a = 56;
		int b = 56;;
		boolean c = a==b;
		System.out.println(c);
		
//		not equal to
		boolean h = a!=b;
		System.out.println(h);
		
		System.out.println("---------------------------------------------------------------------------------------------------------"); 
//		-----------------------------------------------------------------------------------------------------------
		
		float d = 12f;
		float e = 12f;
		
//		greater than equal to (>=)
		boolean f = d>=e;
		
//		less than equal to (<=)
		boolean g = d<=e;
	
		System.out.println(f);
		System.out.println(g);
		

	}

}
