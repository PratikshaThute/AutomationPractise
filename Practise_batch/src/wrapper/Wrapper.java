package wrapper;

public class Wrapper {

	public static void main(String[] args) {

//		to convert primitive datatype to wrapper class
		int x = 45;
		Integer y = Integer.valueOf(x);
		System.out.println(y);

		float j = 55f;
		Float k = Float.valueOf(j);
		System.out.println(k);

		char C = 'o';
		Character l = Character.valueOf(C);
		System.out.println(C);

		System.out.println("---------------------------------------");

//		to convert wrapper class to primitive datatype
		Integer a = new Integer(540);
		int b = a.intValue();
		System.out.println(b);

		Float c = new Float(23.21f);
		float d = c.floatValue();
		System.out.println(d);

		Character m = new Character('p');
		char n = m.charValue();
		System.out.println(n);
		
		int z = 20;
		Integer i = Integer.valueOf(z);
		System.out.println(i);
		
		Integer y1 = new Integer(45);
		int z1 = y1.intValue();
		System.out.println(z1);
	}

}
